package sec11.newInstanceExample;

public class NewInstanceExample {
    public static void main(String[] args) {
        try {
            //Class clazz = Class.forName("sec11.newInstanceExample.SendAction");
            Class clazz = Class.forName("sec11.newInstanceExample.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.execute();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
