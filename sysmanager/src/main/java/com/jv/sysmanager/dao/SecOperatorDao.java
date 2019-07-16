package com.jv.sysmanager.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jv.sysmanager.entity.SecOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class SecOperatorDao {

    @Autowired
    private SecOperatorMapper operatorMapper;

    public SecOperator getOperatorById(long opId){
        Page<SecOperator> operatorPage = new Page<>(1,1);
        QueryWrapper<SecOperator> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("OperatorId",1);

        IPage<SecOperator> selectPage = operatorMapper.selectPage(operatorPage,queryWrapper);

        log.info("总条数 = " + selectPage.getTotal());
        log.info("当前页码 = " + selectPage.getCurrent());
        log.info("总页数 = " + selectPage.getPages());

        SecOperator operator = operatorMapper.selectById(opId);
        return operator;
    }
}
