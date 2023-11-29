package day04.basic.hw;

/**
 * 과제 2
 *  (-1) + 2 + (-3) + ... + 10 = ?
 */
public class Hw02 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i=1;i<=10;i++){
            if(i%2 == 1){
                System.out.print("(" + i*(-1) + ")");
                sum-=i;
            }
            else{
                System.out.print(i);
                sum+=i;
            }
            if(i == 10)
                System.out.print(" = ");
            else
                System.out.print(" + ");
        }
        System.out.println(sum);
    }
}
