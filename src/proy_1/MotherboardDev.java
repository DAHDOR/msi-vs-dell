package proy_1;

public class MotherboardDev extends Thread {
    Storage storage;
    int daysPerMotherboard;
    int secondsPerDay;

    public MotherboardDev(int daysPerMotherboard, Company company) {
        this.storage = company.getStorage();
        this.daysPerMotherboard = daysPerMotherboard;
        this.secondsPerDay = company.config.secondsPerDay;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // Sleep while producing a Motherboard
                Thread.sleep(secondsPerDay * 1000 * this.daysPerMotherboard);
                storage.addMotherboards();
            }
        } catch (InterruptedException e) {
            // Thread killed
        }
    }
}
