import java.sql.*;

public class Main {

    public static void main (String... args) throws ClassNotFoundException, SQLException {

       try {
            PersonDaoService daoService = new PersonH2DaoService();
        } catch (Exception e) {
            e.printStackTrace();
        }


        /*Class.forName("org.h2.Driver");
        Connection connection = null;

        connection = DriverManager.getConnection("jdbc:h2:~/testdb");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSON");
        while (resultSet.next()) {
            String.valueOf(resultSet.getInt("id"));
            if (connection.getMetaData().supportsResultSetConcurrency())
        }*/
    }
}
