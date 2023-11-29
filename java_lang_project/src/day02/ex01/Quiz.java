package day02.ex01;

public class Quiz {
    public static void main(String[] args) {

        int su = 12345;

        System.out.println("시 : " + 12345 / 3600);
        System.out.println("분 : " + 12345 % 3600 / 60);
        System.out.println("초 : " + 12345 % 3600 % 60);

        /*int pay = 567890;
        int result = 0;

        System.out.println("만원 : " + pay / 10000);
        pay = pay % 10000;
        System.out.println("천원 : " + pay / 1000);
        pay = pay % 1000;
        System.out.println("백원 : " + pay / 100 );
        pay = pay % 100;
        System.out.println("십원 : " + pay / 10);
*/
        /*for(int i=4;i>0;i--){
            int won = (int)pow(10,i);
            System.out.println(won + "원 : " + pay / won + "장");
            pay = pay % won;
        }*/
    }
}
