package day03.loop;

public class LoopQuiz03 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("1~100까지의 합 : " + sum);
    }
}
