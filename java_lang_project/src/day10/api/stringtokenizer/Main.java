package day10.api.stringtokenizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("this is a test");

        while(st.hasMoreTokens()){      // 다음 토큰의 존재 유무 boolean 리턴
            System.out.println(st.nextToken());     // 토큰화한 객체의 다음 토큰 출력
        }

        System.out.println("-------------");
        StringTokenizer st2 = new StringTokenizer("abcd/efgh/jklm","/");
        while(st2.hasMoreTokens()){      // 다음 토큰의 존재 유무 boolean 리턴
            System.out.println(st2.nextToken());     // 토큰화한 객체의 다음 토큰 출력
        }

        System.out.println("-------------");
        StringTokenizer st3 = new StringTokenizer("사과/!초콜렛/!샴페인=1", "/!",true);
        while (st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }
    }
}
