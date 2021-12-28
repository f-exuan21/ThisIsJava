package sec19.sec02.ex04_watchservice;

import java.nio.file.*;
import java.util.List;

import java.nio.file.WatchEvent.*;

public class WatchServiceExample {
    static class WatchServiceThread extends Thread {
        @Override
        public void run() {
            try {
                WatchService watchService = FileSystems.getDefault().newWatchService();
                Path directory = Paths.get("src/sec19/sec02/ex03_filedirectory");
                directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                                                StandardWatchEventKinds.ENTRY_DELETE,
                                                StandardWatchEventKinds.ENTRY_MODIFY);
                while(true) {
                    WatchKey watchKey = watchService.take();
                    List<WatchEvent<?>> list = watchKey.pollEvents();
                    for(WatchEvent watchEvent : list) {
                        //이벤트 종류 얻기
                        Kind kind = watchEvent.kind();
                        //감지된 path 얻기
                        Path path = (Path)watchEvent.context();
                        if(kind == StandardWatchEventKinds.ENTRY_CREATE) {
                            System.out.println("파일 생성됨 -> " + path.getFileName() + "\n");
                        } else if(kind == StandardWatchEventKinds.ENTRY_DELETE) {
                            System.out.println("파일 삭제됨 -> " + path.getFileName() + "\n");
                        } else if(kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                            System.out.println("파일 수정됨 -> " + path.getFileName() + "\n");
                        } else if(kind == StandardWatchEventKinds.OVERFLOW) {}
                    }
                    boolean valid = watchKey.reset();
                    if(!valid) { break; }
                }
            } catch(Exception e) {}
        }
    }

    public static void main(String[] args) {
        WatchServiceThread wt = new WatchServiceThread();
        wt.start();
    }
}
