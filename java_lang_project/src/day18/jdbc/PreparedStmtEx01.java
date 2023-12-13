package day18.jdbc;

import java.sql.*;

public class PreparedStmtEx01 {

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

        // 3. SQL 명령어 사용(DML - INSERT) PreparedStatement 사용
        String sql = "insert into gift values(?,?,?,?)";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setInt(1,12);
        psmt.setString(2,"컴퓨터");
        psmt.setInt(3,500000);
        psmt.setInt(4,700000);

        int result = psmt.executeUpdate();

        // 4. 닫기
        psmt.close();
        conn.close();
    }
}
