package com.botwy.lsn21_jdbc.dao.h2;

import com.botwy.lsn21_jdbc.domen.Account;
import com.botwy.lsn21_jdbc.exceptions.DaoException;

import java.util.List;

public interface AccountDaoService {
    List<Account>  getAccountsByUserId(Integer personId) throws DaoException;
}
