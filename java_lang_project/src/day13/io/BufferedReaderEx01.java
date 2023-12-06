package day13.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx01 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("character input : ");
        String str = bf.readLine();
        String str2 = bf.readLine();

        System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
    }
}
