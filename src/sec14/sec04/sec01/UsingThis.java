package sec14.sec04.sec01;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            //람다식
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField : " + outterField);
                System.out.println("outterFiled : " + UsingThis.this.outterField + "\n");

                System.out.println("innerField : " + innerField);
                System.out.println("innerField : " + this.innerField + "\n");
            };
            fi.method();
        }
    }
}
