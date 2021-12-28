package sec19.sec04.ex02_file_copy;

import java.nio.file.*;

public class FilesCopyMethodExample {
    public static void main(String[] args) throws Exception {
        Path from = Paths.get("src/sec19/sec04/ex02_file_copy/house.jpeg");
        Path to = Paths.get("src/sec19/sec04/ex02_file_copy/house2.jpeg");

        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("파일 복사 성공");
    }
}
