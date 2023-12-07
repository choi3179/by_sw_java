package day14.io.file.object;

import java.io.*;

public class ObjectInputStreamEx {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        InputStream is = new FileInputStream("grade.dat");
        ObjectInputStream ois = new ObjectInputStream(is);

        Grade vo = (Grade)ois.readObject();
        System.out.println("grade.dat의 데이터 : " + vo);
    }
}
