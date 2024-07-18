package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 오름차순 수열
 * 백트래킹(BackTracking) 알고리즘
 * 방문 여부(visited) 배열 필요
 * 재귀함수를 이용하여 구현
 */
public class BJ15650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N];
        int[] sequence = new int[M];

        backTracking(sequence, visited, N, M, 0);
    }

    public static void backTracking(int[] sequence, boolean[] visited, int N, int M, int depth) {

        if(depth == M) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < M; i++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");
            System.out.print(sb);
            return;
        }

        for(int i=0;i<N;i++) {
            if(!visited[i] && (depth == 0 || sequence[depth - 1] < i+1)) {
                sequence[depth] = i+1;
                visited[i] = true;      // 이번 사이클에서 방문 완료
                backTracking(sequence, visited, N, M, depth + 1);
                visited[i] = false;     // 이번 사이클에서 해당 번호 체크 완료했으니 다시 방문 여부 false
            }
        }

    }
}
