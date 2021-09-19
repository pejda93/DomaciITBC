package rs.itbootcamp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection conn = null;

    static{
        String url = "jdbc:postgresql://localhost:5432/hr?user=postgres&password=pejda123";

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnection(){
        return conn;
    }
}
