package day05.hw;

import java.util.Scanner;

public class Hw02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        n = sc.nextInt();

        for(int i=0;i<n/4;i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
