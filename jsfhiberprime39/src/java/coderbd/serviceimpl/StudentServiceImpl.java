/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderbd.serviceimpl;

import coderbd.entity.Student;
import coderbd.service.StudentService;
import coderbd.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public void saveStudent(Student student) {
           SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.save(student);
        tr.commit();
    }

    @Override
    public void updateStudent(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteStudent(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAllStudents() {
       List<Student> list=new ArrayList<>();
        
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=session.beginTransaction();
       list = session.createCriteria(Student.class).list();   
       tr.commit();
       return list;
    }
    
}
