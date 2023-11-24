package day03.loop;

public class BreakContinueQuiz01 {

    public static void main(String[] args) {

        int cnt = 0;
        for(int i=1;i<=100;i++){
            if(i%2 != 0) continue;
            cnt++;
            System.out.print(i + " ");
            if(cnt%10 == 0)
                System.out.println();
        }
        System.out.println("개수 : " + cnt);
    }
}
