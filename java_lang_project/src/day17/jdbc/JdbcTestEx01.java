package day17.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTestEx01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. Driver Load
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("driver load success");

        // 2. Connection & Open
        //             [driver:IP:Port/DB명]
        String url = "jdbc:mariadb://localhost:3306/market_db";
        String uid = "root";
        String pwd = "root";

        Connection conn = DriverManager.getConnection(url,uid,pwd);
        System.out.println("connection success");

        // 3. SQL 명령어 사용(DML)

        // 4. 닫기


    }
}
