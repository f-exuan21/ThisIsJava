package sec12.sec05;

//타겟 스레드
public class TargetThread extends Thread{

    /**
    * 10억번 루핑을 돌게 해서 RUNNABLE 상태를 유지하고, 1.5초간 TIMED_WAITING 상태를 유지한다.
    * 그리고 다시 10억번 루핑을 돌게 해서 RUNNABLE 상태를 유지한다.
    * */
    @Override
    public void run() {
        for(long i = 0; i < 1000000000; i++) {}

        try {
            Thread.sleep(1500);
        } catch(Exception e) {}

        for(long i = 0; i < 1000000000; i++) {}
    }
}
