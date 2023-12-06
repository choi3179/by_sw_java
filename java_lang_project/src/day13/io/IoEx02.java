package day13.io;

import java.io.IOException;

public class IoEx02 {
    public static void main(String[] args) throws IOException {

        int su1 = 0;
        System.out.println("데이터 입력 끝은 Ctrl+F2 를 누르세요.");

        while((su1 = System.in.read())!= -1){
            System.out.print((char)su1 + "\t");
        }
        System.out.println();
    }
}
