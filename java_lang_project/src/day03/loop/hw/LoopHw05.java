package day03.loop.hw;

public class LoopHw05 {
    public static void main(String[] args) {

        // 과제3 (4) - 오른쪽 역직각삼각형
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=5-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
