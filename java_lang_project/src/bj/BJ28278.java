package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ28278 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            String[] split = br.readLine().split(" ");
            switch(Integer.parseInt(split[0])){
                case 1:
                    stack.push(Integer.parseInt(split[1]));
                    break;
                case 2:
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 5:
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
