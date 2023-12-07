package day14.io.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopyEx01 {
    public static void main(String[] args) throws MalformedURLException, IOException {

        URL url = new URL("https://www.google.co.kr/imgres?imgurl=https%3A%2F%2Fcdn-store.leagueoflegends.co.kr%2Fimages%2Fv2%2Femotes%2F1498.png&tbnid=1n9g8LYjqweqqM&vet=12ahUKEwjkn5qGrvyCAxXZmVYBHSmWAHoQMygDegQIARBz..i&imgrefurl=https%3A%2F%2Fstore.leagueoflegends.co.kr%2Femotes%2F1498&docid=d7ZTwcOpveZbOM&w=256&h=256&q=%ED%8F%AC%EB%A1%9C&ved=2ahUKEwjkn5qGrvyCAxXZmVYBHSmWAHoQMygDegQIARBz");

        // 읽기 객체
        InputStream is = url.openStream();

        // 쓰기 객체
        OutputStream os = new FileOutputStream("google.jpg");

        byte[] buffer = new byte[1024*8];

        while(true){
            int inputData = is.read(buffer);
            if(inputData == -1) break;
            os.write(buffer,0,inputData);
        }

        is.close();
        os.close();
        System.out.println("웹 파일 복사 완료");
    }
}
