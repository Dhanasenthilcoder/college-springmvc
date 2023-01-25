package net.javaguides.springmvc.dao;





import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import net.javaguides.springmvc.entity.Application;
import net.javaguides.springmvc.entity.Login;

@Repository
public class LoginDaoImpl implements LoginDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<Login> checkUser(String name,String pass) {
      System.out.println("imp ");
      System.out.println(name+" "+pass);

      
      Session session = sessionFactory.openSession();
      //Query using Hibernate Query Language
        String SQL_QUERY =" from Login  where u_name=?0 and pass=?1";
        
        // String SQL_QUERY =" Select f_name,emp_id from EmpDetails  where email=?0 and f_name=?1";
        Query query = session.createQuery(SQL_QUERY);
        query.setParameter(0,name);
        query.setParameter(1,pass);
        List<Login> list = query.list();
        System.out.println(list);
        System.out.println(query.getClass());
        List<Login> outlist=null;
        if ((list != null) && (list.size() > 0)) {
        //    System.out.println(list.get(0));
           outlist = query.list();
        }
        else{
            outlist = null;
        }
      
          
       
       
       return outlist;
    }

    @Override
    public List<?> save() {
      Session session = sessionFactory.openSession();
      String SQL_QUERY ="from Application  ";
        
        // String SQL_QUERY =" Select f_name,emp_id from EmpDetails  where email=?0 and f_name=?1";
        Query query = session.createQuery(SQL_QUERY);
        
        List<?> list = query.list();
        System.out.println(list);
        
      return list;
    }

   
   

}
    
