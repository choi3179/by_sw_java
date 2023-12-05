package day11.collection.set;

import java.util.TreeSet;

/**
 * TreeSet은 데이터를 자동 정렬해준다.
 * 중복 제거
 */
public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();

        int[] score = {85,95,76,91,30,51,60,100,97,84};

        for(int i=0;i<score.length;i++){
            set.add(score[i]);
        }

        System.out.println(set);

        /*
        TreeSet 에서만 지원하는 메소드
        value값보다 크거나 같은 값을 리턴
         */
        System.out.println("50보다 작은 값 : " + set.headSet(50));       // 50보다 작은 값 리턴
        System.out.println("50보다 작은 값 : " + set.tailSet(50));     // 50보다 큰 값 리턴

        System.out.println(set.first());
        System.out.println(set.last());
    }
}
