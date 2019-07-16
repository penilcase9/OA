package com.jv.base.dao;

import com.jv.base.entity.BaseStaticData;
import com.jv.base.entity.BaseStaticDataExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaseStaticDataMapper {
    long countByExample(BaseStaticDataExample example);

    int deleteByExample(BaseStaticDataExample example);

    int insert(BaseStaticData record);

    int insertSelective(BaseStaticData record);

    List<BaseStaticData> selectByExample(BaseStaticDataExample example);

    int updateByExampleSelective(@Param("record") BaseStaticData record, @Param("example") BaseStaticDataExample example);

    int updateByExample(@Param("record") BaseStaticData record, @Param("example") BaseStaticDataExample example);
}