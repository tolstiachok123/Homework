package by.andruhovich.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;

public class DBUtil {

    private final static String url = "jdbc:mysql://localhost:3306/Users?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
    private final static String user = "root";
    private final static String password = "9109";

    private final static ArrayBlockingQueue<Connection> connections = new ArrayBlockingQueue<Connection>(1);

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try {
                connections.add(estabilishConnection());
            } catch (SQLException e) {
                System.out.println(e.getStackTrace());
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void addConnection(Connection newConnection) {
        connections.offer(newConnection);
    }

    public static Connection estabilishConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static Connection getConnection() {
        return connections.peek();
    }
}