package sec14.example.ex05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
    private static int[] scores = { 10, 50, 3 };

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for(int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값 얻기
        int max = maxOrMin(
                (x, y) -> {
                    if(x < y) return y;
                    else return x;
                }
        );
        System.out.println("최댓값 : " + max);

        //최솟값 얻기
        int min = maxOrMin(
                (x, y) -> {
                    if(x < y) return x;
                    else return y;
                }
        );
        System.out.println("최솟값 : " + min);
    }
}
