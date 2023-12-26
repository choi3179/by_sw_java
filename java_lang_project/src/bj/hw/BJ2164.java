package bj.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BJ2164 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=1;i<=n;i++)
            list.add(i);

        int cnt = 0;    //
        while(list.size() > 1){        // 카드가 한장 남을때 까지
            list.removeFirst();
            int tmp = list.removeFirst();
            list.add(tmp);
        }

        System.out.println(list.pop());

        br.close();
    }
}
