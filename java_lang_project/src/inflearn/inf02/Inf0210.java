package inflearn.inf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Inf0210 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[N+2][N+2];

        String[] input;
        for(int i=1;i<N+1;i++){
            input = br.readLine().split(" ");
            for(int j=1;j<N+1;j++)
                board[i][j] = Integer.parseInt(input[j-1]);
        }

        int loc = 0;
        int ans = 0;
        for(int i=1;i<N+1;i++){
            for(int j=1;j<N+1;j++){
                loc = board[i][j];
                if(loc > board[i-1][j]
                        && loc > board[i+1][j]
                        && loc > board[i][j-1]
                        && loc > board[i][j+1]
                ) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
