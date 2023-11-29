package day04.basic.hw;

import java.util.Scanner;

/**
 * 과제4
 * 정수 3개를 입력받아서 큰 순서대로 출력하기
 */
public class Hw04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i,j,k=0;

        System.out.print("세 정수 입력 : ");
        i = sc.nextInt();
        j = sc.nextInt();
        k = sc.nextInt();

        if(i>j && i>k){
            System.out.print(i + " > ");
            if(j>k)
                System.out.print(j + " > " + k);
            else
                System.out.print(k + " > " + j);
        }
        else if(j>i && j>k){
            System.out.print(j + " > ");
            if(i>k)
                System.out.print(i + " > " + k);
            else
                System.out.print(k + " > " + i);
        }
        else{
            System.out.print(k + " > ");
            if(i>j)
                System.out.print(i + " > " + j);
            else
                System.out.print(j + " > " + i);
        }
    }
}
