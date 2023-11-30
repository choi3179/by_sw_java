package day08.inheritance.quiz02;

import java.util.Scanner;

public class Student extends Person{

    Scanner sc = new Scanner(System.in);
    private int score;

    public Student() {
        super.input();
        input();
    }

    public void input(){
        System.out.print("점수 입력 : ");
        score = sc.nextInt();
    }

    public void display() {
        super.display();
        System.out.println("점수 : " + score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
