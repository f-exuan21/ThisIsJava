package operator_03;

public class DoubleAccuracyTest {
    public static void main(String[] args) {
        long test = Double.doubleToLongBits(0.3);
        System.out.println(Long.toBinaryString(test));

        double test2 = 1 - 0.7;
        long test3 = Double.doubleToLongBits(test2);
        System.out.println(Long.toBinaryString(test3));
    }
}

// 00111111 11010011 00110011 00110011 00110011 00110011 00110011 00110011
// 00111111 11010011 00110011 00110011 00110011 00110011 00110011 00110100