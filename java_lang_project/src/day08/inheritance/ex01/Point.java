package day08.inheritance.ex01;

public class Point {
    protected int x;
    protected int y;

    public Point(){
        System.out.println("Point class default Constructor");
    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("Point class 2 Constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void disp(){
        System.out.print("Point(" + x + "," + y + ")");
    }
}
