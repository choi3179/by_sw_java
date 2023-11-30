package day09.abs_interface.quiz01;

public class Main {
    public static void main(String[] args) {

        Trans plain = new Plain();
        plain.start();
        plain.stop();

        Trans subway = new Subway();
        subway.start();
        subway.stop();

        Trans bicycle = new Bicycle();
        bicycle.start();
        bicycle.stop();

        Trans bus = new Bus();
        bus.start();
        bus.stop();

    }
}
