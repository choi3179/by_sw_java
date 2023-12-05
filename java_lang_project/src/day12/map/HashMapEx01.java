package day12.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap map = new HashMap();

        map.put("encore", "1234");
        map.put("kisa", "5678");
        map.put("encore", "4321");      // 같은 키값을 put하면 그 키값의 value가 갱신됨.

        System.out.println(map + " && size : " + map.size());

        while(true) {
            System.out.print("id 입력 : ");
            String id = sc.nextLine().trim();
            System.out.print("비밀번호 입력 : ");
            String pwd = sc.nextLine().trim();

            if (!map.containsKey(id)) {    // key 존재 여부 확인
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            } else{
                if(!(map.get(id).equals(pwd))){
                    System.out.println("비밀번호가 잘못되었습니다.");
                }else{
                    System.out.println("로그인 완료");
                    break;
                }
            }
        }

    }
}
