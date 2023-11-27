package day05.array.ex.quiz;

import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(i + "행 " + j + "열 데이터 입력 : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
                System.out.print(arr[i][j]);
                if(j == arr[i].length - 1)
                    System.out.print(" = ");
                else
                    System.out.print(" + ");
            }
            System.out.println(sum);
        }
    }
}
