package sec18.sec04.ex05_fileWriter;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) throws Exception {
        File file = new File("src/sec18/sec04/ex05_fileWriter/file.txt");
        FileWriter fw = new FileWriter(file);

        fw.write("FileWriter는 한글로 된 " + "\r\n");
        fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
        fw.flush();
        fw.close();
        System.out.println("파일에 저장되었습니다.");
    }
}
