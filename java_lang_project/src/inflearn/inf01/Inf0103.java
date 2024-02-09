package inflearn.inf01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Inf0103 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input," ");
        String ans = "";
        while(st.hasMoreTokens()){
            String next = st.nextToken();
            if(next.length() > ans.length()){
                ans = next;
            }
        }

        System.out.println(ans);

    }
}