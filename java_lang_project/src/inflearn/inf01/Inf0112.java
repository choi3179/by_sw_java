package inflearn.inf01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf0112 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        char[] pwd = new char[n];

        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<7;j++){
                char tmp = input.charAt((i*7 + j));
                if(tmp == '#'){
                    sb.append(1);
                }
                else
                    sb.append(0);
            }
            System.out.print((char)(Integer.parseInt(sb.toString(),2)));
        }
    }
}
