package day09.abs_interface.quiz01;

public class Subway implements Trans{

    public Subway() {
        System.out.println("Subway Trans Constructor");
    }
    @Override
    public void start() {
        System.out.println("Subway start");
    }

    @Override
    public void stop() {
        System.out.println("Subway stop");
    }
}
