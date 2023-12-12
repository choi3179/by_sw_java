package day17.udp01;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServer {   // UDP
    public static void main(String[] args) {

        DatagramPacket dp = null;
        DatagramSocket ds = null;
        DataOutputStream dos = null;

        int port = 8000;
        String str;
        File file = null;

        try{
            System.out.println("@@@ UDP file Server @@@");
            ds = new DatagramSocket(port);

            while(true){
                dp = new DatagramPacket(new byte[65536], 65536);    // 한 번 전송하는 데이터그램 패킷 크기를 지정해 주어야 함.
                ds.receive(dp);

                str = new String(dp.getData(), dp.getLength());

                if(str.equalsIgnoreCase("start")){
                    System.out.println("전송되고 있음....");
                    file = new File("test.txt");

                    dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                }
                else if(str.equalsIgnoreCase("end")){
                    System.out.println("end");
                    break;
                }
                else{
                    System.out.println(str);
                    dos.write(dp.getData(), 0, dp.getLength());
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                dos.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
