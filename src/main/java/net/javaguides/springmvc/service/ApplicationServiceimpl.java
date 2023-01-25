package net.javaguides.springmvc.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.javaguides.springmvc.dao.LoginDao;
@Service
public class ApplicationServiceimpl implements ApplicationService {
    @Autowired
    private LoginDao loginDao;

    @Override
    @Transactional
    public List<?> save() {
        return loginDao.save();
        
    }
    
}
