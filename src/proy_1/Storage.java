package proy_1;

import java.util.concurrent.Semaphore;

public class Storage {
    int id;
    Specifications specs;
    Proyecto1GUI GUI;

    Semaphore semStorage = new Semaphore(1);

    Semaphore semCurrentMotherboards = new Semaphore(0);
    Semaphore semCurrentCPUs = new Semaphore(0);
    Semaphore semCurrentRAMs = new Semaphore(0);
    Semaphore semCurrentPowerSupplies = new Semaphore(0);
    Semaphore semCurrentGraphicsCards = new Semaphore(0);

    Semaphore semMaxMotherboards = new Semaphore(25);
    Semaphore semMaxCPUs = new Semaphore(20);
    Semaphore semMaxRAMs = new Semaphore(55);
    Semaphore semMaxPowerSupplies = new Semaphore(35);
    Semaphore semMaxGraphicsCards = new Semaphore(10);

    int motherboards, cpus, rams, powerSupplies, graphicsCards;
    int computers, computersWithGraphicsCard, currentComputersBeforeGraphicsCard;

    public Storage(int id, Specifications specs, Proyecto1GUI GUI) {
        this.id = id;
        this.specs = specs;
        this.GUI = GUI;
        this.motherboards = 0;
        this.cpus = 0;
        this.rams = 0;
        this.powerSupplies = 0;
        this.graphicsCards = 0;
        this.computers = 0;
        this.computersWithGraphicsCard = 0;
        this.currentComputersBeforeGraphicsCard = 0;
    }

    public void addMotherboards() {
        try {
            semMaxMotherboards.acquire();
            semStorage.acquire();
            motherboards++;
            GUI.modMotherboardAmount(id, motherboards);
            semStorage.release();
            semCurrentMotherboards.release();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }

    public void addCPUs() {
        try {
            semMaxCPUs.acquire();
            semStorage.acquire();
            cpus++;
            GUI.modCPUAmount(id, cpus);
            semStorage.release();
            semCurrentCPUs.release();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }

    public void addRAMs(int ramsPerDay) {
        try {
            semMaxRAMs.acquire(ramsPerDay);
            semStorage.acquire();
            rams += ramsPerDay;
            GUI.modRAMAmount(id, rams);
            semStorage.release();
            semCurrentRAMs.release(ramsPerDay);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }

    public void addPowerSupplies(int powerSuppliesPerDay) {
        try {
            semMaxPowerSupplies.acquire(powerSuppliesPerDay);
            semStorage.acquire();
            powerSupplies += powerSuppliesPerDay;
            GUI.modPowerSuppliesAmount(id, powerSupplies);
            semStorage.release();
            semCurrentPowerSupplies.release(powerSuppliesPerDay);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }

    public void addGraphicsCards() {
        try {
            semMaxGraphicsCards.acquire();
            semStorage.acquire();
            graphicsCards++;
            GUI.modGraphicsCardsAmount(id, graphicsCards);
            semStorage.release();
            semCurrentGraphicsCards.release();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }

    public void getResources() {
        try {
            semCurrentMotherboards.acquire(specs.motherboards);
            semCurrentCPUs.acquire(specs.cpus);
            semCurrentRAMs.acquire(specs.rams);
            semCurrentPowerSupplies.acquire(specs.powerSupplies);
            semStorage.acquire();
            motherboards -= specs.motherboards;
            cpus -= specs.cpus;
            rams -= specs.rams;
            powerSupplies -= specs.powerSupplies;
            GUI.modMotherboardAmount(id, motherboards);
            GUI.modCPUAmount(id, cpus);
            GUI.modRAMAmount(id, rams);
            GUI.modPowerSuppliesAmount(id, powerSupplies);
            semStorage.release();

            semMaxMotherboards.release(specs.motherboards);
            semMaxCPUs.release(specs.cpus);
            semMaxRAMs.release(specs.rams);
            semMaxPowerSupplies.release(specs.powerSupplies);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }

    public void addComputer() {
        try {
            semStorage.acquire();
            if (currentComputersBeforeGraphicsCard != 0
                    && currentComputersBeforeGraphicsCard % specs.computersBeforeGraphicsCard == 0) {
                // Temporaly release the drive semaphore to wait for the graphicsCards
                semStorage.release();
                semCurrentGraphicsCards.acquire(specs.graphicsCards);

                // Adquire the drive lock again before modifying the values
                semStorage.acquire();
                computersWithGraphicsCard++;
                graphicsCards -= specs.graphicsCards;
                currentComputersBeforeGraphicsCard = 0;

                semMaxGraphicsCards.release(specs.graphicsCards);

                GUI.modComputersGraphicsCardsAmount(id, computersWithGraphicsCard);
                GUI.modGraphicsCardsAmount(id, graphicsCards);
            } else {
                computers++;
                currentComputersBeforeGraphicsCard++;
                GUI.modComputersAmount(id, computers);
            }

            semStorage.release();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
    }

    public int getComputers() {
        int localComputers = 0, localComputersWithGraphicsCard = 0;

        try {
            semStorage.acquire();
            localComputers = computers;
            localComputersWithGraphicsCard = computersWithGraphicsCard;
            computers = 0;
            computersWithGraphicsCard = 0;
            GUI.modComputersAmount(id, 0);
            GUI.modComputersGraphicsCardsAmount(id, 0);
            semStorage.release();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        return localComputers * specs.computerProfit + localComputersWithGraphicsCard * specs.computerWithGraphicsCardProfit;
    }
}
