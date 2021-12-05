package sec04;

public class ForFloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) { // 초기화식에서 루프 카운트 변수를 선언할 때 부동소수점 타입을 사용하지 말아야 한다.
            System.out.println(x);
        }
    }
}
