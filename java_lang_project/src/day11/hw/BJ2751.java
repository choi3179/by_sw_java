package day11.hw;

import java.util.*;

public class BJ2751 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();     // 출력 성능 향상을 위한 StringBuilder 사용

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for(int i=0;i<n;i++){
            int input = sc.nextInt();
           arr.add(input);
        }

        /**
         * Collections의 정렬 함수는 Tim Sort 라는 방법을 사용하여
         * O(n) ~ O(nlogn) 시간 복잡도를 보장한다.
         */
        Collections.sort(arr);

        Iterator it = arr.iterator();

        while(it.hasNext())
            sb.append(it.next()).append("\n");

        System.out.println(sb.toString());
    }
}
