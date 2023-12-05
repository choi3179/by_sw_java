package day11.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MergeSort {
    static int[] tmpArr;
    static int[] arr;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        tmpArr = new int[n];
        mergeSort(0, arr.length-1);

        for(int k: arr)
            System.out.println(k);

    }

    public static void mergeSort(int left, int right) {
        if(left < right){
            int mid = (left+right) / 2;
            mergeSort(left,mid);
            mergeSort(mid+1,right);

            /**
             * 분할 과정
             */
            int l = left;       // 분할 왼쪽 배열의 시작
            int r = mid + 1;    // 분할 오른쪽 배열의 시작
            int idx = left;

            while(l<=mid || r <= right){
                // 오른쪽 배열에 요소가 더 이상 없거나
                // 왼쪽 배열 요소가 더 작은 경우
                if(r > right || ((l<=mid) && arr[l] < arr[r])){
                    tmpArr[idx++] = arr[l++];
                }
                else{
                    tmpArr[idx++] = arr[r++];
                }
            }

            /**
             * 왼쪽 배열 정렬이나 오른쪽 배열 어느 한 쪽이 정렬이 끝나면 정렬이 끝난 배열을 정답 배열에 저장(정복)
             */
            for(int i=left;i<=right;i++)
                arr[i] = tmpArr[i];

        }
    }
}
