package day17.udp01;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    Datagram : UDP에서 사용되는 데이터 전송 단위
 */
public class DatagramClient {
    public static void main(String[] args) {
        DatagramPacket dp = null;
        DatagramSocket ds = null;
        DataInputStream dis = null;
        BufferedReader br = null;

        int port = 8000;
        String str;
        byte[] buffer = null;

        try{
            System.out.println("@@@ UDP file Client @@@");
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("전송 대상(Server IP) = ");
            String ipAddress = br.readLine();   // 127.0.0.1
            System.out.print("전송 파일(파일명.확장자) = ");
            String fileName = br.readLine();

            File file = new File(fileName);
            if(!file.exists()){
                System.out.println("파일이 존재하지 않습니다.");
                return;
            }

            str = "Start";
            buffer = str.getBytes();
            ds = new DatagramSocket();
            InetAddress inetAddress = InetAddress.getByName(ipAddress);     // 문자열 ip 주소를 실제 ip 주소 객체로 변환
            dp = new DatagramPacket(buffer, buffer.length, inetAddress, port);
            ds.send(dp);    // 실제 송신

            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));

            buffer = new byte[65536];

            while(true){
                int count = dis.read(buffer, 0, buffer.length);

                if(count == -1) {
                    break;
                }

                dp = new DatagramPacket(buffer, count, inetAddress, port);
                ds.send(dp);
            }

            str = "end";
            buffer = str.getBytes();

            dp = new DatagramPacket(buffer, buffer.length, inetAddress, port);
            ds.send(dp);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                dis.close();
                br.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
