package sec12.sec02;

import java.awt.*;

public class BeepPrintExample1 {
    public static void main(String[] args) {
        /*Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
        }*/

        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}
