package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        factorial(1,n,1);
    }

    static void factorial(int i, int n, long result) {
        if(i > n) {
            System.out.println(result);
            return;
        }

        result = result * i;

        factorial(i+1, n, result);
    }

}
