package sec03;

public class OverflowExample {
    public static void main(String[] args) {
        int x = 1000000;
        int y = 1000000;
        int z = x * y; // int값에 저장할 수 있는 값의 범위를 초과
        System.out.println(z);

        long lx = 1000000;
        long ly = 1000000;
        long lz = lx * ly;
        System.out.println(lz);
    }
}
