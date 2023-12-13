package day18.jdbc_mvc;

import day18.jdbc.crud.GiftDB;

import java.sql.SQLException;

public class GiftView {

    public static void main(String[] args) throws SQLException {

        GiftController.connect();
        GiftController.menu();
    }
}
