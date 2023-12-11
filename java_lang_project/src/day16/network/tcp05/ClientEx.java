package day16.network.tcp05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientEx {

    public static void main(String[] args) {
        BufferedReader br = null, stin = null;
        BufferedWriter bw = null;

        Socket client = null;   // socket 2

        try{

            client = new Socket("127.0.0.1",9999);
            br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            stin = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            String outputMsg;

            while(true){
                System.out.print("message input : ");
                outputMsg = stin.readLine();

                if(outputMsg.equalsIgnoreCase("exit")){
                    bw.write(outputMsg);
                    bw.flush();
                    break;
                }

                bw.write(client.getInetAddress() + " 클라이언트 > " + outputMsg + "\n");
                bw.flush();

                String inputMsg = br.readLine();
                System.out.println(inputMsg);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            try{
                client.close();
            }
            catch(Exception e2){
                System.out.println("서버 채팅 오류");
            }
        }
    }
}
