package day14.io.file;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            OutputStream os = new FileOutputStream("fileEx01.txt");     // 예외 발생

            while (true){
                System.out.print("문자열 입력 : ");
                String str = sc.next() + "\r\n";

                if(str.equalsIgnoreCase("EXIT\r\n")) {
                    System.out.println(str.length() + " byte 만큼 작성");
                    break;
                }

                os.write(str.getBytes());       // 예외 발생
                System.out.println(str);
            }
        }
        catch(Exception e){

        }
    }
}
