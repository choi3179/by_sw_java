package day6.method;

import java.util.Scanner;

public class MethodQuiz01 {

    public static void main(String[] args) {
        String name = "";
        String phone = "";
        String adr = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        name = sc.nextLine();
        System.out.print("연락처 입력 : ");
        phone = sc.nextLine();
        System.out.print("주소 입력 : ");
        adr = sc.nextLine();


        info(name,phone,adr);
    }

    public static void info(String name, String phone, String adr){
        System.out.println("이름 : " + name);
        System.out.println("연락처 : " + phone);
        System.out.println("주소 : " + adr);
    }
}
