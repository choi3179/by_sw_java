package day15.syncronized.ex01;

public class Atm {

    private int money;

    public Atm(int money) {
        this.money = money;
    }

    /**
     * 동기화 하는 방법
     * 1. 함수 앞에 예약어 synchronized를 사용
     * 2. synchronized 로 임계영역을 직접 지정한다.
     */
    public synchronized void deposit(int amount,String name){
        money += amount;
        System.out.println(name + " : 입금금액 " + amount);
    }

    public void withdraw(int amount, String name) {
        synchronized (this) {
            if((money - amount) > 0){
                money -= amount;
                System.out.println(name + " : 출금금액 " + amount);
            }
            else{
                System.out.println(name + " :  출금 불가(잔액부족)");
            }
        }
    }

    public void getMoney() {
        System.out.println("\t\t\t 잔액은 : " + money);
    }
}
