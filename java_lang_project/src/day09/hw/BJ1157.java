package day09.hw;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next().toUpperCase();

        int[] cnt = new int[26];

        for(int i=0;i<input.length();i++){
            cnt[input.charAt(i) - 'A']++;
        }


        int max = 0;
        int answer = 0;
        for(int i=0;i<cnt.length;i++){
            if(max < cnt[i]){
                max = cnt[i];
                answer = i + 'A';
            }
            else if(max == cnt[i]){
                answer = '?';
            }
        }

        System.out.println((char)answer);


    }
}
