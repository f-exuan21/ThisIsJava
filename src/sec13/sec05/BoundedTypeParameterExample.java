package sec13.sec05;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        //int result1 = Util.compare("a", "b"); String은 Number타입이 아님
        int result1 = Util.compare(10, 20);
        System.out.println(result1);
        int result2 = Util.compare(4.5, 3);
        System.out.println(result2);
    }
}