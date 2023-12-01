package day10.api.wrapper;

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {

        char data[] = {'a','b','c'};
        String str = new String(data);
        System.out.println("str : " + str);

        String str2 = "abcd".substring(2);      // begin~end 인덱스의 문자 추출
        System.out.println("str2 substring" + str2);

        String s1 = "happy";
        String s2 = "Seoul";
        System.out.println(s1.concat(s2));      // 문자열 병합

        System.out.println(s1.replace("eo", "korea"));  // 문자열 부분 치환

        String s3 = "            ab              cd                ";
        System.out.println(s3.length());
        System.out.println(s3.trim() + " length --> " + s3.length());

        String s4 = new String("abc/sadsad/sadasd/d34/d123");
        String[] spl_s4 = s4.split("/");
        System.out.println(Arrays.toString(spl_s4));

        String s5 = "1234567890abcdefghiff";
        char ch5 = s5.charAt(7);        // 인덱스 위치의 문자 리턴
        System.out.println(ch5);
        System.out.println(s5.indexOf('f'));            // 문자열에서 해당 문자가 존재하는 첫 번째 인덱스 리턴
        System.out.println(s5.lastIndexOf('f'));    // 문자열에서 해당 문자가 존재하는 마지막 인덱스 리턴

    }
}
