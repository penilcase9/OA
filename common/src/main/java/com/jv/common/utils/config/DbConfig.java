package com.jv.common.utils.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbConfig {


    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;


    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;


    @Value("${com.jv.db.users}")
    private String dbUsers;

    public String getDbUsers() {
        return dbUsers;
    }

    public void setDbUsers(String dbUsers) {
        this.dbUsers = dbUsers;
    }




    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }


    /**
     * 返回数据库用户
     */
    public List<String> getDbUsersList(){
        String[] dbUsersArr = dbUsers.split(",");
        return Arrays.asList(dbUsersArr);
    }
}
