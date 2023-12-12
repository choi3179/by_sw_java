package day17.network_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("USAGE : java TcpMultiChatClient 대화명이 없습니다.");
            return;
        }

        try{
            String ip = "127.0.0.1";
            Socket s = new Socket(ip,7777);
            System.out.println("채팅 서버에 연결되었습니다.");

            Thread sender = new Thread(new ClientSender(s,args[0]));
            Thread receiver = new Thread(new ClientReceiver(s));

            sender.start();
            receiver.start();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    // 텍스트를 읽기 위한 Thread 상속 클래스 생성
    static class ClientSender extends Thread{

        Socket s;
        DataOutputStream dos;
        String name;

        public ClientSender(Socket s, String name){
            this.s=s;

            try{
                dos = new DataOutputStream(s.getOutputStream());
                this.name=name;
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);    // 키보드로부터 입력 받기
            try{
                if(dos != null) {
                    dos.writeUTF(name);
                    while(dos != null){
                        dos.writeUTF("[" + name + "] " + sc.nextLine());    // 입력한 채팅 서버로 전송

                    }
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    // 텍스트를 쓰고 전송하기 위한 Thread 상속 클래스 생성
    static class ClientReceiver extends Thread{

        Socket s;
        DataInputStream dis;

        public ClientReceiver(Socket s){
            this.s=s;
            try{
                dis = new DataInputStream(s.getInputStream());
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while(dis != null){
                try{
                    System.out.println(dis.readUTF());
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
