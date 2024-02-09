package inflearn.inf01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inf0111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        ArrayList<Character> chList = new ArrayList<>();
        char l = ' ';
        int cnt = 0;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == l){
                cnt++;
            }
            else{
                chList.add(l);
                if(cnt > 1)
                    chList.add((char)(cnt + '0'));
                l = input.charAt(i);
                cnt = 1;
            }
        }

        chList.add(l);
        if(cnt > 1)
            chList.add((char)(cnt + '0'));

        StringBuilder sb = new StringBuilder();
        for(char c : chList)
            sb.append(c);

        System.out.println(sb.toString().trim());
    }
}
