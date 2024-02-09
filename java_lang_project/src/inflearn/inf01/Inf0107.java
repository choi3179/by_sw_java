package inflearn.inf01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf0107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder(input);
        String rev = sb.reverse().toString();

        if(rev.toLowerCase().equals(input.toLowerCase())){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
