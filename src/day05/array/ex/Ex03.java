package day05.array.ex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int INWON = 3;
        Scanner sc = new Scanner(System.in);

        int[] kor = new int[INWON];
        int[] eng = new int[INWON];
        int[] math = new int[INWON];
        int[] total = new int[INWON];
        double[] avg = new double[INWON];
        char[] grade = new char[INWON];
        String[] name = new String[INWON];

        for(int i=0;i<INWON;i++){
            System.out.print("name = ");
            name[i] = sc.next();
            System.out.print("국어 점수 = ");
            kor[i] = sc.nextInt();
            System.out.print("영어 점수 = ");
            eng[i] = sc.nextInt();
            System.out.print("수학 점수 = ");
            math[i] = sc.nextInt();

            total[i] = kor[i] + eng[i] + math[i];
            avg[i] = (double)total[i] / 3;
        }

        for(int i =0;i<INWON;i++){
            if(avg[i] >= 90){
                grade[i] = 'A';
            }
            else if(avg[i] >= 80){
                grade[i] = 'B';
            }
            else if(avg[i] >= 70){
                grade[i] = 'C';
            }
            else if(avg[i] >= 60){
                grade[i] = 'D';
            }
            else{
                grade[i] = 'F';
            }
        }

        System.out.println();
        for(int i=0;i<INWON;i++){
            System.out.println(name[i] + " 학생의 성적표");
            System.out.printf("총점 : %d // 평균 : %.2f\n", total[i], avg[i]);
            System.out.println("학점 : " + grade[i]);
            System.out.println();
        }
    }
}
