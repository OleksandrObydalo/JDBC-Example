import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:h2:file:./test";
        String username = "sa";
        String password = "password";
        try(Connection connection = DriverManager.getConnection(url, username, password);) {
            System.out.println("Is connection valid? " + connection.isValid(1000));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
