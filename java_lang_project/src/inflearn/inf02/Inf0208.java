package inflearn.inf02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Inf0208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] ranks = new int[N];
        int[] ans = new int[N];
        TreeSet<Integer> score = new TreeSet<>();

        String[] st = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            score.add(Integer.parseInt(st[i]));
            ranks[i] = Integer.parseInt(st[i]);
        }

        int cnt = 0;
        int rank = 1;
        int tmp = 0;
        while(!score.isEmpty()){
            tmp = score.pollLast();
            for(int i=0;i<N;i++){
                if(tmp == ranks[i]){
                    ans[i] = rank;
                    cnt++;
                }
            }
            rank += cnt;
            cnt = 0;
        }

        for(int r: ans)
            System.out.print(r + " ");
    }
}
