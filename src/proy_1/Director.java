package proy_1;

public class Director extends Thread {
    int secondsPerDay;
    Company company;

    public Director(Company company) {
        this.company = company;
        this.secondsPerDay = company.config.secondsPerDay;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                if (company.deadlineZero()) {
                    // Work 1 day to deliver Computers to the store
                    company.changeDirectorActivity("enviando computadora");
                    Thread.sleep(secondsPerDay * 1000);
                    company.deliverComputers();
                    company.changeDeadline("reset");
                } else {
                    company.changeDirectorActivity("haciendo labores administrativas");
                    int randomHour = (int) Math.floor(Math.random() * 24);
                    int restOfHours = 24 - randomHour;
                    Thread.sleep((secondsPerDay * 1000) / 24 * randomHour);

                    // Starts watching the PM
                    DirectorCheck dc = new DirectorCheck(company);
                    company.changeDirectorActivity("vigilando al PM");
                    dc.start();
                    // Wait 35 minutes
                    Thread.sleep((secondsPerDay * 1000) / 1440 * 35);
                    dc.interrupt();
                    Thread.sleep((secondsPerDay * 1000) / 24 * restOfHours);
                }
            }
        } catch (InterruptedException e) {
            // Thread killed
        }

    }
}
