package day10.hw;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();

        StringTokenizer st = new StringTokenizer(input);

        int answer = st.countTokens();

        System.out.println(answer);
    }
}
