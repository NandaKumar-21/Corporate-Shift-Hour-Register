import java.sql.Connection;

public class DBConnection {

    private static final String URL = "";
    private static final String USERNAME = "";
    private static final String PASSWORD = "";

    public static Connection getConnection() {

        Connection con = null;

        try {

            // Load Driver

            // Create Connection

        }
        catch(Exception e) {

            e.printStackTrace();
        }

        return con;
    }
}