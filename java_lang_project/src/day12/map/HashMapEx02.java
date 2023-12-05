package day12.map;

import java.util.*;

public class HashMapEx02 {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("kim",90);
        map.put("na",80);
        map.put("jung",60);
        map.put("lee",75);
        map.put("park",80);

        Set set = map.entrySet();   // HashMap을 Set 타입으로 변경
        System.out.println(map);    // 딕셔너리 형태로 출력
        System.out.println(set);    // 리스트 형태로 출력

        System.out.println("\n====== Set에 저장된 데이터 -> Map 으로 ======");
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry e= (Map.Entry)it.next();  // Set에 저장된 key-value 형태를 map 형태로 바꿔주는 인터페이스
            System.out.println("Name : " + e.getKey() + ", Score : " + e.getValue());
        }

        System.out.println();
        set = map.keySet();     // Map의 키값들을 Set 형태로 리턴
        System.out.println("Map의 키값 리스트를 Set 타입으로 출력 : " + set);
        Collection values = map.values();   // Map의 모든 value들을 Collection 타입으로 리턴
        it = values.iterator();
        int total = 0;
        while(it.hasNext()){
            int i = (int)it.next();
            total += i;
        }
        System.out.println("총점 : " + total + ", 평균 : " + (double)total/map.size());
        System.out.println("최고점수 : " + Collections.max(values) + ", 최저점수 : " + Collections.min(values));
    }
}
