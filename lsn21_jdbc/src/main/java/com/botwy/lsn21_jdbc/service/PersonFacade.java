package com.botwy.lsn21_jdbc.service;

import com.botwy.lsn21_jdbc.dao.h2.AccountDaoService;
import com.botwy.lsn21_jdbc.dao.h2.AccountH2DaoService;
import com.botwy.lsn21_jdbc.dao.h2.PersonDaoService;
import com.botwy.lsn21_jdbc.dao.h2.PersonH2DaoService;
import com.botwy.lsn21_jdbc.domen.Person;
import com.botwy.lsn21_jdbc.exceptions.DaoException;

//уровень сервис
public class PersonFacade {

    public Person getPersonById(Integer id) throws DaoException {
    PersonDaoService personDaoService = new PersonH2DaoService();
    AccountDaoService accountDaoService = new AccountH2DaoService();
    Person person = personDaoService.getPersonById(id);
    person.setAccountList(accountDaoService.getAccountsByUserId(id));
    return person;

    }
}
