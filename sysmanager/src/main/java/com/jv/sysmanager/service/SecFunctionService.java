package com.jv.sysmanager.service;

import com.jv.sysmanager.dao.SecFunctionDao;
import com.jv.sysmanager.dao.SecOperatorMapper;
import com.jv.sysmanager.entity.SecFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 菜单
 */
@Service
public class SecFunctionService {

    @Autowired
    public SecFunctionDao functionDao;
    @Autowired
    private SecOperatorMapper operatorMapper;


//
    public List<SecFunction> getFunctionList(){
//        List<SecFunction> functionList = functionMapper.getAllFunction();

        List<SecFunction> functionList = functionDao.getFunctionList();
        return functionList;
    }

}
