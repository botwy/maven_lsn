public interface PersonDaoService {
    Person getPersonById(Integer id) throws DaoException;
   Person createPerson();
}
