package sec19.sec09.ex01_udpchannel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;

public class UdpReceiveExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        DatagramChannel datagramChannel = DatagramChannel.open(StandardProtocolFamily.INET);
        datagramChannel.bind(new InetSocketAddress(5001));

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("[수신 시작]");
                try {
                    while(true) {
                        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
                        SocketAddress socketAddress = datagramChannel.receive(byteBuffer);
                        byteBuffer.flip();

                        Charset charset = Charset.defaultCharset();
                        String data = charset.decode(byteBuffer).toString();
                        System.out.println("[받은 내용] " + data);
                    }
                } catch(Exception e) {
                    System.out.println("[수신 종료]");
                }
            }
        };
        thread.start();

        Thread.sleep(10000);
        datagramChannel.close();
    }
}
