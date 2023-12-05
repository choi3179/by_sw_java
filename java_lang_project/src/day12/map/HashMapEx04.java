package day12.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx04 {
    public static void main(String[] args) {
        String data[] = {"K","A","A","K","D","K","A","K","K","K","Z","D"};

        HashMap map = new HashMap();

        for(int i=0;i<data.length;i++){
            if(map.containsKey(data[i])){
                int val = (int)map.get(data[i]);
                map.put(data[i],val + 1);
            }
            else{
                map.put(data[i],1);
            }
        }

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int val = (int)entry.getValue();
            System.out.println(entry.getKey() + " : " + printBar('#',val) + " " + val);
        }
    }

    static String printBar(char ch, int val){
        char[] bar = new char[val];

        for(int i=0;i<val;i++){
            bar[i] = ch;
        }
        return new String(bar);
    }
}
