package inflearn.inf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inf0207 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int ans = 0;
        int con = 0;

        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken()) == 1){
                con++;
                ans+=con;
            }
            else{
                con = 0;
            }
        }

        System.out.println(ans);
    }
}
