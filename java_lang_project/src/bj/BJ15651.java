package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1부터 N까지 자연수 중에서 중복 가능한 M개를 고른 수열
 * 백트래킹(BackTracking) 알고리즘
 * 재귀함수를 이용하여 구현
 */
public class BJ15651 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sequence = new int[M];

        backTracking(sequence, N, M, 0);
        System.out.print(sb);
    }

    public static void backTracking(int[] sequence, int N, int M, int depth) {

        if(depth == M) {
            for(int i = 0; i < M; i++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");

            return;
        }

        for(int i=0;i<N;i++) {
            sequence[depth] = i+1;
            //visited[i] = true;      // 이번 사이클에서 방문 완료
            backTracking(sequence, N, M, depth + 1);
            //visited[i] = false;     // 이번 사이클에서 해당 번호 체크 완료했으니 다시 방문 여부 false
        }

    }
}
