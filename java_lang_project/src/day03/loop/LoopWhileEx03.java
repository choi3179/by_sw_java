package day03.loop;

public class LoopWhileEx03 {
    public static void main(String[] args) {

        int i=2;
        int j=1;
        do {
            System.out.println(i + "단");
            do{
                System.out.println(i + " * " + j + " = " + (i*j));
                j++;
            } while(j<10);
            j=1;
            i++;
            System.out.println();
        } while(i<10);
    }
}
