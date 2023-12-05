package day12.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx03 {

    static HashMap phoneBook = new HashMap();
    public static void main(String[] args) {

        addPhoneNo("친구","kim","010-1234-5678");
        addPhoneNo("친구","choi","010-1111-2222");
        addPhoneNo("친구","lee","010-3333-4444");
        addPhoneNo("회사","park","010-5555-6666");
        addPhoneNo("회사","cho","010-7777-4444");
        addPhoneNo("회사","yun","010-3333-9999");
        addPhoneNo("가게","012-304-5678");

        printAll();
    }

    /*
     그룹을 추가하는 함수
     HashMap 안에 value로 또 다른 HashMap 추가
     */
    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName)){
            phoneBook.put(groupName,new HashMap());
        }
    }

    /*
    그룹 이름이 같이 인자로 올 경우 해당 그룹 HashMap에 추가하는 함수
     */
    static void addPhoneNo(String groupName, String name, String tel){
        addGroup(groupName);

        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel,name);
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타",name,tel);
    }

    static void printAll(){
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){    // phoneBook HashMap Iterator
            Map.Entry e= (Map.Entry)it.next();  // phoneBook map에 또 다른 map이 value로 존재

            Set subset = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subset.iterator();

            System.out.println("* " + e.getKey() + "[" + subset.size() + "]");

            while(subIt.hasNext()){     // Group HashMap Iterator
                Map.Entry subE = (Map.Entry)subIt.next();
                String tel = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + tel);
            }
            System.out.println();
        }
    }
}
