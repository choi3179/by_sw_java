package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class BJ25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> gom= new HashSet<>();

        int emo = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                emo = gom.size();
                ans += emo;
                gom.clear();
            }
            else{
                gom.add(input);
            }
        }
        ans += gom.size();
        System.out.println(ans);
    }
}
