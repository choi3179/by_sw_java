package inflearn.inf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Inf0209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[N][N];

        String[] input;
        for(int i=0;i<N;i++){
            input = br.readLine().split(" ");
            for(int j=0;j<N;j++)
                board[i][j] = Integer.parseInt(input[j]);
        }

        int max = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sum1 += board[i][j];
                sum2 += board[j][i];
            }
            max = Math.max(Math.max(sum1,sum2), max);
            sum1 = 0;
            sum2 = 0;
        }


        for(int i=0;i<N;i++){
            sum1 += board[i][i];
            sum2 += board[N - i - 1][i];
        }
        max = Math.max(Math.max(sum1,sum2), max);
        sum1 = 0;
        sum2 = 0;

        System.out.println(max);
    }
}
