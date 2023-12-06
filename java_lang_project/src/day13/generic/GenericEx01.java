package day13.generic;

public class GenericEx01 {
    public static void main(String[] args) {

        /**
         * 제너릭을 이용하면 자료형의 유연성을 제공한다.
         */
        GenericEx<String> t1 = new GenericEx<String>();     // 제너릭 클래스의 타입을 정해서 객체 생성
        String[] str = {"abc", "kbs", "director"};
        t1.setX(str);
        t1.print();

        System.out.println("==========================");

        GenericEx<Integer> t2 = new GenericEx<Integer>();
        Integer[] num = {1,2,3,4,5,6};
        t2.setX(num);
        t2.print();

        System.out.println("==========================");

        GenericEx<Double> t3 = new GenericEx<Double>();
        Double[] arr = {3.14,1.52,0.73,-65.9};
        t3.setX(arr);
        t3.print();
    }
}

