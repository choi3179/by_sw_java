package day10.api.stringbuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();   // 초기용량 16

        sb.append("This");      // append로 문자열 뒤에 추가
        System.out.println(sb.length() + " / " + sb.capacity());

        sb.append(" is pencil");
        System.out.println(sb.length() + " / " + sb.capacity());

        sb.insert(7, " my");    // 특정 인덱스에 문자열 추가
        System.out.println(sb.toString() + " -> length = " + sb.length() + " / " + sb.capacity());

        sb.replace(8,10,"your");    // 특정 인덱스의 문자열 치환
        System.out.println(sb.toString() + " -> length = " + sb.length() + " / " + sb.capacity());

        sb.setLength(5);        // 문자열을 특정 길이로 줄임, 버퍼 수용 용량은 그대로
        System.out.println(sb.toString() + " -> length = " + sb.length() + " / " + sb.capacity());
    }

}
