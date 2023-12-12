package day16.network.tcp06_extern;

import java.io.*;
import java.net.*;

public class ServerChat {
	public static void main(String[] args) throws IOException {
			int port = 8000;
			ServerSocket  ss = new ServerSocket(port);
			System.out.println("chat server start");
			
			while( true ) {
				Socket s = ss.accept();
				InputStream is = s.getInputStream();  //
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				PrintStream  ps = new PrintStream(System.out);
				
				ps.print( s.getInetAddress().getHostAddress() );  //
				String str = br.readLine();
				byte[] buffer = str.getBytes("euc-kr");   // or UTF-8
				String message = new String(buffer, "euc-kr");
				
				ps.print("     :  에서 수신 메시지 =====>  " + message);
				
				br.close();
				s.close();
			}
	}
}





