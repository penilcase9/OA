package com.jv.sysmanager.dao;

import com.jv.sysmanager.entity.SecFunction;
import com.jv.sysmanager.entity.SecFunctionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SecFunctionDao {

    @Autowired
    public SecFunctionMapper functionMapper;

    public List<SecFunction> getFunctionList(){
        SecFunctionExample secFunctionExample = new SecFunctionExample();
        SecFunctionExample.Criteria criteria  =  secFunctionExample.createCriteria();
//        criteria.andFunctionidEqualTo(1);
        return functionMapper.selectByExample(secFunctionExample);
    }

}
