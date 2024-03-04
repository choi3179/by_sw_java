package inflearn.inf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inf0206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] so = new int[100001];

        so[0] = 1;
        so[1] = 1;
        for(int i=2;i<=so.length-1;i++){
            if(so[i] == 0){
                for(int j=i;j<=so.length-1;j+=i){
                    if(i != j)  so[j] = 1;
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            int tmp = 0;
            while(x!=0){
                tmp = tmp*10 + x%10;
                x /= 10;
            }
            if(so[tmp] == 0)
                System.out.print(tmp + " ");
        }
    }
}
