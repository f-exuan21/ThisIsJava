package sec18.sec08.ex01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class UdpReceiveExample {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(5001);

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("[수신 시작]");
                try {
                    while (true) {
                        DatagramPacket packet = new DatagramPacket(
                                new byte[100], 100
                        );
                        datagramSocket.receive(packet);

                        String data = new String(packet.getData(), 0, packet.getLength(), StandardCharsets.UTF_8);
                        System.out.println("[바은 내용 : " + packet.getSocketAddress() + "] " + data);
                    }
                } catch(Exception e) {
                    System.out.println("[수신 종료]");
                }
            }
        };

        thread.start();

        Thread.sleep(10000); //10초동안 메인 스레드 정지
        datagramSocket.close(); //10초후에 종료
    }
}
