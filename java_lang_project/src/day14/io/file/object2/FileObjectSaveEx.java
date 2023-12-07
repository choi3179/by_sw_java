package day14.io.file.object2;

import java.io.*;

public class FileObjectSaveEx {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = new File("members.txt");

        String name, id, pwd, tmp, phone;
        int age = 0;
        boolean gender = true;
        name = id = pwd = tmp = phone = null;

        try{
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);

            System.out.print("이름 입력 : ");   name = br.readLine();
            oos.writeObject(name);

            System.out.print("ID 입력 : ");   id = br.readLine();
            oos.writeObject(id);

            System.out.print("패스워드 입력 : ");   pwd = br.readLine();
            oos.writeObject(pwd);

            System.out.print("성별 입력(m 남자 / f 여자) : ");   tmp = br.readLine();
            gender = tmp.equals("m");
            oos.writeObject(gender);

            System.out.print("전화번호 입력 : ");   phone = br.readLine();
            oos.writeObject(phone);

            System.out.print("나이 입력 : ");   age = Integer.parseInt(br.readLine());
            oos.writeObject(age);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            oos.close();
        }

    }
}
