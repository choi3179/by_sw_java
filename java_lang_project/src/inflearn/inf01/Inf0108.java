package inflearn.inf01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf0108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.toUpperCase().replaceAll("[^A-Z]", "");    // 알파벳이 아니면 삭제

        String rev = new StringBuilder(input).reverse().toString();

        if(input.equals(rev))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
