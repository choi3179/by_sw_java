package day18.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CloseHelper {

    public static void close(Connection conn){
        if(conn != null){
            try{
                conn.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void close(Statement stmt){
        if(stmt != null){
            try{
                stmt.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void close(PreparedStatement psmt){
        if(psmt != null){
            try{
                psmt.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
