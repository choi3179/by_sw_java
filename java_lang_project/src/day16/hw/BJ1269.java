package day16.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BJ1269 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        TreeSet<Integer> aSet = new TreeSet<>();
        TreeSet<Integer> bSet = new TreeSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            aSet.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            bSet.add(Integer.parseInt(st.nextToken()));

        TreeSet<Integer> aCha = new TreeSet<>();
        TreeSet<Integer> bCha = new TreeSet<>();

        Iterator<Integer> it = aSet.iterator();
        while(it.hasNext()){
            int tmp = it.next();
            if(!bSet.contains(tmp))
                aCha.add(tmp);
        }

        it = bSet.iterator();
        while(it.hasNext()){
            int tmp = it.next();
            if(!aSet.contains(tmp))
                bCha.add(tmp);
        }

        int ans = aCha.size() + bCha.size();

        System.out.println(ans);
    }
}
