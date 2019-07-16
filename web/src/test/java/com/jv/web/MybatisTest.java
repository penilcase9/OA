package com.jv.web;

import com.jv.sysmanager.entity.SecOperator;
import com.jv.sysmanager.service.SecOperatorService;
import com.jv.web.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MybatisTest {

    @Autowired
    public SecOperatorService operatorService;

    @Test
    public void contextLoads() {
       SecOperator operator = operatorService.getOperatorById(1);
       if(operator != null){
           log.debug("operaotr = " + operator.getOperatorName());
       }
    }

}
