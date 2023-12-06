package day13.io;

import java.io.IOException;

public class InputStreamEx01 {
    public static void main(String[] args) throws IOException {

        int su1;

        while((su1 = System.in.read())!= -1){       // 표준 입출력 System.in은 무조건 int로 받아들임.
            if(su1 == 10 || su1 == 13 || su1 == 32) continue;
            if(su1 == 113 || su1 == 81) break;

            System.out.print((char)su1 + "\t");
        }
        System.out.println();

    }
}
