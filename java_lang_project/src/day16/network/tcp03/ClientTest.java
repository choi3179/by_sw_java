package day16.network.tcp03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {       // Socket 1개 필요
    public static void main(String[] args) {

        Socket s = null;
        try{
            s= new Socket("192.168.0.21", 9000);   // 테스트 하는 서버쪽 코드의 포트와 맞춰줌
            InputStream is = s.getInputStream();    // read 객체
            OutputStream os = s.getOutputStream();  // write 객체

            String str = "Hello Server";
            os.write(str.getBytes());

            byte[] buffer = new byte[100];
            is.read(buffer);
            System.out.println(new String(buffer));
        }
        catch(Exception e){

        }

    }
}
