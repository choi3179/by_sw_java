package day14.io.file;

import java.io.*;

public class FileCopyEx01 {
    public static void main(String[] args) {
        File src = new File("C:\\Users\\Playdata\\Desktop\\PLAYDATA 자료\\노트.txt");
        File dist = new File("C:\\Users\\Playdata\\Desktop\\PLAYDATA 자료\\자바\\소스모음\\java_lang_project\\src\\day14\\io\\fileCopyEx.dat");

        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int c;

        try{
            fis = new FileInputStream(src);         // 파일 입력 바이트 스트림
            fos = new FileOutputStream(dist);       // 파일 출력 바이트 스트림
            bis = new BufferedInputStream(fis);     // 버퍼 입력 스트림 연결
            bos = new BufferedOutputStream(fos);    // 버퍼 출력 스트림 연결
            while((c = bis.read()) != -1){
                bos.write((char) c);
            }

            System.out.println("파일 복사 성공");
            bis.close();
            bos.close();
            fis.close();
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
