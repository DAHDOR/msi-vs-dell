package proy_1;

public class Configuration {
    int secondsPerDay;
    int daysUntilDeadlineInit;
    int nMotherboardDevs;
    int nCPUDevs;
    int nRAMDevs;
    int nPowerSupplyDevs;
    int nGraphicsCardDevs;
    int nAssemblers;
    int maxEmployees;
    int currentEmployees;

    public Configuration(int secondsPerDay, int daysUntilDeadlineInit, int nMotherboardDevs, int nCPUDevs,
            int nRAMDevs,
            int nPowerSupplyDevs, int nGraphicsCardDevs, int nAssemblers, int carnetNumber) {
        this.secondsPerDay = secondsPerDay;
        this.daysUntilDeadlineInit = daysUntilDeadlineInit;
        this.nMotherboardDevs = nMotherboardDevs;
        this.nCPUDevs = nCPUDevs;
        this.nRAMDevs = nRAMDevs;
        this.nPowerSupplyDevs = nPowerSupplyDevs;
        this.nGraphicsCardDevs = nGraphicsCardDevs;
        this.nAssemblers = nAssemblers;
        this.maxEmployees = carnetNumber + 12;
        this.currentEmployees = nMotherboardDevs + nCPUDevs + nRAMDevs + nPowerSupplyDevs + nGraphicsCardDevs + nAssemblers;
    }
}
