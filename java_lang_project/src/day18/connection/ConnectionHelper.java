package day18.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * DB연결의 반복 해결
 * Connection.getConnection("mariadb") or ("oracle")... => dsn(Data Source Name)
 */
public class ConnectionHelper {

    public static Connection getConnection(String dsn){
        Connection conn = null;

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

    public static Connection getConnection(String dsn, String userId, String pwd){
        Connection conn = null;

        try{
            if(dsn.equals("mariadb")){
                Class.forName("org.mariadb.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", userId, pwd);
            }
            else if(dsn.equals("oracle")){
                Class.forName("oracle.jdbc.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@hostname:port:orcl", userId, pwd);
            }
            else if(dsn.equals("mysql")){
                Class.forName("org.git.mm.mysql.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", userId, pwd);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            return conn;
        }
    }
}

