package sec11.newInstanceExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            //Class clazz = Class.forName("sec11.newInstanceExample.SendAction");
            Class clazz = Class.forName("sec11.newInstanceExample.ReceiveAction");
            //Action action = (Action) clazz.newInstance(); //deprecated 되었음. => 이제는 생성자를 통해 만들어야함.
            Constructor constructor = clazz.getConstructor();
            Action action = (Action) constructor.newInstance();
            action.execute();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
