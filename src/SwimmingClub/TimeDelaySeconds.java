package SwimmingClub;

import java.io.PrintStream;

public class TimeDelaySeconds {
    public static void main(String[] args) {
        int timeToWait = 0; // second
        System.out.println("Scanning");
        try {
            for (int i = 30; i >= timeToWait; i--) {
                Thread.sleep(1000);
                System.out.print("\r" + i + " ");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
