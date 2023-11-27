package day05.array.ex.foreach;

public class ForEachQuiz01 {

    public static void main(String[] args) {
        int su[] = {1,74,7,55,90,100,7,2,7,23};
        int cnt = 0;

        for(int i:su){
            if(i == 7) cnt++;
        }
        System.out.println("7의 개수 : " + cnt);
    }
}
