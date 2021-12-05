package sec03;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit;
        System.out.println("사과 한개에서 ");
        System.out.println("0.7 조각을 빼면, ");
        System.out.println(result + " 조각이 남는다."); // 부동소수점은 0.1을 정확하게 표현할 수 없다.
    }
}
