package proy_1;

public class Assemblers extends Thread {
    Storage storage;
    int secondsPerDay;

    public Assemblers(Company company) {
        this.storage = company.getStorage();
        this.secondsPerDay = company.config.secondsPerDay;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                storage.getResources();
                // Sleep while making a game
                Thread.sleep(secondsPerDay * 1000);
                storage.addComputer();
            }
        } catch (InterruptedException e) {
            // Thread killed
        }
    }
}
