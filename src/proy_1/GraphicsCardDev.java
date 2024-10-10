package proy_1;

public class GraphicsCardDev extends Thread {
    Storage storage;
    int daysPerGraphicsCard;
    int secondsPerDay;

    public GraphicsCardDev(int daysPerGraphicsCard, Company company) {
        this.storage = company.getStorage();
        this.daysPerGraphicsCard = daysPerGraphicsCard;
        this.secondsPerDay = company.config.secondsPerDay;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                // Sleep while producing a narrative
                Thread.sleep(secondsPerDay * 1000 * this.daysPerGraphicsCard);
                storage.addGraphicsCards();
            }
        } catch (InterruptedException e) {
            // Thread killed
        }
    }
}
