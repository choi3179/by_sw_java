package day11.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx01 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<Integer>();

        // 초기 사이즈와 용량
        System.out.println("length : " + vector.size() + " || " + "capacity : " + vector.capacity());

        System.out.println("==========================");

        Vector<Integer> v2 = new Vector(3,4);   // 초기 용량 3, 용랑 초과 시 4씩 증가하는 벡터 생성
        v2.add(20);
        v2.add(12);
        v2.add(45);
        v2.add(45);
        v2.add(76);
        System.out.println("length : " + v2.size() + " || " + "capacity : " + v2.capacity());

        System.out.println("========== iterator() method ===========");
        Iterator it = v2.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");  // 중복 허용, 넣은 순서대로 출력 확인
        }

        System.out.println("\n============ get() method =============");
        for(int i=0;i<v2.size();i++)
            System.out.print(v2.get(i) + " ");

        System.out.println("\n============ elementsAt() method =============");
        for(int i=0;i<v2.size();i++){
            Integer n = v2.elementAt(i);
            System.out.print(n + " ");
        }

    }

    static class Customers{
        String name;
        String address;
        String tel;
        String field;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }
    }
}
