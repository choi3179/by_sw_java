package day11.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("키보드");
        hs.add("컵");
        hs.add("마우스");
        hs.add("볼펜");
        hs.add("키보드");  //중복 허용하지 않음

        System.out.println("요소 개수 : " + hs.size()); // 데이터 개수 확인

        Iterator it = hs.iterator();    // 이터레이터 선언
        while(it.hasNext()){    // 다음 요소가 있다면
            System.out.println(it.next());  // 순서와 상관없이 결과 출력
        }
    }
}
