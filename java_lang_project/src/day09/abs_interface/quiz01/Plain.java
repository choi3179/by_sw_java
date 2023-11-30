package day09.abs_interface.quiz01;

public class Plain implements Trans{

    public Plain(){
        System.out.println("Plain Trans Constructor");
    }
    @Override
    public void start() {
        System.out.println("Plain start");
    }

    @Override
    public void stop() {
        System.out.println("Plain stop");
    }
}
