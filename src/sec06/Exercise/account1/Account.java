package sec06.Exercise.account1;

public class Account {
    //필드
    private int balance;
    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;

    //생성자

    //메소드
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
            return;
        }
        this.balance = balance;
    }
}
