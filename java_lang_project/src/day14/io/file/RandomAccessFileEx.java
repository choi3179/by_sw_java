package day14.io.file;

import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) throws Exception{

        RandomAccessFile raf = new RandomAccessFile("sawon.txt","rw");

        for(int i=0;i<=10;i++){
            raf.seek(i*200);    // 포지션 위치를 찾음
            String str = "hello";
            raf.writeUTF(str+i);
        }

        for(int i=0;i<=10;i++){
            raf.seek(i*200);
            System.out.println(raf.readUTF());
        }
        System.out.println("작성 완료");
    }
}
