package day12.hw;

import java.util.Scanner;

public class BJ1193 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int n = 0;
        int g = 0;              // 대각선 그룹에서 제일 큰 인덱스
        while(g < input){       // 대각선 몇번째 그룹에 있는지 확인
            n++;
            g = n*(n+1) / 2;
        }

        int top = 1;    // 분자
        int bot = 1;    // 분모
        if(n == 1)
            System.out.println("1/1");
        else{
            int cha = g - input;
            if(n%2 == 0){       // 그룹이 짝수면 그룹 내 최고 인덱스의 분자가 n
                top = n - cha;
                bot = 1 + cha;
            }
            else{               // 그룹이 홀수면 그룹 내 최고 인덱스의 분모가 n
                top = 1 + cha;
                bot = n - cha;
            }
            System.out.println(top+"/"+bot);
        }
    }
}
