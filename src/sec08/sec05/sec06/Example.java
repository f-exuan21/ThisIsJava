package sec08.sec05.sec06;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA(); //InterfaceA는 methodA만 호출 가능
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB(); //InterfaceB는 methodB만 호출 가능
        System.out.println();

        InterfaceC ic = impl; //InterfaceC는 세개 다 호출 가능
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
