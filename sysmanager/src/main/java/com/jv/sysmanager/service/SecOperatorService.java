package com.jv.sysmanager.service;



import com.jv.sysmanager.dao.SecOperatorDao;
import com.jv.sysmanager.entity.SecOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SecOperatorService {

    @Autowired
    private SecOperatorDao operatorDao;


    public SecOperator getOperatorById(long opId){

        return operatorDao.getOperatorById(opId);
    }
}
