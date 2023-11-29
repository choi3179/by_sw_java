package day06.hw;

import java.util.Scanner;

public class BJ10811 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;

        n = sc.nextInt();
        m = sc.nextInt();

        int[] box = new int[n];

        for(int i=0;i<n;i++){
            box[i] = i+1;
        }

        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=0;j<=(y-x)/2;j++){
                int tmp = 0;
                tmp = box[x+j-1];
                box[x+j-1] = box[y-1-j];
                box[y-1-j] = tmp;
            }
        }

        for(int i: box)
            System.out.print(i + " ");

    }

}
