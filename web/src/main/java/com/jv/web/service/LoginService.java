package com.jv.web.service;


import com.jv.web.root.RootService;
import org.springframework.stereotype.Service;

@Service
public class LoginService extends RootService {

    public void loginPage(){
        getLog().debug("service login page");
    }
}
