package com.jv.web.root;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RootService {

    public Logger getLog(){
        return log;
    }
}
