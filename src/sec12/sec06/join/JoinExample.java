package sec12.sec06.join;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.run();

        try {
            sumThread.join();
        } catch (InterruptedException e) {
        }

        System.out.println("1~100 합 : " + sumThread.getSum());
    }
}
