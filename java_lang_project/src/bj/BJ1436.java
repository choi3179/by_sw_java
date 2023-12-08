package bj;

import java.util.Scanner;

public class BJ1436 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 0;
        int cnt = 0;
        while(true){
            if(Integer.toString(num).contains("666")){
                cnt++;
                if(cnt == n)
                    break;
            }
            num++;
        }

        System.out.println(num);
    }
}
