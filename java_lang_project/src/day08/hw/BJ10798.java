package day08.hw;

import java.util.Scanner;

public class BJ10798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] words = new char[5][15];

        for(int i=0;i<words.length;i++){
            String word = sc.nextLine();
            for(int j=0;j<word.length();j++){
                if(word.charAt(j) == '\0')
                    break;
                words[i][j] = word.charAt(j);
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<words.length;j++){
                if(words[j][i] != '\0')
                    System.out.print(words[j][i]);
            }
        }

    }
}
