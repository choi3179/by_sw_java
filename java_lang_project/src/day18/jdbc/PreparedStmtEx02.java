package day18.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtEx02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. Driver Load
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("driver load success");

        // 2. Connection & Open
        //             [driver:IP:Port/DB명]
        String url = "jdbc:mariadb://localhost:3306/encore";
        String uid = "root";
        String pwd = "root";

        Connection conn = DriverManager.getConnection(url,uid,pwd);
        System.out.println("connection success");

        // 3. SQL 명령어 사용(DML - DELETE) PreparedStatement 사용
        String sql = "delete from gift where gname = ? ";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setString(1,"컴퓨터");

        int result = psmt.executeUpdate();
        conn.commit();

        // 4. 닫기
        psmt.close();
        conn.close();
    }
}
