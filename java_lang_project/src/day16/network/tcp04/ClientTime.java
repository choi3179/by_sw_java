package day16.network.tcp04;

import day10.api.wrapper.IntegerMain;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class ClientTime {
    public static void main(String[] args) {
        String serverIp = "127.0.0.1";
        int port = 7000;
        Date date = null;

        try{
            Socket s = new Socket(serverIp,port);
            InputStream is = s.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);

            System.out.println("Server측 날짜/시간 확인.... 여기는 Client\n");
            date = (Date)ois.readObject();
            System.out.println("현재 서버측 시간 : " + date.toString());
            ois.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
