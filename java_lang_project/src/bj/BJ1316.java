package bj;

import java.util.Scanner;

public class BJ1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int answer = 0;

        for(int i=0;i<n;i++){
            String input = sc.next();
            int[] cnt = new int[26];
            boolean isGroup = true;
            for(int j=0;j<input.length();j++){
                char ch = input.charAt(j);
                if(j!=0 && input.charAt(j-1) == ch){
                    cnt[ch-'a'] += 1;
                    continue;
                }
                if(cnt[ch-'a'] == 0)
                    cnt[ch-'a'] += 1;
                else{
                    isGroup = false;
                    break;
                }
            }
            answer += isGroup ? 1 : 0;
        }

        System.out.println(answer);
    }
}
