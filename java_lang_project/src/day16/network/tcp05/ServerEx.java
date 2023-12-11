package day16.network.tcp05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class ServerEx {
    public static void main(String[] args) {

        BufferedReader br = null, stin = null;
        BufferedWriter bw = null;

        ServerSocket server = null;     // socket 1
        Socket client = null;   // socket 2
        System.out.println("연결완료.... Here is Server");

        try{
            server = new ServerSocket(9999);
            client = server.accept();       // 응답대기. 클라이언트 소켓

            br = new BufferedReader(new InputStreamReader(client.getInputStream()));    // 네트워크를 통해 데이터를 읽어옴
            // 키보드로부터 입력 스트림
            stin = new BufferedReader(new InputStreamReader(System.in));

            // 클라이언트로의 입력 스트림
            bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));  // 네트워크를 통한 쓰기 객체 생성

            String msg;

            while(true){

                msg = br.readLine();

                if(msg.equalsIgnoreCase("exit")) break;

                System.out.println(msg);        // 클라이언트가 보낸 메시지 출력

                String outputMsg = stin.readLine();     // 키보드 입력
                //키보드 입력 문자 전송
                bw.write(client.getInetAddress() + " 서버 > " + outputMsg + "\n");
                bw.flush();

            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                client.close();
            }
            catch (Exception e2){
                System.out.println("클라이언트 채팅 오류");
            }
        }
    }
}
