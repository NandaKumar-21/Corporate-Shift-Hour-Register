import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    private static final String url ="jdbc:mysql://localhost:3312/corporate";
    private static final String username = "root";
    private static final String password = "";
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );
            System.out.println("Database Connected Successfully");
        }
        catch(Exception e) {

            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return con;
    }
}