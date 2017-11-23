package com.orm;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String...args) {
        Book book = new Book(1, "MyBook");
        book.getTags().add("fantastic");
        book.getTags().add("fat");
        book.getTags().add("Strugacki");


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();

        session = sessionFactory.openSession();
        session.beginTransaction();
        List<Book> result = (List<Book>)session.createQuery("from Book").list();

        for (Book book1 : result) {
            System.out.println(book1.getName());
        }

        session.getTransaction().commit();
        session.close();
    }
}
