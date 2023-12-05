package day11.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx01 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);
        list1.add(60);
        list1.add(70);
        list1.add(90);
        System.out.println(list1);

        ArrayList list2 = new ArrayList(list1.subList(0,4));
        list2.add(10);
        System.out.println(list2);

        System.out.println();

        list1.sort(null);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println();



    }
}
