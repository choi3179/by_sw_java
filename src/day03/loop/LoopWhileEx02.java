package day03.loop;

import java.util.Scanner;

public class LoopWhileEx02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dan = 0;

        System.out.print("구구단 단 입력 : ");
        dan = sc.nextInt();

        int i=0;
        /*while(i<9){
            i++;
            System.out.println(dan + " * " + i + " = " + (dan*i));
        }*/
        do {
            i++;
            System.out.println(dan + " * " + i + " = " + (dan*i));
        } while(i<9);
    }
}
