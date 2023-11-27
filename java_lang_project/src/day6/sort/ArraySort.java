package day6.sort;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = {7,3,2,5,8};

        Arrays.sort(a);     // Arrays 클래스 내부 정렬 메소드 사용
        System.out.println("정렬 후 : " + Arrays.toString(a));
    }
}
