package it.step.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import it.step.util.HibernateUtil;

import java.util.List;

public class EmployeeDAO { //DataAccessObject
    //Create
    public void create(Employee e){
        SessionFactory factory = HibernateUtil.getfactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(e);
        transaction.commit();
        session.close();
    }
    //Read
    public List<Employee> findAll(){
        SessionFactory factory = HibernateUtil.getfactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Query<Employee> query= (Query<Employee>) session.createQuery("FROM Employee");
        List<Employee> e=query.list();
        transaction.commit();
        session.close();
        return e ;
    }

    //find by ID
    public Employee findID(Integer id){
        SessionFactory factory = HibernateUtil.getfactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee e = session.get(Employee.class, id);
        transaction.commit();
        session.close();
        return e;
    }
//Update
public void update(Employee upd){
    SessionFactory factory = HibernateUtil.getfactory();
    Session session = factory.openSession();
    Transaction transaction = session.beginTransaction();
    session.update(upd);
    transaction.commit();
    session.close();
}
    //Delete
    public void delete(Integer id){
        SessionFactory factory = HibernateUtil.getfactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee e = session.get(Employee.class, id);
        session.delete(e);
        transaction.commit();
        session.close();
    }



}
