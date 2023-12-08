package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ17103 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];

        boolean[] sosu = new boolean[1000001];


        // 에라토스테네스의 체 방식으로 소수 인덱스 boolean 배열을 만든다.
        sosu[0] = sosu[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!sosu[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    sosu[j] = true;
                }
            }
        }

        for(int i=0;i<t;i++){
            int input = Integer.parseInt(br.readLine());
            int ans = 0;
            for(int j=2;j<=input/2;j++){
                if(!sosu[j] && !sosu[input-j]) ans++;
            }
            arr[i] = ans;
        }

        for(int k: arr)
            System.out.println(k);
    }
}
