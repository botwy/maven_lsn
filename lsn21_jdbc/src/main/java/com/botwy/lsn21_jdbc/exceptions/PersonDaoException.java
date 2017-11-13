package com.botwy.lsn21_jdbc.exceptions;

public class PersonDaoException extends DaoException{
    public PersonDaoException(String message) {
        super(message);
    }

    public PersonDaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
