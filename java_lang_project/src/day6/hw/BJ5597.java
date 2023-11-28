package day6.hw;

import java.util.Scanner;

public class BJ5597 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 30;
        int[] arr = new int[30];

        for(int i=0;i<28;i++){
            int idx = sc.nextInt();
            arr[idx-1] = 1;
        }

        for(int i=0;i<30;i++){
            if(arr[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}
