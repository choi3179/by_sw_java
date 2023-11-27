package day05.array.ex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int INWON = 3;
        Scanner sc = new Scanner(System.in);

        int[][] scores = new int[INWON][3];
        int[][] result = new int[INWON][3];

        for(int i=0;i<INWON;i++){
            System.out.print("국어 점수 = ");
            scores[i][0] = sc.nextInt();
            System.out.print("영어 점수 = ");
            scores[i][1] = sc.nextInt();
            System.out.print("수학 점수 = ");
            scores[i][2] = sc.nextInt();

            result[i][0] = scores[i][0] + scores[i][1] + scores[i][2];
            result[i][1] = (int)result[i][0] / 3;
            if(result[i][1] >= 90){
                result[i][2] = 'A';
            }
            else if(result[i][1] >= 80){
                result[i][2] = 'B';
            }
            else if(result[i][1] >= 70){
                result[i][2] = 'C';
            }
            else if(result[i][1] >= 60){
                result[i][2] = 'D';
            }
            else{
                result[i][2] = 'F';
            }
        }

        System.out.println();
        for(int i=0;i<INWON;i++){
            //System.out.println(name[i] + " 학생의 성적표");
            System.out.printf("총점 : %d // 평균 : %.2f\n", result[i][0], (double)result[i][1]);
            System.out.println("학점 : " + result[i][2]);
            System.out.println();
        }
    }
}
