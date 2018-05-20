package main.java.interview.jdbc;

import java.sql.*;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class AnimalsDatabase {
    //Important: include in project libraries derby.jar  ../jdk/db/lib/derby.jar
    public static void main(String[] args) throws Exception {
        String url = "jdbc:derby:zoo;create=true";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();

            stmt.executeUpdate("DROP TABLE animal");
            stmt.executeUpdate("DROP TABLE species");

            stmt.executeUpdate("CREATE TABLE species ("
                    + "id INTEGER PRIMARY KEY, "
                    + "name VARCHAR(255), "
                    + "num_acres DECIMAL(4,1))");

            stmt.executeUpdate("CREATE TABLE animal ("
                    + "id INTEGER PRIMARY KEY, "
                    + "species_id integer REFERENCES species (id), "
                    + "name VARCHAR(255), "
                    + "date_born TIMESTAMP)");

            stmt.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
            stmt.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");

            stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001-05-06 02:15:00')");
            stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002-08-15 09:12:00')");
            stmt.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002-09-09 10:36:00')");
            stmt.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010-06-08 01:24:00')");
            stmt.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005-11-12 03:44:00')");

            Map<Integer, String> idToNameMap = new HashMap<>();
            rs = stmt.executeQuery("select id, name, date_born from animal");
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                java.sql.Time sqlTime = rs.getTime(3);
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
        } finally {
            assert rs != null;
            rs.close();
            stmt.close();
            conn.close();
        }
    }
}