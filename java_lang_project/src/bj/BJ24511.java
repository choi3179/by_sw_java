package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class BJ24511 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 스택, 큐 구분 배열
        // 스택에서 리턴하는 값은 변하지 않음
        // queuestack의 리턴값은 큐만 고려
        String[] A = br.readLine().split(" ");

        String[] B = br.readLine().split(" ");

        int M = Integer.parseInt(br.readLine());
        String[] C = br.readLine().split(" ");

        LinkedList<String> result = new LinkedList<>();
        for(int i=0;i<N;i++){
            if(A[i].equals("0"))
                result.add(B[i]);
        }

        for(int i=0;i<M;i++){
            result.addFirst(C[i]);
            sb.append(result.pollLast()).append(" ");;
        }

        System.out.println(sb);
    }
}
