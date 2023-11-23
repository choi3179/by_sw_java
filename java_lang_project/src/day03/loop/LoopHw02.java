package day03.loop;

public class LoopHw02 {

    public static void main(String[] args) {

        // 과제3 (1)
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 과제3 (2)
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 과제3 (3)
        for(int i=0;i<5;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int j=4-i;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=5;i>0;i--){
            for(int j=5;j>5-i;j--){
                System.out.print(" ");
            }
            for(int j=5-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
