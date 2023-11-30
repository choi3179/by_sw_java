package day09.abs_interface.quiz01;

public class Bicycle implements Trans{

    public Bicycle(){
        System.out.println("Bicycle Trans Constructor");
    }

    @Override
    public void start() {
        System.out.println("Bicycle start");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stop");
    }
}
