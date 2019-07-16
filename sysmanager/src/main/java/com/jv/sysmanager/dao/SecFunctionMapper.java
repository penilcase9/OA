package com.jv.sysmanager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jv.sysmanager.entity.SecFunction;
import com.jv.sysmanager.entity.SecFunctionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SecFunctionMapper extends BaseMapper<SecFunction> {
    long countByExample(SecFunctionExample example);

    int deleteByExample(SecFunctionExample example);

    int insert(SecFunction record);

    int insertSelective(SecFunction record);

    List<SecFunction> selectByExample(SecFunctionExample example);

    int updateByExampleSelective(@Param("record") SecFunction record, @Param("example") SecFunctionExample example);

    int updateByExample(@Param("record") SecFunction record, @Param("example") SecFunctionExample example);
}