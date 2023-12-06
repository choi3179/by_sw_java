package day13.io;

import java.io.InputStream;

/**
 * 단일 문자(1byte)만 입력받는 IO 예제
 */
public class IoEx01 {
    public static void main(String[] args) {

        InputStream is = System.in;

        try{
            System.out.print("단일 문자 입력 : ");
            int num = is.read() - 48;

            // is.read(); is.read()     // 공백이 2byte로 처리되므로 공백 입력에 대한 처리
            int num2 = is.read() - 48;

            System.out.println(num + num2);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
