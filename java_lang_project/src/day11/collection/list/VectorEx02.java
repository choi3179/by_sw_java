package day11.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx02 {
    public static void main(String[] args) {

        Vector<Integer> v2 = new Vector(3,4);   // 초기 용량 3, 용랑 초과 시 4씩 증가하는 벡터 생성
        v2.add(20);
        v2.add(12);
        v2.add(45);
        v2.add(45);
        v2.add(76);

        Enumeration enu = v2.elements();
        while(enu.hasMoreElements()){
            System.out.print(enu.nextElement() + " ");
        }
        if(v2.contains(20)) System.out.println("20이 있습니다.");

    }
}
