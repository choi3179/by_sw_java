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
            // 스택의 크기가 폭탄 문자열보다 크거나 같으면 검사
            if(stack.size() >= pattern.length()) {
                int cnt = 0;    // 패턴 길이와 일치하면 폭탄으로 인지함.
                for(int j=pattern.length()-1;j>=0;j--){
                    if(stack.get(stack.size()-pattern.length()+j) == pattern.charAt(j))
                        cnt++;
                }

                if(cnt == pattern.length()){
                    for(int k=0;k<pattern.length();k++)     // 폭발 문자열은 스택에서 제거
                        stack.pop();
                }
            }

        }

        if(stack.isEmpty())
            sb.append("FRULA");
        else{
            for(char k : stack)
                sb.append(k);
        }

        System.out.println(sb);
    }
}
