package sec18.sec05.ex06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("src/sec18/sec05/ex06_datainputstream_dataoutputstream/primitive.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("홍길동");
        dos.writeDouble(95.5);
        dos.writeInt(1);

        dos.writeUTF("감자바");
        dos.writeDouble(90.3);
        dos.writeInt(2);

        dos.flush(); dos.close(); fos.close(); //-> 바이트 데이터가 들어가 있기 때문에 문자가 깨져보인다.

        FileInputStream fis = new FileInputStream("src/sec18/sec05/ex06_datainputstream_dataoutputstream/primitive.dat");
        DataInputStream dis = new DataInputStream(fis);

        for(int i=0; i<2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }

        dis.close(); fis.close();
    }
}
