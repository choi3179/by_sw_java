package inflearn.inf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf0205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] so = new int[N+1];
        int ans = 0;
        for(int i=2;i<=N;i++){
            if(so[i] == 0){
                ans++;
                for(int j=i;j<=N;j+=i){
                    so[j] = 1;
                }
            }
        }
        System.out.println(ans);
    }
}
