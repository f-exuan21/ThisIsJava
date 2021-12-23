package sec18.sec05.ex08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/sec18/sec05/ex08_objectinputstream_objectoutputstream/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Child child = new Child();
        child.field1 = "홍길동";
        child.field2 = "홍삼원";
        oos.writeObject(child);
        oos.flush(); oos.close(); fos.close();

        FileInputStream fis = new FileInputStream("src/sec18/sec05/ex08_objectinputstream_objectoutputstream/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Child v = (Child) ois.readObject();
        System.out.println("field1 : " + v.field1);
        System.out.println("field2 : " + v.field2);
        ois.close(); fis.close();
    }
}
