package day4.basic.hw;

/**
 * 과제3
 * 1/2 + 2/3 + 3/4 + ... + 9/10 = ?
 */
public class Hw03 {
    public static void main(String[] args) {

        double sum = 0;

        for(int i=1;i<10;i++){
            System.out.print(i + "/" + (i+1));
            if(i<9)
                System.out.print(" + ");
            sum += (double)i/(i+1);
            //System.out.println(sum);
        }
        System.out.printf(" = %.2f\n", sum);
    }
}
