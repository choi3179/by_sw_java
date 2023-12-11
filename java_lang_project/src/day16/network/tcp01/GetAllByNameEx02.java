package day16.network.tcp01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx02 {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getLocalHost();

        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 IP 주소 : " + address.getHostAddress());

        address = InetAddress.getByName("www.en-core.com");    //
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 IP 주소 : " + address.getHostAddress());

        byte[] addr = new byte[4];      // 192.168.0.21
        addr[0] = (byte)192;
        addr[1] = (byte)168;
        addr[2] = (byte)0;
        addr[3] = (byte)21;
        address = InetAddress.getByAddress(addr);   // byte array의 데이터를 하나의 IP 주소로 변환
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 IP 주소 : " + address.getHostAddress());
    }
}
