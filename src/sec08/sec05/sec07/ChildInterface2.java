package sec08.sec05.sec07;

public interface ChildInterface2 extends ParentInterface {
    @Override
    default void method2() {}

    public void method3();
}
