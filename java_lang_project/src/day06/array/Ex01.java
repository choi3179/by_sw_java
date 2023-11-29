package day06.array;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[][][] arr =  new int[2][2][3];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    arr[i][j][k] = rand.nextInt(100);
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
