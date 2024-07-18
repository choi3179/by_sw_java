package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n;

        while((n = br.readLine()) != null) {

            int N = Integer.parseInt(n);
            int length = (int)Math.pow(3,N);
            StringBuilder sb = new StringBuilder();

            char[] kant = new char[length];
            for(int i = 0; i < length; i++) {
                kant[i] = '-';
            }

            convert(kant, 0, length);

            for(int i=0;i<length;i++){
                sb.append(String.valueOf(kant[i]));
            }

            System.out.println(sb);
        }

    }

    public static void convert(char[] kant, int start, int size) {

        if(size <= 1)
            return;

        int newLength = size/3;



        for(int i=start + newLength;i<start + newLength*2;i++) {
            kant[i] = ' ';
        }

        convert(kant, start, newLength);
        convert(kant, start + newLength*2, newLength);
    }
}
