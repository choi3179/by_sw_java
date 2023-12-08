package bj;

import java.util.Scanner;

public class PGTwoCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r1 = Integer.parseInt(args[0]);
        int r2 = Integer.parseInt(args[1]);
        long r1p = (long) Math.pow(r1,2);
        long r2p = (long) Math.pow(r2,2);

        int answer = 0;

        for(int x=0;x<=r2;x++){
            long y1 = (long)Math.sqrt(r1p - Math.pow(x,2));     // y의 최솟값
            long y2 = (long)Math.sqrt(r2p - Math.pow(x,2));     // y의 최댓값
            if(Math.sqrt((r1p - Math.pow(x,2))) % 1 == 0)
                answer++;
            answer += (y2 - y1);
        }

        System.out.println((answer-1)*4);
    }

}
