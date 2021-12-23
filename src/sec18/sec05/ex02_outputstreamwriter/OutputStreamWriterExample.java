package sec18.sec05.ex02_outputstreamwriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/sec18/sec05/ex02_outputstreamwriter/file.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
        writer.write(data);

        writer.flush();
        writer.close();
        fos.close();

        System.out.println("파일 저장 완료");
    }
}
