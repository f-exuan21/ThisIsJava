package operator_03;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVal1 = "신민철";
        String strVal2 = "신민철";
        String strVal3 = new String("신민철");

        System.out.println(strVal1 == strVal2);
        System.out.println(strVal1 == strVal3);
        System.out.println();
        System.out.println(strVal1.equals(strVal2));
        System.out.println(strVal1.equals(strVal3));
    }
}
