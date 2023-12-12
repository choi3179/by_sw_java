package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class BJ11478 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<String> parts = new TreeSet<>();

        String input = br.readLine();

        for(int i=0;i<input.length();i++){
            for(int j=i;j<input.length();j++){
                parts.add(input.substring(i,j+1));
            }
        }

        System.out.println(parts.size());
    }
}
