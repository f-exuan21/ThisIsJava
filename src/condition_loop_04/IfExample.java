package condition_loop_04;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }

        if(score < 90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다."); // 중괄호에 포함되지 않았기 때문에 출력된다.
    }
}