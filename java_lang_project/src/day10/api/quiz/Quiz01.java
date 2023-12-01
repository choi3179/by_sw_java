package day10.api.quiz;

public class Quiz01 {
    public static void main(String[] args) {
        String str = "abcDEFGHeijwEIMPYmnqr";

        char[] newStr = new char[str.length()];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch<='Z'){
                newStr[i] = (char)(ch - 'A' + 'a');
            }
            else if(ch >= 'a' && ch <= 'z'){
                newStr[i] = (char)(ch - 'a' + 'A');
            }
        }

        String ans = new String(newStr);
        System.out.println(ans);
    }
}
