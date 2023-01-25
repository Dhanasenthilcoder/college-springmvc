package net.javaguides.springmvc.contoller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.javaguides.springmvc.service.ApplicationService;
import net.javaguides.springmvc.service.LoginService;




@Controller

public class CollegeController {
    
   @Autowired
   private LoginService loginService;
   @Autowired
   private ApplicationService applicationService;

    @PostMapping("/login")
    public String  login(@RequestParam("u_name")String name,@RequestParam("pass")String pass){
        System.out.println(name+" "+pass);
         String sen = loginService.checkUser(name,pass);
        
       
        
        return sen; }
   
    
    
    @RequestMapping("/signup")
    public String signup(){
        System.out.println("hbefifig");
        return "signup";
    }

    @GetMapping("/collegeseatlist")
    @ResponseBody
    public List<?> collegeseatlist(){
      
      
   
   return applicationService.save();
   

    }
}

