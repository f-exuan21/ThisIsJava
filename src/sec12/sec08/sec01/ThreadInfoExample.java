package sec12.sec08.sec01;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces(); //stack에 있는 모든 스레드의 정보를 가져옴
        Set<Thread> threads = map.keySet(); //현재 사용되는 모든 스레드
        for(Thread thread : threads) {
            System.out.println("Name : " + thread.getName() + (thread.isDaemon() ? "(데몬)" : "(주)"));
            System.out.println("\t" + "소속그룹 : " + thread.getThreadGroup().getName());
        }
    }
}
