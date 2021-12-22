package sec18.sec02.ex04_writer_write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("src/sec18/sec02/ex04_writer_write/test.txt");
        char[] data = "홍길동".toCharArray();
        for(int i=0; i<data.length; i++) {
            writer.write(data[i]);
        }
        writer.flush();
        writer.close();
    }
}
