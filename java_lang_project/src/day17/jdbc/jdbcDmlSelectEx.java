package day17.jdbc;

import java.sql.*;

public class jdbcDmlSelectEx {
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
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM MEMBER");     // 쿼리에 대한 반환값 저장

        System.out.println("ResultSet의 결과값 조회");
        System.out.println("mem_id\tmem_name\tmem_num");
        while(rs.next()){
            String mem_id = rs.getString(1);
            String mem_name = rs.getString(2);
            int mem_num = rs.getInt(3);
            System.out.println(mem_id + "\t\t" + mem_name + "\t\t" + mem_num);
        }

        // 4. 닫기
        rs.close();
        stmt.close();
        conn.close();

    }
}
