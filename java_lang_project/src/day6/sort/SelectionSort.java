package day6.sort;

import java.util.Arrays;

/**
 * 선택 정렬
 * 기준을 가지고 정렬하고 기준 인덱스를 하나씩 옮겨가면서 정렬한다.
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] a = {7,3,2,5,8};

        int tmp = 0;
        System.out.println("정렬 전 : " + Arrays.toString(a));

        //sort
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}
