package sec18.sec02.ex01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("src/sec18/sec02/ex01_inputstream_read/test.txt");
        int readByteNo;
        byte[] readBytes = new byte[3];
        String data = "";
        while((readByteNo = is.read(readBytes)) != -1) {
            System.out.println(readByteNo);
            data += new String(readBytes, 0, readByteNo);
        }
        System.out.println(data);
        is.close();
    }
}
