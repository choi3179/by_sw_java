package inflearn.inf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Inf0211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[N][5];

        String[] input;
        for(int i=0;i<N;i++){
            input = br.readLine().split(" ");
            for(int j=0;j<5;j++)
                board[i][j] = Integer.parseInt(input[j]);
        }

        int max = 0;
        int cnt = 0;
        int ans = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++) {
                for (int k = 0; k < 5; k++) {
                    if (board[i][k] == board[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                ans = i+1;
            }
            cnt = 0;
        }
        System.out.println(ans);
    }
}
