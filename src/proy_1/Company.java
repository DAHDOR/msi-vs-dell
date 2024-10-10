package proy_1;

import org.jfree.data.xy.XYSeries;

public class Company extends Thread {
    int id;
    Storage storage;

    LinkedList<MotherboardDev> motherboardDevs = new LinkedList<>();;
    LinkedList<CPUDev> cpuDevs = new LinkedList<>();;
    LinkedList<RAMDev> ramDevs = new LinkedList<>();;
    LinkedList<PowerSupplyDev> powerSupplyDevs = new LinkedList<>();;
    LinkedList<GraphicsCardDev> graphicsCardDevs = new LinkedList<>();;
    LinkedList<Assemblers> Assemblers = new LinkedList<>();
    ProjectManager PM;
    Director director;

    Configuration config;
    Proyecto1GUI GUI;

    int daysForMotherboard, daysForCPU, ramsPerDay, powerSuppliesPerDay, daysPerGraphicsCard;
    int rawProfits, operativeCosts, utility, deductedFromPM;
    int pmFaults;
    int daysPassed = 0;

    int currentDaysUntilDeadline;

    boolean isRunning;
    boolean PMWatchingAnimes;

    XYSeries series;

    public Company(int id, String name, int carnetNumber, Specifications specs, Configuration config, Proyecto1GUI GUI) {
        this.id = id;
        this.storage = new Storage(id, specs, GUI);
        this.config = config;
        this.GUI = GUI;

        // Set daysForMotherboard, daysPerstage and ramsPerDay
        if (carnetNumber >= 0 && carnetNumber < 3) {
            daysForMotherboard = 2;
            daysForCPU = 2;
            ramsPerDay = 3;
        } else if (carnetNumber >= 3 && carnetNumber < 6) {
            daysForMotherboard = 3;
            daysForCPU = 3;
            ramsPerDay = 2;
        } else if (carnetNumber >= 6 && carnetNumber <= 9) {
            daysForMotherboard = 4;
            daysForCPU = 4;
            ramsPerDay = 1;
        }

        // Set powerSuppliesPerDay and daysPerGraphicsCard
        if (carnetNumber >= 0 && carnetNumber < 5) {
            powerSuppliesPerDay = 3;
            daysPerGraphicsCard = 3;
        } else if (carnetNumber >= 5 && carnetNumber <= 9) {
            powerSuppliesPerDay = 5;
            daysPerGraphicsCard = 2;
        }

        rawProfits = 0;
        operativeCosts = 0;
        utility = 0;

        currentDaysUntilDeadline = config.daysUntilDeadlineInit;

        series = new XYSeries(name);
        series.add(0, 0);
    }

    public boolean simulationRunning() {
        return isRunning;
    }

    public Storage getStorage() {
        return storage;
    }

    public boolean deadlineZero() {
        return currentDaysUntilDeadline == 0;
    }

    public int calculateDayCosts() {
        return config.nMotherboardDevs * 20 * 24 + config.nCPUDevs * 26 * 24 + config.nRAMDevs * 40 * 24
                + config.nPowerSupplyDevs * 16 * 24 + config.nGraphicsCardDevs * 34 * 24 + config.nAssemblers * 50 * 24 +
                40 * 24 + 60 * 24;
    }

    public void changeDeadline(String action) {
        if (action.equals("reduce")) {
            if (currentDaysUntilDeadline > 0) {
                currentDaysUntilDeadline--;
                daysPassed++;
                operativeCosts += calculateDayCosts();
                GUI.modCosts(id, operativeCosts);
                utility = rawProfits - operativeCosts;
                GUI.modUtilities(id, utility);
                series.add(daysPassed, utility);
            }
        } else if (action.equals("reset")) {
            currentDaysUntilDeadline = config.daysUntilDeadlineInit;
        }
        GUI.modDeadline(id, currentDaysUntilDeadline);
    }

    public void changePMActvity(boolean isWatchingAnimes) {
        PMWatchingAnimes = isWatchingAnimes;
        if (isWatchingAnimes) {
            GUI.modPmActivity(id, "viendo anime");
        } else {
            GUI.modPmActivity(id, "trabajando");
        }
    }

    public void caughtPM() {
        pmFaults++;
        deductedFromPM += 100;
        operativeCosts -= 100;
        GUI.modCosts(id, operativeCosts);
        GUI.modPmFaults(id, pmFaults, deductedFromPM);
    }

    public void deliverComputers() {
        rawProfits += storage.getComputers();
        GUI.modProfits(id, rawProfits);
    }

    public void changeDirectorActivity(String activity) {
        GUI.modDirectorActivity(id, activity);
    }

    public void addMotherboardDev() {
        if (isRunning && config.currentEmployees + 1 <= config.maxEmployees) {
            MotherboardDev newDev = new MotherboardDev(daysForMotherboard, this);
            motherboardDevs.append(newDev);
            newDev.start();
            config.nMotherboardDevs++;
            config.currentEmployees++;
            GUI.modMotherboardsDev(id, config.nMotherboardDevs);
        }
    }

    public void removeMotherboardDev() {
        if (isRunning && config.nMotherboardDevs != 1) {
            MotherboardDev dev = motherboardDevs.pop();
            dev.interrupt();
            config.nMotherboardDevs--;
            config.currentEmployees--;
            GUI.modMotherboardsDev(id, config.nMotherboardDevs);
        }
    }

    public void addCPUDev() {
        if (isRunning && config.currentEmployees + 1 <= config.maxEmployees) {
            CPUDev newDev = new CPUDev(daysForCPU, this);
            cpuDevs.append(newDev);
            newDev.start();
            config.nCPUDevs++;
            config.currentEmployees++;
            GUI.modCPUDev(id, config.nCPUDevs);
        }
    }

    public void removeCPUDev() {
        if (isRunning && config.nCPUDevs != 1) {
            CPUDev dev = cpuDevs.pop();
            dev.interrupt();
            config.nCPUDevs--;
            config.currentEmployees--;
            GUI.modCPUDev(id, config.nCPUDevs);
        }
    }

    public void addRAMDev() {
        if (isRunning && config.currentEmployees + 1 <= config.maxEmployees) {
            RAMDev newDev = new RAMDev(ramsPerDay, this);
            ramDevs.append(newDev);
            newDev.start();
            config.nRAMDevs++;
            config.currentEmployees++;
            GUI.modRAMDev(id, config.nRAMDevs);
        }
    }

    public void removeRAMDev() {
        if (isRunning && config.nRAMDevs != 1) {
            RAMDev dev = ramDevs.pop();
            dev.interrupt();
            config.nRAMDevs--;
            config.currentEmployees--;
            GUI.modRAMDev(id, config.nRAMDevs);
        }
    }

    public void addPowerSupplyDev() {
        if (isRunning && config.currentEmployees + 1 <= config.maxEmployees) {
            PowerSupplyDev newDev = new PowerSupplyDev(powerSuppliesPerDay, this);
            powerSupplyDevs.append(newDev);
            newDev.start();
            config.nPowerSupplyDevs++;
            config.currentEmployees++;
            GUI.modPowerSupplyDev(id, config.nPowerSupplyDevs);
        }
    }

    public void removePowerSupplyDev() {
        if (isRunning && config.nPowerSupplyDevs != 1) {
            PowerSupplyDev dev = powerSupplyDevs.pop();
            dev.interrupt();
            config.nPowerSupplyDevs--;
            config.currentEmployees--;
            GUI.modPowerSupplyDev(id, config.nPowerSupplyDevs);
        }
    }

    public void addGraphicsCardDev() {
        if (isRunning && config.currentEmployees + 1 <= config.maxEmployees) {
            GraphicsCardDev newDev = new GraphicsCardDev(daysPerGraphicsCard, this);
            graphicsCardDevs.append(newDev);
            newDev.start();
            config.nGraphicsCardDevs++;
            config.currentEmployees++;
            GUI.modGraphicsCardDev(id, config.nGraphicsCardDevs);
        }
    }

    public void removeGraphicsCardDev() {
        if (isRunning && config.nGraphicsCardDevs != 1) {
            GraphicsCardDev dev = graphicsCardDevs.pop();
            dev.interrupt();
            config.nGraphicsCardDevs--;
            config.currentEmployees--;
            GUI.modGraphicsCardDev(id, config.nGraphicsCardDevs);
        }
    }

    public void addAssembler() {
        if (isRunning && config.currentEmployees + 1 <= config.maxEmployees) {
            Assemblers newAssembler = new Assemblers(this);
            Assemblers.append(newAssembler);
            newAssembler.start();
            config.nAssemblers++;
            config.currentEmployees++;
            GUI.modAssemblers(id, config.nAssemblers);
        }
    }

    public void removeAssembler() {
        if (isRunning && config.nAssemblers != 1) {
            Assemblers Assembler = Assemblers.pop();
            Assembler.interrupt();
            config.nAssemblers--;
            config.currentEmployees--;
            GUI.modAssemblers(id, config.nAssemblers);
        }
    }

    @Override
    public void run() {
        isRunning = true;

        for (int i = 0; i < config.nMotherboardDevs; i++)
            motherboardDevs.append(new MotherboardDev(daysForMotherboard, this));

        for (int i = 0; i < config.nCPUDevs; i++)
            cpuDevs.append(new CPUDev(daysForCPU, this));

        for (int i = 0; i < config.nRAMDevs; i++)
            ramDevs.append(new RAMDev(ramsPerDay, this));

        for (int i = 0; i < config.nPowerSupplyDevs; i++)
            powerSupplyDevs.append(new PowerSupplyDev(powerSuppliesPerDay, this));

        for (int i = 0; i < config.nGraphicsCardDevs; i++)
            graphicsCardDevs.append(new GraphicsCardDev(daysPerGraphicsCard, this));

        for (int i = 0; i < config.nAssemblers; i++)
            Assemblers.append(new Assemblers(this));

        PM = new ProjectManager(this);
        director = new Director(this);

        for (int i = 0; i < config.nMotherboardDevs; i++)
            motherboardDevs.get(i).start();

        for (int i = 0; i < config.nCPUDevs; i++)
            cpuDevs.get(i).start();

        for (int i = 0; i < config.nRAMDevs; i++)
            ramDevs.get(i).start();

        for (int i = 0; i < config.nPowerSupplyDevs; i++)
            powerSupplyDevs.get(i).start();

        for (int i = 0; i < config.nGraphicsCardDevs; i++)
            graphicsCardDevs.get(i).start();

        for (int i = 0; i < config.nAssemblers; i++)
            Assemblers.get(i).start();

        PM.start();
        director.start();

        GUI.initEmployeesPanel();
    }
}
