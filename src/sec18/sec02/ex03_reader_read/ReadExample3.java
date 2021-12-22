package sec18.sec02.ex03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("src/sec18/sec02/ex03_reader_read/test.txt");
        int readCharNo;
        char[] cbuf = new char[4];
        readCharNo = reader.read(cbuf, 1, 2);
        for(int i=0; i<cbuf.length; i++) {
            System.out.println(cbuf[i]);
        }
        reader.close();
    }
}
