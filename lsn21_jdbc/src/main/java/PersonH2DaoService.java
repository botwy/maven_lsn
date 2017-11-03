import java.sql.*;

public class PersonH2DaoService extends AbstractH2DaoService implements PersonDaoService {
    @Override
    public Person getPersonById(Integer id) throws DaoException {
        try(Connection connection = getConnection("");
            Statement statement = connection.createStatement();) {
            //prepared statement как состояние
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSON"+" WHERE id"+id);
            int i = 0;
            Person person=null;
            while (resultSet.next()) {
                i++;
                if (i>1) throw new DaoException("More this one row");
                person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setLastName(resultSet.getString("lastName"));
                person.setFirstName(resultSet.getString("firstName"));
                person.setAge(resultSet.getInt("age"));
            }
            if (resultSet!=null) try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new DaoException("Person error",e);
            }
            if (person==null) throw new DaoException("Person not found");

        }catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public Person createPerson() {
        return null;
    }
}
