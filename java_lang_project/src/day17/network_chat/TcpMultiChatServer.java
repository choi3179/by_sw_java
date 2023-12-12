package day17.network_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Collection, Thread, IO를 이용한 Multi Chatting
 */
public class TcpMultiChatServer {

    HashMap clients;

    public TcpMultiChatServer() {
        clients = new HashMap();
        Collections.synchronizedMap(clients);   // 동기화할 수 있는 컬렉션 map 선언
    }

    public void start() {
        ServerSocket ss = null;     // server socket 1
        Socket s = null;            // client socket 2

        try{

            ss = new ServerSocket(7777);
            System.out.println("서버가 시작되었습니다. 채팅 시작");

            while(true){
                s = ss.accept();        // 응답 대기 상태의 클라이언트 소켓
                System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속 ------");

                ServerReceiver thread = new ServerReceiver(s);   // user class
                thread.start();
            }
        }
        catch(Exception e){

        }

    }   // user method

    // Server에 접속한 모든 client에게 메시지 일괄 전송
    public void sendToAll(String msg){
        Iterator it = clients.entrySet().iterator();
        while(it.hasNext()){
            try{
                // 데이터 타입에 맞게 출력하기 위해 DataOutputStream 객체 선언 및 생성
                Map.Entry map = (Map.Entry)it.next();
                DataOutputStream dos = (DataOutputStream)(map.getValue());
                //DataOutputStream dos = (DataOutputStream)clients.get(it.next());
                dos.writeUTF(msg);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * user class 를 inner class로 생성
     * Multi Chat을 지원하는 사용자 thread 클래스 생성
     */
    class ServerReceiver extends Thread{

        Socket s;
        DataInputStream dis;    // 자료형에 맞게 데이터를 읽음
        DataOutputStream dos;

        public ServerReceiver(Socket s) {
            this.s = s;

            try{
                dis = new DataInputStream(s.getInputStream());      // 네트워크를 통해 읽기
                dos = new DataOutputStream(s.getOutputStream());    // 네트워크를 통해 쓰기
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        // 스레드를 사용하기 위한 run 메소드 오버라이드
        @Override
        public void run() {
            String name = "";

            try{
                name = dis.readUTF();
                sendToAll("#" + name + "님이 입장하셨습니다.");
                //System.out.println(dos.toString().hashCode());

                clients.put(name, dos);
                System.out.println("현재 서버 접속자 수는 + " + clients.size() + "명 입니다.");
                System.out.println("현재 접속자 정보 : " + clients);
                while(dis != null) {
                    sendToAll(dis.readUTF());
                }
            }
            catch(Exception e){

            }
            finally {
                sendToAll("#" + name + "님이 퇴장하였습니다.");
                clients.remove(name);
                System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 퇴장 ---------");
            }
        }
    }
    public static void main(String[] args) {
        new TcpMultiChatServer().start();
    }
}
