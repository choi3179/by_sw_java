package inflearn.inf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inf0202 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int f = 0;
        int tmp = 0;
        int ans = 0;


        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            tmp = Integer.parseInt(st.nextToken());
            if(tmp > f){
                ans++;
                f = tmp;
            }
        }

        System.out.println(ans);
    }
}
