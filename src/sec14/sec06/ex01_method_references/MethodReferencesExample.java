package sec14.sec06.ex01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        //정적 메소드 참조
        operator = (x, y) -> Calculaotr.staticMethod(x, y);
        System.out.println("결과 1 : " + operator.applyAsInt(1, 2));

        operator = Calculaotr :: staticMethod;
        System.out.println("결과 2 : " + operator.applyAsInt(1, 2));

        //인스턴스 메소드 참조
        Calculaotr obj = new Calculaotr();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과 3 : " + operator.applyAsInt(5, 6));

        operator = obj :: instanceMethod;
        System.out.println("결과 4 : " + operator.applyAsInt(5, 6));
    }
}
