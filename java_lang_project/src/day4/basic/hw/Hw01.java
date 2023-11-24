package day4.basic.hw;

/**
 * 과제1
 * 1+ (1+2) + (1+2+3) + ... + ...+4+5)= ?
 */
public class Hw01 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i=1;i<=5;i++){
            System.out.print("(");
            for(int j=1;j<=i;j++){
                System.out.print(j);

                if(j==i)
                    System.out.print(")");
                else
                    System.out.print("+");

                sum += j;
            }
            if(i==5)
                System.out.print("=");
            else
                System.out.print("+");
        }
        System.out.println(sum);
    }
}
