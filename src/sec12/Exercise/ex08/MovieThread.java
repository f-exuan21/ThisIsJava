package sec12.Exercise.ex08;

public class MovieThread extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("동영상을 재생합니다.");
            //1
            /*try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                break;
            }*/

            //2
            /*if(this.isInterrupted()) {
                break;
            }*/

            //3
            if(Thread.interrupted()) {
                break;
            }
        }
    }
}
