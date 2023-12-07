package day14.io.file;

import java.io.File;
import java.io.IOException;

public class FileEx01 {
    public static void main(String[] args) throws IOException {

        File file = null;
        byte[] fileName = new byte[100];

        String strName;

        System.in.read(fileName);
        strName = new String(fileName).trim();

        file = new File(strName);
        System.out.println("파일 절대 경로  : " + file.getAbsolutePath());
        System.out.println("파일 표준 경로  : " + file.getCanonicalPath());
        System.out.println("파일 최종수정일  : " + file.lastModified());
        System.out.println("파일 크기  : " + file.length());
        System.out.println("파일 읽기 속성  : " + file.canRead());
        System.out.println("파일 쓰기 속성  : " + file.canWrite());
        System.out.println("파일 경로  : " + file.getPath());
        System.out.println("파일 숨김 속성  : " + file.isHidden());


    }
}
