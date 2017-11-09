package com.botwy.lsn21_jdbc.dao.h2;

import com.botwy.lsn21_jdbc.domen.Person;
import com.botwy.lsn21_jdbc.exceptions.DaoException;
import com.botwy.lsn21_jdbc.exceptions.PersonDaoException;

public interface PersonDaoService {
    Person getPersonById(Integer id) throws DaoException;
   Person save() throws PersonDaoException;
}
