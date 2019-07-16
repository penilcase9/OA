package com.jv.web;

import com.jv.base.dao.TablesManagerDao;
import com.jv.base.service.TablesManagerSV;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DataSourceTest {


    @Autowired
    private DataSource dataSource;

    @Autowired
    private TablesManagerDao tablesManagerDao;

    @Autowired
    private TablesManagerSV tablesManagerSV;

    @Test
    public void contextLoads() throws SQLException {

      tablesManagerSV.getTableList();


//        log.error("user = " + dbUser);
    }
}
