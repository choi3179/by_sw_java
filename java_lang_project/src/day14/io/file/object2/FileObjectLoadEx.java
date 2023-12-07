package day14.io.file.object2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileObjectLoadEx {
    public static void main(String[] args) throws Exception{

        File f = new File("members.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        String name, id, pwd, tmp, phone;
        int age = 0;
        boolean gender = true;
        name = id = pwd = tmp = phone = null;

        try{
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            name = (String)ois.readObject();
            id = (String)ois.readObject();
            pwd = (String)ois.readObject();
            gender = (Boolean)ois.readObject();
            phone = (String)ois.readObject();
            age = (Integer)ois.readObject();

            System.out.println("이름 : " + name);
            System.out.println("ID : " + id);
            System.out.println("비밀번호 : " + pwd);
            System.out.println("성별 : " + (gender ? "남" : "여"));
            System.out.println("전화번호 : " + phone);
            System.out.println("나이 : " + age);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            fis.close();
        }
    }
}
