package day05.array.ex.random;

import java.util.Random;

public class RandomEx02 {

    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            System.out.println(new Random().nextInt(45) + 1);
        }
    }
}
