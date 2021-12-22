package sec18.sec02.ex02_inputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("src/sec18/sec02/ex01_inputstream_read/test1.txt");
        byte[] data = "ABC".getBytes();
        for(int i=0; i<data.length; i++) {
            os.write(data[i]);
        }
        os.flush();
        os.close();
    }
}
