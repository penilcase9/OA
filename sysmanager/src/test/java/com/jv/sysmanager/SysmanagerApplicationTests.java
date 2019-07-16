package com.jv.sysmanager;

import com.jv.sysmanager.service.SecFunctionService;
import com.jv.sysmanager.service.SecOperatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysmanagerApplicationTests {

    @Autowired
    public SecOperatorService operatorService;

    @Autowired
    public SecFunctionService functionService;

    @Test
    public void contextLoads() {
//        operatorService.getOperatorById(1);

//        functionService.getFunctionList();
    }



}
