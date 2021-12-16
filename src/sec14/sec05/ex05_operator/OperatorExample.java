package sec14.sec05.ex05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
    private static int[] scores = { 92, 95, 87 };

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for(int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        //최댓값
        int max = maxOrMin((x, y) -> {
            if(x > y) return x;
            else return y;
        });
        System.out.println("최대값 : " + max);

        //최솟값
        int min = maxOrMin((x, y) -> {
            if(x < y) return x;
            else return y;
        });
        System.out.println("최솟값 : " + min);
    }
}
