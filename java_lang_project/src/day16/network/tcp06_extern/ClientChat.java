package day16.network.tcp06_extern;
import java.io.*;
import java.net.*;

public class ClientChat {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		String ip, str;
		
		PrintStream ps = new PrintStream(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드로 입력
		
		ps.print("접속 ip ==> "); 			ip = br.readLine();
		ps.print("전송 메시지 ==>  "); 		str = br.readLine();
		
		byte[] buffer = str.getBytes("euc-kr");
		String message = new String(buffer, "euc-kr");
		
		Socket  client = new Socket(ip, port);  	// server ip /port number socket create
		OutputStream os = client.getOutputStream(); // 네트워크를 ip 통해서 쓰기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write(message, 0, message.length());
		//bw.write(str, 0, message.length());
		bw.flush();  
		
		bw.close();		client.close();
		ps.println(ip + "~~에서 메세지 전송 성공");
		ps.close();
	}
}





