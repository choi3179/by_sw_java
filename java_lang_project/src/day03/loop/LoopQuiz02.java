package day03.loop;

public class LoopQuiz02 {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for(int i=1;i<=100;i++){
            if(i%3==0){
                count++;
                sum+=i;
            }
        }

        System.out.println("개수 : " + count + " / 합 : " + sum);
    }
}
