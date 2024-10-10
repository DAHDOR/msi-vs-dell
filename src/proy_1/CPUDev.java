package proy_1;

public class CPUDev extends Thread {
    Storage storage;
    int daysPerCPU;
    int secondsPerDay;

    public CPUDev(int daysPerCPU, Company company) {
        this.storage = company.getStorage();
        this.daysPerCPU = daysPerCPU;
        this.secondsPerDay = company.config.secondsPerDay;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // Sleep while producing a CPU
                Thread.sleep(secondsPerDay * 1000 * this.daysPerCPU);
                storage.addCPUs();
            }
        } catch (InterruptedException e) {
            // Thread killed
        }
    }
}