package day12.map;

import java.util.*;

public class TreeMapEx01 {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();

        treeMap.put("zz",1000);
        treeMap.put("aa",2000);
        treeMap.put("bb",1000);
        treeMap.put("cc",1000);

        System.out.println(treeMap);    // key값이 자동정렬된다.

        TreeSet set = new TreeSet();
        Random rand = new Random();
        for(int i=0;i<6;i++){
            int num = rand.nextInt(50) + 1;
            set.add(num);
        }
        System.out.println(set);

        List list = new LinkedList(set);    // Set 타입을 List 타입으로 바로 변환 가능
        System.out.println(list);

    }
}
