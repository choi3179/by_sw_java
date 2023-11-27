package day05.array.ex.foreach;

import java.util.Scanner;

public class ForEachQuiz02 {
    public static void main(String[] args) {
        int SU = 3;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[SU];

        for(int i: arr){
            i= sc.nextInt();
            sum+=i;
        }

        System.out.printf("평균 : %.2f", (double)(sum / arr.length));

    }
}
