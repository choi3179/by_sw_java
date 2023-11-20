package ex01.basic;

public class DataType {
    public static void main(String[] args) {
        short sh = -32768; // -32768 ~ 32767
        int su = 32769;

        su = sh; // 자동 형변환
        sh = (short)su;  // 명시적 형변환 -> 데이터 손실 발생
    }
}
