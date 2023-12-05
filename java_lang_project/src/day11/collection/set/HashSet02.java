package day11.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet02 {

    public static void main(String[] args) {

        Object[] objArr = {"1", new Integer(1), "2","3","4","4","4"};

        Set set = new HashSet();    // 중복되는 데이터는 제거되고 Object 타입이더라도 같은 자료형으로 인식한다.
        for(int i=0;i<objArr.length;i++){
            set.add(objArr[i]);
        }
    }
}
