package day15.thread.ex03;

public class Main {
    public static void main(String[] args) {
       /* GraphicThread gr = new GraphicThread(5);
        Thread gt = new Thread(gr);

        gt.start();*/
        new Thread(new GraphicThread(10)).start();
    }
}
