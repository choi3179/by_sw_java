package day16.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BJ1620 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = br.readLine().split(" ");
        int n = Integer.parseInt(firstInput[0]);
        int m = Integer.parseInt(firstInput[1]);

        HashMap<String,String> pokemon1 = new HashMap<>();
        HashMap<String,String> pokemon2 = new HashMap<>();

        for(int i=1;i<=n;i++){
            String name = br.readLine();
            pokemon1.put(String.valueOf(i),name);
            pokemon2.put(name,String.valueOf(i));
        }

        for(int i=0;i<m;i++){
            String quiz = br.readLine();
            if(pokemon1.containsKey(quiz))
                System.out.println(pokemon1.get(quiz));
            else if(pokemon2.containsKey(quiz))
                System.out.println(pokemon2.get(quiz));
        }

    }
}
