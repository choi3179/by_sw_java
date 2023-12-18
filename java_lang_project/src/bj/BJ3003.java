package bj;

import java.util.Scanner;

public class BJ3003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] pieces = {1,1,2,2,2,8};

        for(int i=0;i<6;i++){
            System.out.print(pieces[i] - sc.nextInt() + " ");
        }
    }
}
