package net.javaguides.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import net.javaguides.springmvc.dao.LoginDao;

import net.javaguides.springmvc.entity.Login;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao loginDao;
    @Override
    @Transactional
    public String checkUser(String name,String pass) {

        System.out.println("senthil");
        if(name!= null&& pass!=null){
            List<Login> sen = loginDao.checkUser(name,pass);
            if(sen!=null){
            for (Login object : sen) {

                if(object.getCategory().equals("ADMIN"))
                {
                    return "admin";
        
                }}
                return "student";
        }
    else{
        return "signup"; 
    }}
        
        return null;
        
    }

}
