package inflearn.inf01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf0104 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            sb = new StringBuilder(br.readLine());
            System.out.println(sb.reverse());
        }

    }
}