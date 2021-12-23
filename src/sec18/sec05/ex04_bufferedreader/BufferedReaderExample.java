package sec18.sec05.ex04_bufferedreader;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is); //바이트기반 스트림을 문자 기반 스트림으로 변환
        BufferedReader br = new BufferedReader(reader); //버퍼를 제공

        System.out.print("입력 : ");
        String lineString = br.readLine();

        System.out.println("출력 : " + lineString);

        br.close();
        reader.close();
        is.close();
    }
}
