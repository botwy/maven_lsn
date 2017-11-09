package com.botwy.lsn21_jdbc.dao.h2;

import com.botwy.lsn21_jdbc.domen.Account;
import com.botwy.lsn21_jdbc.exceptions.DaoException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountH2DaoService extends AbstractH2DaoService implements AccountDaoService {


    @Override
    public List<Account> getAccountsByUserId(Integer personId) throws DaoException {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM BANK.ACCOUNT WHERE id" + personId);
            List<Account> listAccounts = new ArrayList<Account>();
            while (resultSet.next()) {
                Account account = new Account();
                account.setNumber(resultSet.getString("number"));
                account.setName(resultSet.getString("name"));
                account.setBalance(resultSet.getBigDecimal("balance"));
                listAccounts.add(account);
            }
            return listAccounts;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DaoException("Get account error", e);
        }
    }

}