package day11.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet03 {
    public static void main(String[] args) {

        TreeSet set = new TreeSet();
        String from = "A";
        String to = "d";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("dZZZZZZZZZZZ");
        set.add("dzzzzzzzzzzz");
        set.add("elephant");
        set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println(from + " ~ " + to);
        System.out.println(set.subSet(from,to));
        System.out.println(set.subSet(from,to+"zzz"));
    }
}
