package day11.collection.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet02 {

    public static void main(String[] args) {

        Random rand = new Random();
        Set set = new TreeSet();

        for(int i=0;set.size()<6;i++){
            int num = rand.nextInt(45) + 1;
            set.add(num);
        }

        System.out.println(set);
    }
}
