package day6.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] a = {7,3,2,5,8};

        int tmp = 0;
        System.out.println("정렬 전 : " + Arrays.toString(a));

        //sort
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j] > a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println("정렬 후 : " + Arrays.toString(a));
    }
}
