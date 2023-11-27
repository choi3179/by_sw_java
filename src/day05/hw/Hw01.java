package day05.hw;

import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {

        int x = 0;
        int n = 0;

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += (a*b);
        }

        if(sum == x)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
