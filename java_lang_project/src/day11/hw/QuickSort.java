package day11.hw;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr,arr.length-1,0);

        for(int k: arr)
            System.out.println(k);

    }

    public static void quickSort(int[] arr, int high, int low) {

        int pivot = (high+low) / 2;     // 배열의 중간값을 피벗으로 설정
        int pivotValue = arr[pivot];

        int left = low;
        int right = high;

        if(high <= low) return;     // 하나의 서브리스트의 길이가 1이 되는 순간 종료

        while(left <= right) {      // 피벗 기준 좌우 비교가 끝나면 종료

            while (arr[left] < pivotValue) {  // 왼쪽 서브 리스트에 피벗값보다 큰 수가 있는지 확인
                left++;
            }

            while (arr[right] > pivotValue) {  // 오른쪽 서브 리스트에 피벗값보다 작은 수가 있는지 확인
                right--;
            }

            if(left<=right){        // 좌우에 크거나 작은 값을 피벗값을 기준으로 바꿈.
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
        }

        quickSort(arr,high,left);       // 오른쪽 서브리스트를 다시 퀵소트
        quickSort(arr,right,low);       // 왼쪽 서브리스트를 다시 퀵소트

    }
}
