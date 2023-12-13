package day18.quiz01;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DeptController.connect();
        DeptController.menuControll();
    }
}
