package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 일반 문자열 비교할 시 시간 초과
 * STACK을 이용한 순차적 검색을 통해 해결
 */
public class BJ9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String pattern = br.readLine();     // 폭발 문자열

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
            if(stack.size() >= pattern.length()) {

            }
        }

    }
}
