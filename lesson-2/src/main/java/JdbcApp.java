import java.sql.*;

public class JdbcApp {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connect();
          // createTableEx();
    //        dropTableEx();
            readEx();
  //       clearTableEx();
//            deleteEx();
 //           updateEx();
            insertEx();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    private static void connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:/Users/dmitriy/IdeaProjects/Java-3/lesson-2/src/sql-base.db");
        statement = connection.createStatement();
    }
    private static void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTableEx() throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS Students (\n" +
                " ID INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                " Name TEXT,\n" +
                " Score INTEGER\n" + " );");
    }
    private static void dropTableEx() throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS students;");
    }
    private static void readEx() throws SQLException {
        try (ResultSet rs = statement.executeQuery("SELECT * FROM Students")) {
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString("Name") + " " +
                        rs.getInt(3));
            }
        }
    }
    private static void clearTableEx() throws SQLException {
        statement.executeUpdate("DELETE FROM Students;");
    }
    private static void deleteEx() throws SQLException {
        statement.executeUpdate("DELETE FROM students WHERE Name = 'Bob1';");

    }
    private static void updateEx() throws SQLException {
        statement.executeUpdate("UPDATE students SET Score = 100 WHERE Name = 'Bob4';");
    }
    private static void insertEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students (Name, Score) VALUES ('Bob4', 60);");
    }
}
