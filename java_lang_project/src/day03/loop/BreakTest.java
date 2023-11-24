package day03.loop;

public class BreakTest {
    public static void main(String[] args) {
        lable:      // 식별자 :
        for(int i=0;i<10;i++){
            for(int j=0;j<5;j++){
                if(j==3) break lable;   // 특정 식별자를 break 시킬 수도 있음
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }
}
