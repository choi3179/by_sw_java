package inflearn.inf01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Inf0110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] spl = input.split(" ");

        String s = spl[0];
        char t = spl[1].charAt(0);

        int tmp = 101;
        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != t)
                answer[i] = Math.abs(i - tmp);
            else{
                answer[i] = 0;
                tmp = i;
            }
        }

        for(int i = s.length() - 1;i>=0;i--){
            if(answer[i] == 0) tmp = i;

            if(answer[i] > tmp - i)
                answer[i] = Math.abs(tmp - i);
        }

        StringBuilder sb = new StringBuilder();
        for(int c : answer)
            sb.append(c).append(" ");

        System.out.println(sb);
    }
}
