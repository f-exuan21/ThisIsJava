package sec04.Exercise;

public class Exercise04 {
    public static void main(String[] args) {
        int rand1;
        int rand2;

        while (true) {
            rand1 = (int)(Math.random() * 6) + 1;
            rand2 = (int)(Math.random() * 6) + 1;
            System.out.println("rand1 : " + rand1 + " rand2 : " + rand2);
            if (rand1 + rand2 == 5) {
                break;
            }
        }
    }
}
