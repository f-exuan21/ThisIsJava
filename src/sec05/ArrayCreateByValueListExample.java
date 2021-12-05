package sec05;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        System.out.println("scores[0] : " + scores[0]);
        System.out.println("scores[1] : " + scores[1]);
        System.out.println("scores[2] : " + scores[2]);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        double avg = (double)sum / 3;
        System.out.println("평균 : " + avg);

    }

    public static class ArrayReferenceObjectExample {
        public static void main(String[] args) {
            String[] strArray = new String[3];
            strArray[0] = "Java";
            strArray[1] = "Java";
            strArray[2] = new String("Java");

            System.out.println( strArray[0] == strArray[1] );
            System.out.println( strArray[0] == strArray[2] );
            System.out.println( strArray[0].equals(strArray[2]) );
        }
    }
}
