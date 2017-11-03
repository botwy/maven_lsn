import java.sql.Connection;
import java.sql.Statement;

public class TransferH2DaoService extends AbstractH2DaoService {

    public void createTransfer(String number, String number_to) {
       /* Connection connection;
        try {
            connection = getConnection();
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE ..."+"WHERE ");
            statement.executeUpdate("UPDATE ..."+"WHERE ");
            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        catch (RuntimeException e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            statement.close();
            connection.close();
        }
        TransferH2DaoService transferH2DaoService = new TransferH2DaoService();
        transferH2DaoService.createTransfer();*/
    }
}
