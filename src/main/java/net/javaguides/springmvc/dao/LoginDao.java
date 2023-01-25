package net.javaguides.springmvc.dao;

import java.util.List;




import net.javaguides.springmvc.entity.Login;

public interface LoginDao {
    public List<Login> checkUser(String name,String pass);

    public List<?> save();
    
    
}
