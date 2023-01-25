package net.javaguides.springmvc.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LoginService {
    public String checkUser(String name,String pass);

    
    
}
