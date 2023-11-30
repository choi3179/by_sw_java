package day09.abs_interface.quiz01;

public class Bus implements Trans{

    public Bus(){
        System.out.println("Bus Trans Constructor");
    }
    @Override
    public void start() {
        System.out.println("Bus start");
    }

    @Override
    public void stop() {
        System.out.println("Bus stop");
    }
}
