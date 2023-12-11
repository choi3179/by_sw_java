package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ10815 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> mSet = new HashSet<>();
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens())
            mSet.add(Integer.parseInt(st.nextToken()));

        ArrayList<Integer> nArr = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            if(mSet.contains(Integer.parseInt(st.nextToken())))
                nArr.add(1);
            else
                nArr.add(0);
        }

        Iterator it = nArr.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");

    }
}
