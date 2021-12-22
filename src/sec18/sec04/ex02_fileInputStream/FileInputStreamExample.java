package sec18.sec04.ex02_fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/sec18/sec04/ex02_fileInputStream/FileInputStreamExample.java");
            int data;

            while ((data = fis.read()) != -1) {
                System.out.write(data);
            }
            System.out.flush();
            fis.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
