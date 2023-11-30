package day08.inheritance.quiz02;

import java.util.Scanner;

public class Person {

    Scanner sc = new Scanner(System.in);

    protected String name;
    protected String gender;
    int age;

    public Person(){
        //input();
    }

    public void input(){
        System.out.print("이름 입력 : ");
        name = sc.next();
        System.out.print("성별 입력 : ");
        gender = sc.next();
        System.out.print("나이 입력 : ");
        age = sc.nextInt();
    }

    public void display(){
        System.out.println("이름 : " + name);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
