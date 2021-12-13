package sec12.sec06.stopAndInterrupt;

public class PrintThread2 extends Thread{
    /**
     * sleep() 메소드로 일시 정지 상태가 될 때 InterruptedException을 발생시켜 종료시킨다.
     * */
    /*@Override
    public void run() {
        try {
            while(true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {}
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }*/

    /**
    * interrupted() 사용을 통해 종료시킨다.
    * */
    @Override
    public void run() {
        while(true) {
            System.out.println("실행 중");
            if(Thread.interrupted()) {
                break;
            }
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
