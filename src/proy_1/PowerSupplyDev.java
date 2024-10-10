package proy_1;

public class PowerSupplyDev extends Thread {
    Storage storage;
    int powerSuppliesPerDay;
    int secondsPerDay;

    public PowerSupplyDev(int powerSuppliesPerDay, Company company) {
        this.storage = company.getStorage();
        this.powerSuppliesPerDay = powerSuppliesPerDay;
        this.secondsPerDay = company.config.secondsPerDay;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // Sleep while producing a narrative
                Thread.sleep(secondsPerDay * 1000);
                storage.addPowerSupplies(powerSuppliesPerDay);
            }
        } catch (InterruptedException e) {
            // Thread killed
        }
    }
}