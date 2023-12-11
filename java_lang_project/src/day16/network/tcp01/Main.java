package day16.network.tcp01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        //String host = "127.0.0.1";      // 루프백 IP
        String host = "192.168.0.21";     // 현재 PC가 사용중인 IP

        try {
            InetAddress[] address = InetAddress.getAllByName(host);

            for(InetAddress ina: address){
                System.out.println(ina);
                System.out.println(ina.getHostName());  // HOST 네임 출력 -> PC에 설정된 호스트 이름 확인 가능
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
