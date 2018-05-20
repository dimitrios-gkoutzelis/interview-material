package main.java.interview.jdbc;

import java.sql.*;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class SimpleTransactions {
    //run first SetupAnimalsDatabase
    public static void main(String[] args) throws Exception {
        String url = "jdbc:derby:zoo;create=true";
        Connection conn = null;
        Statement stmt = null;
        Savepoint savepoint = null;

        try {
            conn = DriverManager.getConnection(url);
            conn.setAutoCommit(false);
            stmt = conn.createStatement();
            //create savepoint, this way can rollback specific statement
            savepoint = conn.setSavepoint("Savepoint");
            stmt.executeUpdate("insert into animal values (6, 2, 'Rania', '2001-05-06 02:15:00')");
            conn.commit();
        } catch (SQLException ex) {
            assert conn != null;
            conn.rollback();
            conn.rollback(savepoint);
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
        } finally {
            assert stmt != null;
            stmt.close();
            conn.close();
        }
    }
}