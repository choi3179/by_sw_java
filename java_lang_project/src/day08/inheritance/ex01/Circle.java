package day08.inheritance.ex01;

public class Circle extends Point{
    private int r;

    public Circle(int x,int y, int r){
        super(x,y);
        this.r=r;
        System.out.println("Circle class 2 Constructor");
    }

    public Circle() {
        r = 5;
        System.out.println("Circle class default Constructor");
    }

    void disp() {
        System.out.println(x + ", " + y + ", " + r);
    }
}
