package inflearn.inf01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inf0105 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] ch = input.toCharArray();
        /*char[] ansCh = new char[ch.length];

        for(int i=0;i<ch.length;i++){
            if(Character.isAlphabetic(ch[i])){
                ansCh[ch.length - i - 1] = ch[i];
            }
            else{
                ansCh[i] = ch[i];
            }
        }

        System.out.println(new String(ansCh));*/

        int l = 0, r = ch.length -1;
        while(l<r){
            if(!Character.isAlphabetic(ch[l])) l++;
            else if(!Character.isAlphabetic(ch[r])) r--;
            else{
                char tmp = ch[l];
                ch[l] = ch[r];
                ch[r] = tmp;
                l++;
                r--;
            }
        }
        System.out.println(new String(ch));
    }
}
