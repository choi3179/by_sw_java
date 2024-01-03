package bj.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BJ11866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[] split = br.readLine().split(" ");

        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=1;i<=N;i++)
            list.add(i);

        sb.append("<");
        while(list.size() > 1){
            for(int i=0;i<K-1;i++){
                list.add(list.pop());
            }
            sb.append(list.pop()).append(",");
        }

        sb.append(list.pop());
        sb.append(">");

        System.out.println(sb);

        br.close();
    }
}
