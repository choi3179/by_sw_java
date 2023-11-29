package day07.hw;

import java.util.Scanner;

public class BJ10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] num = new int[26];

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int idx = c - 97;
            if(num[idx] == 0)
                num[idx] = i+1;
        }

        for(int j: num)
            System.out.print(j-1 + " ");
    }
}
