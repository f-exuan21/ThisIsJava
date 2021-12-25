package sec18.exercise.ex07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filePath = "src/sec18/sec05/ex04_bufferedreader/BufferedReaderExample.java";

        FileReader reader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(reader);

        int i = 1;
        String data = null;
        while((data=br.readLine()) != null) {
            System.out.println(i + ": " + data);
            i++;
        }

        br.close();
        reader.close();
    }
}
