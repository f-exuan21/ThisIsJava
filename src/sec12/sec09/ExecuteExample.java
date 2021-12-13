package sec12.sec09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); //최대 스레드 수가 2인 스레드풀 생성
        //ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0; i<10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 쓰레드 개수 : " + poolSize + "] 작업 스레드 이름 : " + threadName);
                    int value = Integer.parseInt("삼"); //일부러 에러 발생
                }
            };
            //executorService.execute(runnable);
            executorService.submit(runnable);
            Thread.sleep(100);
        }
        executorService.shutdown();
    }
}
