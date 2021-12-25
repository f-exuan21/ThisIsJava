package sec18.exercise.ex11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ClientExample {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5001);
        OutputStream os = socket.getOutputStream();

        String filePath = "src/sec18/exercise/ex11/file.txt";
        File file = new File(filePath);

        String fileName = file.getName();
        byte[] fileNameBytes = fileName.getBytes(StandardCharsets.UTF_8);
        fileNameBytes = Arrays.copyOf(fileNameBytes, 100);
        os.write(fileNameBytes);

        System.out.println("[파일 보내기 시작]" + file);
        FileInputStream fis = new FileInputStream(file);
        int readByteNo = -1;
        byte[] readBytes = new byte[1000];
        while((readByteNo = fis.read(readBytes)) != -1) {
            os.write(readBytes, 0, readByteNo);
        }
        os.flush();

        System.out.println("[파일 보내기 완료]");

        fis.close();
        os.close();
        socket.close();
    }
}
