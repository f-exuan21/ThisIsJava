package sec18.sec05.ex08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/sec18/sec05/ex08_objectinputstream_objectoutputstream/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ClassC classC = (ClassC) ois.readObject();
        System.out.println("field1 : " + classC.field1);
    }
}
