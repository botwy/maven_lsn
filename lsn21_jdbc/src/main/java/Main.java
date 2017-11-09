import com.botwy.lsn21_jdbc.dao.h2.PersonDaoService;
import com.botwy.lsn21_jdbc.dao.h2.PersonH2DaoService;
import com.botwy.lsn21_jdbc.dao.h2.TransferH2DaoService;
import com.botwy.lsn21_jdbc.domen.Person;
import com.botwy.lsn21_jdbc.exceptions.DaoException;
import com.botwy.lsn21_jdbc.service.PersonFacade;

import java.math.BigDecimal;
import java.sql.*;

public class Main {

    public static void main (String... args) throws SQLException {

        try {
            Person person = new PersonFacade().getPersonById(2);
            System.out.println(person);
        } catch (DaoException e) {
            e.printStackTrace();
        }
        TransferH2DaoService transferH2DaoService = new TransferH2DaoService();
        transferH2DaoService.createTransfer("1234","4321",new BigDecimal(300));


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
