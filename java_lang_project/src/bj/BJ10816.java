package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ10816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer,Integer> cards = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens()){
            int card = Integer.parseInt(st.nextToken());
            if(cards.containsKey(card)){
                int num = cards.get(card);
                cards.put(card,num+1);
            }
            else
                cards.put(card,1);
        }

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            int card = Integer.parseInt(st.nextToken());
            sb.append(cards.getOrDefault(card,0)).append(" ");
        }

        System.out.println(sb);

    }
}
