package bj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ14425 {
    public static void main(String[] args) throws IOException {

        //System.setIn(new FileInputStream("src/bj/input14425.txt"));
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String[] spl = br.readLine().split(" ");

        int m = Integer.parseInt(spl[0]);
        int n = Integer.parseInt(spl[1]);
        int ans = 0;

        String[] check = new String[m];
        for(int i=0;i<m;i++){
            check[i] = br.readLine();
        }

        //String[] patterns = new String[n];
        for(int i=0;i<n;i++){
            String patterns = br.readLine().trim();
            for(int j=0;j<m;j++){
                if(check[j].equals(patterns)){
                    ans++;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}
