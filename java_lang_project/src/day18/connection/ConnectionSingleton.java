package day18.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Connection 드라이버를 매번 로드해야 하는 문제점
 * 싱글톤 패턴을 적용하여 Connection을 하나의 공유 자원으로써 객체 생성
 */
public class ConnectionSingleton {

    private static Connection conn;     // 하나의 프로세스에서 공통으로 사용하기 위한 Connection(static)
    private ConnectionSingleton(){}
    public static Connection getConnection(String dsn){

        if(conn!=null){
            return conn;
        }

        try{
            if(dsn.equals("mariadb")){
                Class.forName("org.mariadb.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "root");
            }
            else if(dsn.equals("oracle")){
                Class.forName("oracle.jdbc.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@hostname:port:orcl", "root", "root");
            }
            else if(dsn.equals("mysql")){
                Class.forName("org.git.mm.mysql.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            return conn;
        }
    }

    public static void close() throws SQLException {
        if(conn != null){
            if(!conn.isClosed())
                conn.close();
        }
    }
}
