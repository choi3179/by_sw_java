package day18.jdbc.crud;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class GiftDB {

    Connection conn;

    public GiftDB() throws SQLException, ClassNotFoundException {
        connect();
    }

    public void connect() throws ClassNotFoundException, SQLException {
        // 1. Driver Load
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("driver load success");

        // 2. Connection & Open
        String url = "jdbc:mariadb://localhost:3306/encore";
        String uid = "root";
        String pwd = "root";

        conn = DriverManager.getConnection(url,uid,pwd);
        System.out.println("connection success");
    }

    public void selectAll() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM gift");     // 쿼리에 대한 반환값 저장

        System.out.println("전체 데이터 조회");
        System.out.println("gno\tgname\tg_start\tg_end");
        while(rs.next()){
            int gno = rs.getInt(1);
            String gname = rs.getString(2);
            int g_start = rs.getInt(3);
            int g_end = rs.getInt(4);
            System.out.println(gno + "\t" + gname + "\t" + g_start + "\t" + g_end);
        }
        System.out.println();

        rs.close();
        stmt.close();
    }

    public void selectByGno(int gno) throws SQLException {

        String sql = "select * from gift where gno = ?";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setInt(1,gno);

        ResultSet rs = psmt.executeQuery();

        System.out.println("GNO " + gno + " 데이터 조회");
        System.out.println("gno\tgname\tg_start\tg_end");
        while(rs.next()){
            String gname = rs.getString(2);
            int g_start = rs.getInt(3);
            int g_end = rs.getInt(4);
            System.out.println(gno + "\t" + gname + "\t" + g_start + "\t" + g_end);
        }

        System.out.println();
        rs.close();
    }

    public void update(int gno, String gname, int g_start, int g_end) throws SQLException {

        System.out.println("DB 데이터 갱신");

        String sql = "update gift set gname = ?, g_start = ?, g_end = ? where gno = ?";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setString(1,gname);
        psmt.setInt(2,g_start);
        psmt.setInt(3,g_end);
        psmt.setInt(4,gno);

        int result = psmt.executeUpdate();

        conn.commit();
        psmt.close();
        System.out.println("정보 갱신이 완료 되었습니다.");
    }

    public void deleteByGno(int gno) throws SQLException {
        String sql = "delete from gift where gno = ?";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setInt(1,gno);

        int result = psmt.executeUpdate();

        psmt.close();
        System.out.println("데이터 삭제가 완료되었습니다.");
    }

    public void insert(int gno, String gname, int g_start, int g_end) throws SQLException {
        System.out.println("DB 데이터 추가");

        String sql = "insert into gift values(?,?,?,?)";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setInt(1,gno);
        psmt.setString(2,gname);
        psmt.setInt(3,g_start);
        psmt.setInt(4,g_end);

        int result = psmt.executeUpdate();

        conn.commit();
        psmt.close();
        System.out.println("정보 추가가 완료 되었습니다.");
    }

    public void disconnect() throws SQLException {
        conn.close();
        System.exit(0);
    }

}
