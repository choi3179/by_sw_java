package day05.hw;

import java.util.Scanner;

public class Hw03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        n = sc.nextInt();

        double[] arr = new double[n];
        double max = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(max < arr[i])
                max = arr[i];
        }

        double sum = 0;
        for(double x: arr){
            sum += (x/max) * 100;
        }

        double newAvg = (sum / n);
        System.out.println(newAvg);
    }
}
