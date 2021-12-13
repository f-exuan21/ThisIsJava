package sec12.sec06.stopAndInterrupt;

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printThread.setStop(true);
    }
}
