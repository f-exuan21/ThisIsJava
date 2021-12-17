package sec15.sec04.ex01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); //"홍길동"키가 이미 있기 때문에 값만 대치
        System.out.println("총 Entry 수 : " + map.size());

        System.out.println("\t 홍길동 : " + map.get("홍길동"));
        System.out.println();

        //객체를 하나씩 처리 : keySet() 사용
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        //객체 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());

        //객체를 하나씩 처리 : entrySet() 사용
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        //객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 갯수 : " + map.size());
    }
}
