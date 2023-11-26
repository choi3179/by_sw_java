package day03.loop.hw;

public class LoopHw04 {
    public static void main(String[] args) {
        // 과제3 (3) - 오른쪽 직각삼각형
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
    }
}
