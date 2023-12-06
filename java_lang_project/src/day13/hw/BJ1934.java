package day13.hw;

import java.util.Scanner;

public class BJ1934 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int gcd = 1;    // 최대공약수
            for(int j=1;j<=Math.min(x,y);j++){
                if(x%j == 0 && y%j == 0)
                    gcd = j;
            }

            ans[i] =  (x*y) / gcd;
        }

        for(int k: ans)
            System.out.println(k);
    }
}
