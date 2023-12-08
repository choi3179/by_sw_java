package bj;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 자바 util의 PriorityQueue로 최대 힙 구현
 */
public class BJ11279 {

    public static void main(String[] args) throws IOException {

        //Scanner sc = new Scanner(System.in);
        System.setIn(new FileInputStream("src/day12/hw/input11279.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // PriorityQueue의 우선순위를 조건에 해당하는 Comparator 인터페이스를 구현하여 선언
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0;i<n;i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(maxHeap.isEmpty())
                    System.out.println(0);
                else{
                    int max = maxHeap.poll();
                    System.out.println(max);
                }
            }
            else{
                maxHeap.add(input);
            }
        }

    }
}
