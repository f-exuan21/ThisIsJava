package sec12.sec02;

import java.awt.*;

public class BeepPrintExample3 {
    //람다식 이용
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        for(int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}
