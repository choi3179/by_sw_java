package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ7785 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String,Boolean> cls = new TreeMap<>(Comparator.reverseOrder());

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String[] input = br.readLine().split(" ");
            if(cls.containsKey(input[0]) && input[1].equals("leave")){
                cls.put(input[0],false);
            }
            else{
                cls.put(input[0],true);
            }
        }

        Iterator it = cls.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry map = (Map.Entry)it.next();
            if((Boolean)map.getValue())
                System.out.println(map.getKey());
        }
    }
}
