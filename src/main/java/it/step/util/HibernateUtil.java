package it.step.util;

import it.step.model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private final static SessionFactory factory= buildSessionFactory();

    public static SessionFactory getfactory(){
        return factory;
    }

    private static SessionFactory buildSessionFactory(){
        Configuration config = new Configuration();
        // in loc de new File("src\\main\\resources\\hibernate.cfg.xml") - pentru consola
        config.configure(HibernateUtil.class.getResource("/hibernate.cfg.xml"));
        config.addAnnotatedClass(Employee.class);
        return config.buildSessionFactory();

    }

    public static void shutDown(){
        if(factory!=null){
            factory.close();
        }
    }
}
