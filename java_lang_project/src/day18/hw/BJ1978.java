package day18.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1978 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens()){
            if(isSosu(Integer.parseInt(st.nextToken())))
                ans++;
        }

        System.out.println(ans);
    }

    public static boolean isSosu(int num){
        if (num == 0 || num == 1)
            return false;

        for(int i=2;i<num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
