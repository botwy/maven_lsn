import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountH2DaoService extends AbstractH2DaoService implements AccountDaoService{

    @Override
    public Account getAccountByUserId() {
        return null;
    }

    @Override
    public List<Account> getAccountsByNumber(String number) {
        /*try(Connection connection = getConnection("");
            Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSON"+" WHERE id"+id);
            int i = 0;
            List<Account> list = new ArrayList<Account>();
            while (resultSet.next()) {*/
        return null;
    }
}
