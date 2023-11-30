package day09.abs_interface.ex01;

public class BB implements IDraw{

    @Override
    public void draw() {
        System.out.println("BB class -> IDraw interface draw method overriding");
        System.out.println(su);
    }

    public void show() {
        System.out.println("BB show() " + su);
    }
}
