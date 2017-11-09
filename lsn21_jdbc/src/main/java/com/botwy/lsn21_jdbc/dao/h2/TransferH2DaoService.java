package com.botwy.lsn21_jdbc.dao.h2;

import com.botwy.lsn21_jdbc.dao.h2.AbstractH2DaoService;
import com.botwy.lsn21_jdbc.exceptions.DaoException;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransferH2DaoService extends AbstractH2DaoService {

    public void createTransfer(String accFrom, String accTo, BigDecimal amount) throws SQLException {

        Connection connection=null;
        Statement statement = null;
        try
        {
            connection = getConnection();
            statement = connection.createStatement();
            connection.setAutoCommit(false);

            statement.executeUpdate("UPDATE BANK.ACCOUNT SET balance = balance - "+amount +" WHERE number="+accFrom);
            statement.executeUpdate("UPDATE BANK.ACCOUNT SET balance = balance - "+amount +" WHERE number="+accTo);
            connection.commit();

        }
        catch (RuntimeException e) {
            e.printStackTrace();
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (DaoException e) {
            e.printStackTrace();
        } finally {
            if (statement!=null) statement.close();
            if (connection!=null) connection.close();
        }

    }
}
