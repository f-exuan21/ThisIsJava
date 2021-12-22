package sec18.sec04.ex03_fileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "src/sec18/sec04/ex03_fileOutputStream/apple.jpg";
        FileInputStream fis = new FileInputStream(originalFileName);

        String targetFileName = "src/sec18/sec04/ex03_fileOutputStream/apple_copy.jpg";
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while((readByteNo = fis.read(readBytes)) != -1) {
            fos.write(readBytes, 0, readByteNo);
        }

        fos.flush();
        fos.close();
        fis.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}
