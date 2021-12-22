package sec18.sec04.ex04_fileReader;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/sec18/sec04/ex04_fileReader/FileReaderExample.java");

        int readCharNo;
        char[] cbuf = new char[100];
        String data = "";
        while((readCharNo = fr.read(cbuf)) != -1) {
            data += new String(cbuf, 0, readCharNo);
            System.out.println(data);
        }
        fr.close();
    }
}
