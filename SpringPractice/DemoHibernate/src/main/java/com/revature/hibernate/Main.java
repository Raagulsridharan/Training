package com.revature.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Employee st = new Employee();
        st.setName("Sethu");
        st.setScore(78.3);

        session.beginTransaction();
//        session.save(st);
        st = session.get(Employee.class,4);
//        st.setScore(100.00);
//        session.update(st);
//        System.out.println(st);
        session.delete(st);
        session.getTransaction().commit();
        session.close();
    }
}