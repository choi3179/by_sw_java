package bj.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();

        int k = Integer.parseInt(br.readLine());

        for(int i=0;i<k;i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(!s.isEmpty())
                    s.pop();
            }
            else
                s.push(input);
        }

        int ans = 0;
        while(!s.isEmpty())
            ans += s.pop();

        System.out.println(ans);
    }
}
