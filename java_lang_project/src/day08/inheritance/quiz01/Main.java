package day08.inheritance.quiz01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        int empno = 0;
        String dept = "";
        String tel = "";
        String lev = "";
        double sal = 0;

        System.out.print("이름 입력 : ");
        name = sc.next();
        System.out.print("사원 번호 입력 : ");
        empno = sc.nextInt();
        System.out.print("부서 입력 : ");
        dept = sc.next();
        System.out.print("전화 번호 입력 : ");
        tel = sc.next();
        System.out.print("직책 입력 : ");
        lev = sc.next();
        System.out.print("급여 입력 : ");
        sal = sc.nextDouble();

        Sales s = new Sales(name,empno,dept,tel,lev,sal);
        s.disp();

    }
}
