package day14.io.file.object;

import java.io.*;

public class ObjectOutputStreamEx {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Grade vo = new Grade();

        vo.setSubject("전산");
        vo.setScore(95);

        System.out.println(vo);

        OutputStream os = new FileOutputStream("grade.dat");
        ObjectOutputStream oos = new ObjectOutputStream(os);        // 객체를 io 저장하는 클래스
        oos.writeObject(vo);    // grade.dat에 write -> 컴파일했기 때문에 깨져보임
        oos.close();
    }
}
