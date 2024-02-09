package inflearn.inf01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf0106 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<input.length();i++){
            if(input.indexOf(input.charAt(i)) == i)
                sb.append(input.charAt(i));
        }

        System.out.println(sb);
    }
}
