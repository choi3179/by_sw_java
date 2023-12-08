package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1010 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long N = Long.parseLong(st.nextToken());
            long M = Long.parseLong(st.nextToken());

            long ans = 1;

            for(int j = 0; j < N; j++) {
                ans *= (M - j);
                ans /= (j + 1);
            }

            System.out.println(ans);
        }
    }

}