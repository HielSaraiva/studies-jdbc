package src.application;

import src.db.DB1;

import java.sql.Connection;

public class Program1 {
    public static void main(String[] args) {

        Connection conn = DB1.getConnection();
        DB1.closeConnection();
    }
}
