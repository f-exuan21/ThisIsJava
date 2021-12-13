package sec12.sec06.stopAndInterrupt;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt(); //스레디를 종료시키기 위해 InterruptedException을 발생시킴
    }
}
