package com.spring_jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Component
public class SpringJDBC {


    private JdbcTemplate jdbcTemplate;

    @Autowired
    public SpringJDBC(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @PostConstruct
    public void init() {
        jdbcTemplate.execute("CREATE SCHEMA IF NOT EXISTS BANK");
        jdbcTemplate.execute("CREATE SEQUENCE IF NOT EXISTS BANK.user_seq");
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BANK.USER (" +
                " id NUMBER(18) PRIMARY KEY," +
                " login VARCHAR(100)," +
                " name VARCHAR(200)," +
                " last_access timestamp" +
                ")");
    }
}
