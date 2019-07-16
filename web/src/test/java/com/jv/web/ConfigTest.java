package com.jv.web;

import com.jv.common.utils.config.DbConfig;
import com.jv.sysmanager.entity.SecOperator;
import com.jv.sysmanager.service.SecOperatorService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ConfigTest {
    @Autowired
    public DbConfig dbConfig;

    @Test
    public void contextLoads() {

       String dbUser = dbConfig.getDbUsers();
//        log.error("user = " + dbUser);
    }
}
