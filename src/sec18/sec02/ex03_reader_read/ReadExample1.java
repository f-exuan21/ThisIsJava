package sec18.sec02.ex03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("src/sec18/sec02/ex03_reader_read/test.txt");
        int readData;
        while((readData = reader.read()) != -1) {
            System.out.println((char)readData);
        }
        reader.close();
    }
}
