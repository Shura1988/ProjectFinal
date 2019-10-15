package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private final String url = "jdbc:mysql://localhost/library?serverTimezone=Europe/Minsk&useSSL=false";
    private final String username = "root";
    private final String password = "SCN932hdu";
    private Connection connect;

    public Connect() {
        try {
            this.connect = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("Connection failed...");
        }
    }

    public Connection getConnection() {
        return connect;
    }

    public void setConnection(Connection connection) {
        this.connect = connection;
    }

}
