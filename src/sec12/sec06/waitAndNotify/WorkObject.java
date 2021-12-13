package sec12.sec06.waitAndNotify;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("Thread의 methodA() 작업 실행");
        notify(); //일시 정지 상타에 있는 ThreadB를 실행 대기 상태로 만듦
        try {
            wait(); //ThreadA를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {}
    }

    public synchronized void methodB() {
        System.out.println("Thread의 methodB() 작업 실행");
        notify(); //일시 정지 상타에 있는 ThreadA를 실행 대기 상태로 만듦
        try {
            wait(); //ThreadB를 일시 정지 상태로 만듬
        } catch (InterruptedException e) {}
    }
}
