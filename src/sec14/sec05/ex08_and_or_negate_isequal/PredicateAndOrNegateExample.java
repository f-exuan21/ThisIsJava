package sec14.sec05.ex08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        //2의 배수를 검사
        IntPredicate predicateA = a -> a % 2 == 0;

        //3의 배수를 검새
        IntPredicate predicateB = a -> a % 3 == 0;

        IntPredicate predicateAB = predicateA.and(predicateB);
        boolean result = predicateAB.test(9);
        System.out.println("9는 2와 3의 배수입니까? " + result);

        predicateAB = predicateA.or(predicateB);
        result = predicateAB.test(9);
        System.out.println("9는 2 또는 3의 배수입니까? " + result);

        predicateAB = predicateA.negate();
        result = predicateAB.test(9);
        System.out.println("9는 홀수 입니까? " + result);
    }
}
