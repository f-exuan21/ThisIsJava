package sec12.sec06.sleep;

public class SleepExample {
    // 3초 주기로 10번 출력
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {}
        }
    }
}
