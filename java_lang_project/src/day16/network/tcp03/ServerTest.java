package day16.network.tcp03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {   // Socket 2개 필요

    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;

        System.out.println("Server Start ----------");
        try{
            ss = new ServerSocket(9000);
            s = ss.accept();    // client Socket, 응답 대기

            // IO 객체
            InputStream is = s.getInputStream();    // read 객체
            OutputStream os = s.getOutputStream();  // write 객체

            byte[] arr = new byte[100];
            is.read(arr);
            System.out.println(new String(arr));

            String msg = "Hello Client";
            os.write(msg.getBytes());

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                s.close();
                ss.close();
            }
            catch(Exception e){

            }

        }
    }

}
