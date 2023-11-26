package day05.array.ex.quiz;

import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length; i++){
            if(i<2){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(i + "행 " + j + "열 입력 : ");
                    arr[i][j] = sc.nextInt();
                }
            }
            else{
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j] = arr[i-2][j] + arr[i-1][j];
                }
            }
        }

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
