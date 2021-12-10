package sec11.toStringExample;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);
        System.out.println(myPhone); //myPhone.toString()을 자동 호출에서 리턴값을 얻은 후 출력 (객체일 경우만)
    }
}
