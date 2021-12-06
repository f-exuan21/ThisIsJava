package sec07.sec07.sec05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(); //자동 타입 변환
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        //parent.method3(); 사용불가능
        //parent.field2 = "data2"; 사용불가능

        Child child = (Child) parent;
        child.field2 = "yyy";
        child.method3();
    }
}
