package inflearn.inf01;

import java.util.Scanner;

public class Inf0102 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String input1 = in.next();
        StringBuffer sb = new StringBuffer();

        for(char x: input1.toCharArray()){
            if(x >= 'A' && x <= 'Z')
                sb.append(String.valueOf(x).toLowerCase());
            else
                sb.append(String.valueOf(x).toUpperCase());
        }

        System.out.println(sb);
    }
}