package com.neevtech.jaxb.util;

import org.hibernate.Session;

public class App {
	public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
    }
}
