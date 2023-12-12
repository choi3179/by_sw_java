package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1764 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        HashMap<String, Boolean> heard = new HashMap<>();
        for(int i=0;i<n;i++){
            heard.put(br.readLine(),false);
        }

        TreeSet<String> ans = new TreeSet<>();
        for(int j=0;j<m;j++){
            String input = br.readLine();
            if(heard.containsKey(input)){
                ans.add(input);
            }
        }

        System.out.println(ans.size());
        for(String str: ans)
            System.out.println(str);


    }
}
