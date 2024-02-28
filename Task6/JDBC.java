package GenTask.Task6;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost/w3schools?user=root&password=SaranSudha@2023";
//    private static final String USER = "your_username";
//    private static final String PASSWORD = "your_password";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            // Open a connection
            connection = DriverManager.getConnection(URL);

            // Execute a query
            statement = connection.createStatement();

            // Insert data
            String sql = "INSERT INTO employee (empcode, empname, emppage, empsalary) VALUES " +
                    "(101, 'Jenny', 25, 10000), " +
                    "(102, 'Jacky', 30, 20000), " +
                    "(103, 'Joe', 20, 40000), " +
                    "(104, 'John', 40, 80000), " +
                    "(105, 'Shameer', 25, 90000)";
            statement.executeUpdate(sql);

            System.out.println("Data inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close connections
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
