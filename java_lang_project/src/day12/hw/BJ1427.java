package day12.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        ArrayList<String> arr = new ArrayList<String>(List.of(input.split("")));

        Collections.sort(arr,Collections.reverseOrder());

        for(String k: arr)
            System.out.print(k);
    }
}
