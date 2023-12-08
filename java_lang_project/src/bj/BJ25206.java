package bj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ25206 {
    public static void main(String[] args) throws IOException {

        //Scanner sc = new Scanner(System.in);
        //System.setIn(new FileInputStream("src/day10/hw/input25206.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[][] scores = new String[20][3];
        double score_sum = 0;
        double hak_sum = 0;

        for (int i = 0; i < 20; i++) {
            String[] s = br.readLine().split(" ");
            scores[i] = s;
            if (!s[2].equals("P")) {
                double hak = Double.parseDouble(s[1]);
                score_sum += hak;
                hak_sum += hak * get(s[2]);
            }
        }

        System.out.printf("%.6f", (hak_sum / score_sum));

    }

    public static double get(String p){
        switch (p){
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0.0;
        }
    }
}
