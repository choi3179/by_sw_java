package day15.thread.ex01;

public class UserThread extends Thread{
    String name;

    public UserThread(String name){
        this.name = name;
    }

    /*
    스레드 실행부(구현부)
     */
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            if(i==3) {
                try {
                    sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name + " delayed");
            }
            System.out.println(i);
        }
    }
}
