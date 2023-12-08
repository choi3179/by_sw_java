package day15.syncronized.ex01;

public class UserAtm extends Thread {

    Atm obj;
    boolean flag = false;

    public UserAtm(Atm obj, String name) {
        super(name);
        this.obj = obj;
    }

    @Override
    public void run() {
        for(int i=0;i<2;i++){
            try{
                sleep(50);
            }
            catch(Exception e){
                e.printStackTrace();
            }

            if(flag){
                obj.deposit((int)(Math.random() * 10 + 2) * 100, getName());
            }
            else{
                obj.withdraw((int)(Math.random() * 10 + 2) * 100, getName());
            }

            flag = true;
            obj.getMoney();
        }
    }
}
