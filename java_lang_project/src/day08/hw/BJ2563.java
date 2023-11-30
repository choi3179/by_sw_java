package day08.hw;

import java.util.Scanner;

public class BJ2563 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[][] area = new int[100][100];

        n = sc.nextInt();

        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();

            for(int j=x;j<x+10;j++){
                for(int k=y;k<y+10;k++){
                    area[j][k] = 1;
                }
            }
        }

        int sum = 0;

        for(int i=0;i<area.length;i++){
            for(int j=0;j<area[i].length;j++){
                sum += area[i][j];
            }
        }

        System.out.println(sum);

    }
}
