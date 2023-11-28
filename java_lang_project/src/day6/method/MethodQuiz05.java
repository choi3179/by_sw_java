package day6.method;

import java.util.Scanner;

public class MethodQuiz05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = "";

        int kor = 0;
        int eng = 0;
        int math = 0;

        name = inputName(sc);
        System.out.print("국어 ");
        kor = input(sc);
        System.out.print("영어 ");
        eng = input(sc);
        System.out.print("전산 ");
        math = input(sc);

        output(name,kor,eng,math);

    }

    // 성적 입력 메소드
    public static int input(Scanner sc){
        int score = 0;

        System.out.print("점수 입력 : ");
        score = sc.nextInt();

        return score;
    }

    public static String inputName(Scanner sc){
        String name = "";

        System.out.print("이름 입력 : ");
        name = sc.next();

        return name;
    }

    // 총점 구하는 메소드
    public static int getTotal(int kor, int eng, int math){
        return kor+eng+math;
    }

    // 평균 구하는 메소드
    public static double getAvg(int num, double total){
        return total/num;
    }

    // 학점 구하는 메소드
    public static char getGrade(double avg){
        if(avg > 90){
            return 'A';
        }
        else if(avg>80){
            return 'B';
        }
        else if(avg>70){
            return 'C';
        }
        else if(avg>60){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static void output(String name, int kor, int eng, int math){
        int total = getTotal(kor,eng,math);
        double avg = getAvg(3,total);
        char grade = getGrade(avg);

        System.out.println("====== 성적표 ======");
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor + " / " + "영어 : " + eng + " / " + "전산 : " + math);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", avg);
        System.out.println("학점 : " + grade);
    }
}
