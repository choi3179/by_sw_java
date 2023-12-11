package day16.network.tcp01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class GetAllByNameEx01 {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strUrl = null;
        InetAddress[] address;

        System.out.print("site address : ");
        try{
            strUrl = br.readLine();
            address = InetAddress.getAllByName(strUrl);     // 예외가 발생하므로 try-catch 내부에 위치

            for(int i=0;i<address.length;i++){
                System.out.println(address[i]);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
