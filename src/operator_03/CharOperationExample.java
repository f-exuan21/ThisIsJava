package operator_03;

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1; // 리터럴 간의 연산은 타입 변화 없이 해당 타입으로 계산된다.
        char c2 = 'A';
        //char c3 = c2 + 1; // 산출 타입이 int가 되기 때문에 컴파일 에러가 난다.
        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
    }
}
