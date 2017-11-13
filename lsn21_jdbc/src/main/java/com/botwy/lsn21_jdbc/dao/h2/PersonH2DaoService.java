package com.botwy.lsn21_jdbc.dao.h2;

import com.botwy.lsn21_jdbc.dao.h2.AbstractH2DaoService;
import com.botwy.lsn21_jdbc.domen.Person;
import com.botwy.lsn21_jdbc.exceptions.DaoException;
import com.botwy.lsn21_jdbc.exceptions.PersonDaoException;

import java.sql.*;

public class PersonH2DaoService extends AbstractH2DaoService implements PersonDaoService {

    @Override
    public Person getPersonById(Integer id) throws DaoException {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             //  PreparedStatement preparedStatement =
             //        connection.prepareStatement("SELECT * FROM BANK.PERSON WHERE id=?");
        ) {
            //prepared statement как состояние
            // preparedStatement.setInt(1,id);
            //ResultSet resultSet = preparedStatement.executeQuery();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM BANK.PERSON" + " WHERE id" + id);
            int i = 0;
            Person person = null;
            while (resultSet.next()) {
                i++;
                if (i > 1) throw new DaoException("More than one row");
                person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setLastName(resultSet.getString("lastName"));
                person.setFirstName(resultSet.getString("firstName"));
                person.setAge(resultSet.getInt("age"));
            }

            if (person == null) throw new DaoException("Person not found id=" + id);

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new DaoException("result set close error", e);
                }

            }
            return person;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DaoException("Get person error", e);
        }



    }

    @Override
    public Person save() throws PersonDaoException {
        return null;
    }
}
