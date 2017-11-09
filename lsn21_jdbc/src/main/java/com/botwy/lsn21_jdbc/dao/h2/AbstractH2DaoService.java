package com.botwy.lsn21_jdbc.dao.h2;

import com.botwy.lsn21_jdbc.exceptions.DaoException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbstractH2DaoService {

   static final String CONNECT_URL = "jdbc:h2:tcp://localhost/C:\\TEMP\\test.db";

    protected Connection getConnection() throws DaoException {
        try {
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection(CONNECT_URL, "sa", null);
        } catch (ClassNotFoundException e) {
            System.out.println("Get driver exception");
            e.printStackTrace();
            throw new DaoException("Get driver exception", e);
        } catch (SQLException e) {
            System.out.println("Can't create connection");
            e.printStackTrace();
            throw new DaoException("Can't create connection", e);
        }

    }
}
