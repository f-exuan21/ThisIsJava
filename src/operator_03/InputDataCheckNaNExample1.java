package operator_03;

public class InputDataCheckNaNExample1 {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput); // 입력값을 double로 변환

        double currentBalance = 10000.0;

        currentBalance += val;
        System.out.println(currentBalance);
    }
}
