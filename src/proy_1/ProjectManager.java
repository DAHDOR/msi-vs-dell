package proy_1;

public class ProjectManager extends Thread {
    int hoursWorked;
    int secondsPerDay;
    Company company;

    public ProjectManager(Company company) {
        this.company = company;
        hoursWorked = 0;
        this.secondsPerDay = company.config.secondsPerDay;
    }

    @Override
    public void run() {
        double milisecondsPerHalfHour = Math.ceil(secondsPerDay * 1000 / 48);

        try {
            while (!Thread.currentThread().isInterrupted()) {
                if (hoursWorked < 16) {
                    // Watching Anime
                    company.changePMActvity(true);
                    Thread.sleep((long) milisecondsPerHalfHour);
                    // Working
                    company.changePMActvity(false);
                    Thread.sleep((long) milisecondsPerHalfHour);
                    hoursWorked++;
                } else {
                    // Work for 8 hours
                    Thread.sleep((long) (milisecondsPerHalfHour * 16));
                    company.changeDeadline("reduce");
                    hoursWorked = 0;
                }
            }
        } catch (InterruptedException e) {
            // Thread killed
        }

    }
}
