package bj.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        while(st.hasMoreTokens()){
            int m = Integer.parseInt(st.nextToken());
            queue.add(m);
        }

        while(!queue.isEmpty()){

            if(queue.peek() - num == 1){
                num = queue.poll();
            }
            else if(!stack.isEmpty() && stack.peek() - num == 1){
                num = stack.pop();
            }
            else{
                stack.push(queue.poll());
            }
        }

        while(!stack.isEmpty()){
            int tmp = stack.pop();
            if(tmp - num == 1)
                num = tmp;
        }

        if(n == num)
            System.out.println("Nice");
        else
            System.out.println("Sad");
    }
}
