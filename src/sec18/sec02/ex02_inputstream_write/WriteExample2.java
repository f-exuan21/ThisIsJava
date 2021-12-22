package sec18.sec02.ex02_inputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("src/sec18/sec02/ex01_inputstream_read/test1.txt");
        byte[] data = "EDF".getBytes();
        os.write(data);
        os.flush();
        os.close();
    }
}
