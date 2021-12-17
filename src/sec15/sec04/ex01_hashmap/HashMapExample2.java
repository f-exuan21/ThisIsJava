package sec15.sec04.ex01_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(1, "홍길동"), 95); //동등 객체

        System.out.println("총 Entry 수 : " + map.size());
    }
}
