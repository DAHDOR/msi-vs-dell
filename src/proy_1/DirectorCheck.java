package proy_1;

public class DirectorCheck extends Thread {
    Company company;
    boolean caughtPM;

    public DirectorCheck(Company company) {
        this.company = company;
        this.caughtPM = false;
    }

    @Override
    public void run() {
        while (!isInterrupted() && !caughtPM) {
            if (company.PMWatchingAnimes) {
                company.caughtPM();
                caughtPM = true;
            }
        }
    }
}
