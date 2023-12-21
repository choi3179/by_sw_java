package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BJ1037 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        TreeSet<Integer> yak = new TreeSet<>();

        while(st.hasMoreTokens())
            yak.add(Integer.parseInt(st.nextToken()));

        int max = yak.last();
        int min = yak.first();

        System.out.println(min * max);

    }
}
