package day18.quiz01;

import day18.connection.CloseHelper;
import day18.connection.ConnectionHelper;
import day18.jdbc_mvc.GiftDTO;

import java.sql.*;
import java.util.Scanner;

public class DeptController {

    // 연결, 삽입, 삭제, 수정, 검색
    static Scanner sc = new Scanner(System.in);
    static Statement stmt = null;
    static ResultSet rs = null;
    static Connection conn = null;
    static PreparedStatement pstmt = null;

    public static void connect() {
        try {
            conn = ConnectionHelper.getConnection("mariadb");
            stmt = conn.createStatement();
            conn.setAutoCommit(false);      // auto commit off
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        try {
            CloseHelper.close(rs);
            CloseHelper.close(stmt);
            CloseHelper.close(pstmt);
            CloseHelper.close(conn);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectAll(String className) throws SQLException {
        rs = stmt.executeQuery("SELECT * FROM " + className);  // 반환값 있는 경우

        ResultSetMetaData rsmd = rs.getMetaData();
        int count = rsmd.getColumnCount();

        while( rs.next() ) {
            for (int i = 1; i <= count; i++) {  // 각 타입별로 출력하기

                switch (rsmd.getColumnType(i)) {
                    case Types.NUMERIC :
                    case Types.INTEGER :
                        System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + "  ");
                        break;
                    case Types.FLOAT :
                        System.out.println(rsmd.getColumnName(i) + " : " +rs.getFloat(i) + "  ");
                        break;
                    case Types.DOUBLE :
                        System.out.println(rsmd.getColumnName(i) + " : " + (int)rs.getDouble(i) + "  ");
                        break;
                    case Types.CHAR :
                        System.out.println(rsmd.getColumnName(i) + " : " +rs.getString(i) + "  ");
                        break;
                    case Types.DATE :
                        System.out.println(rsmd.getColumnName(i) + " : " +rs.getDate(i) + "  ");
                        break;
                    default:
                        System.out.println(rsmd.getColumnName(i) + " : " +rs.getString(i) + "  ");
                        break;
                } // switch end
            } // end for
            System.out.println();
        } // end while
    }

    public static void insert(String className){
        System.out.print("DEPTNO : ");
        int dept = sc.nextInt();
        System.out.print("DNAME : ");
        String dname = sc.next();
        System.out.print("LOC : ");
        String loc = sc.next();

        try {
            pstmt = conn.prepareStatement("INSERT INTO " + className + " VALUES( ?, ?, ? )");
            pstmt.setInt(1, dept);
            pstmt.setString(2, dname);
            pstmt.setString(3, loc);

            int result = pstmt.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void menuControll() throws SQLException {
        DeptVO vo = new DeptVO();
        while( true ) {
            System.out.println();

            DeptView.optionView();

            switch ( sc.nextInt() ) {
                case 0 : System.out.println("Commit 하시겠습니까?(Y/N) ");
                    System.out.println("안하시려면 Rollback 됩니다. ");
                    if( sc.next().equalsIgnoreCase("Y") ) {
                        conn.commit();  // 예외발생
                        selectAll(vo.getClassName());
                    } else {
                        conn.rollback();
                        selectAll(vo.getClassName());
                    }
                    break;

                case 1:
                    selectAll(vo.getClassName());
                    break;
                case 2:
                    break;
                case 3:
                    insert(vo.getClassName());
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    close();
                    System.out.println("프로그램 종료합니다.!!");
                    System.exit(0);
                    break;
                case 9 :  conn.commit();
                    System.out.println("성공적으로 완료 되었습니다.");
                    break;

                default: System.out.println("없는 번호 선택 하셨습니다. 0~6, 9번 중에서 선택하세요.");
                    break;
            } // end switch

        } // end while
    }
}
