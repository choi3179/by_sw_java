package day15.thread.ex02;

public class UserRunnable implements Runnable{

    String name;

    public UserRunnable(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("runnable run() call");

        for(int i=0;i<10;i++){
            if(i==4){
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + " wake up");
            }
            System.out.println(name + ">> " + i);
        }
    }
}
