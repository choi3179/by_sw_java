package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N x N 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수
 * Queen은 원하는 칸만큼 좌, 우, 상, 하, 대각선으로 움직일 수 있다.
 * 백트래킹 알고리즘
 */
public class BJ9663 {

    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] queen = new int[N];       // index가 열이고, 배열 값으로 행 번호를 가지는 배열 선언

        backTracking(queen, N, 0);

        System.out.println(cnt);
    }

    static public void backTracking(int[] queen, int N, int depth) {

        if(depth == N) {
            cnt++;
            return;
        }


        for(int i = 0; i < N; i++) {
            queen[depth] = i;
            if(isPossible(queen, depth)){
                backTracking(queen, N, depth+1);
            }
        }
    }

    static public boolean isPossible(int[] queen, int depth) {

        for(int i=0;i< depth;i++){
            if(queen[i] == queen[depth])
                return false;

            if(Math.abs(depth - i) == Math.abs(queen[depth] - queen[i])){
                return false;
            }
        }

        return true;
    }
}
