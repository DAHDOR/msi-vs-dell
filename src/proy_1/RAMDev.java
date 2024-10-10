package proy_1;

public class RAMDev extends Thread {
    Storage storage;
    int ramsPerDay;
    int secondsPerDay;

    public RAMDev(int ramsPerDay, Company company) {
        this.storage = company.getStorage();
        this.ramsPerDay = ramsPerDay;
        this.secondsPerDay = company.config.secondsPerDay;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // Sleep while producing a RAM
                Thread.sleep(secondsPerDay * 1000);
                storage.addRAMs(ramsPerDay);
            }
        } catch (InterruptedException e) {
            // Thread killed
        }
    }
}
