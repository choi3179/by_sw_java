package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            isPalindrome(br.readLine());
        }

    }

    public static int recursion(String s, int l, int r, int loop){
        loop++;
        if(l >= r) {
            System.out.println("1 " + loop);
            return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
            System.out.println("0 " + loop);
            return 0;
        }
        else {
            return recursion(s, l+1, r-1, loop);
        }
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 0);
    }

}
