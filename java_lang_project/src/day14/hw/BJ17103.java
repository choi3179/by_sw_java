package day14.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ17103 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        boolean[] sosu = new boolean[1000000/2];    // 입력 최대가 1,000,000 이고 실제 고려해야 할 소수는 입력의 절반 만큼이므로

        for(int i=0;i<sosu.length;i++){
            if(i==2) sosu[i] = true;

        }
    }
}
