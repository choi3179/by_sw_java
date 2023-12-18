package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ17298 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>(n);
        while(st.hasMoreTokens())
            arr.add(Integer.parseInt(st.nextToken()));

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<arr.size();i++){

            // 현재 인덱스의 값이 오큰수를 찾지 못한 이전 인덱스의 값보다 클 경우 -> 현재 인덱스의 값이 오큰수가 됨.
            while(!stack.isEmpty() && arr.get(stack.peek()) < arr.get(i)){
                arr.set(stack.pop(), arr.get(i));
            }
            stack.push(i);  // 현재 진행중인 인덱스 스택에 푸시
        }

        while(!stack.isEmpty())
            arr.set(stack.pop(),-1);    // 스택에 남은 인덱스들의 값은 오큰수가 없으므로 -1로 세팅

        for(int i=0;i<arr.size();i++)
            sb.append(arr.get(i)).append(" ");

        System.out.println(sb);
    }
}
