package com.jv.base.service;

import com.jv.base.dao.BaseStaticDataMapper;
import com.jv.common.utils.encrypt.MD5Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseStaticDataSV {
    public BaseStaticDataMapper baseStaticDataMapper;

//    @Autowired
    public MD5Encrypt MD5Encrypt;


}
