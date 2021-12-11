package sec11.Exercise.ex08;

import java.util.StringTokenizer;

public class SplitExample {
    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";

        //방법1 (split() 메소드 이용)
        String[] strs = str.split(",");
        for(String s : strs) {
            System.out.println(s);
        }

        System.out.println();

        //방법1 (StringTokenizer 이용)
        StringTokenizer st=  new StringTokenizer(str, ",");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
