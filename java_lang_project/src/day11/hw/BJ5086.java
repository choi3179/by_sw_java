package day11.hw;

import java.util.Scanner;

public class BJ5086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p = -1;
        int q = -1;

        while(true){
            p = sc.nextInt();
            q = sc.nextInt();

            if(p==0 && q==0)
                break;

            if(q%p == 0)
                System.out.println("factor");
            else if(p%q == 0)
                System.out.println("multiple");
            else
                System.out.println("neither");

        }
    }
}
