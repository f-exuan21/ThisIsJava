package sec15.example.ex09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            int score = entry.getValue();
            if(score > maxScore) {
                maxScore = score;
                name = entry.getKey();
            }
            totalScore += score;
        }
        System.out.println("평균 점수 : " + (totalScore / map.size()));
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("최고 점수를 받은 아이디 : " + name);
    }
}
