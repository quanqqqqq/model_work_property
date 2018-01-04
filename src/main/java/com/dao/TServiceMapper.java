package com.dao;

import com.model.TService;
import com.model.TServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TServiceMapper {
    int countByExample(TServiceExample example);

    int deleteByExample(TServiceExample example);

    int deleteByPrimaryKey(Integer serviceid);

    int insert(TService record);

    int insertSelective(TService record);

    List<TService> selectByExampleWithBLOBs(TServiceExample example);

    List<TService> selectByExample(TServiceExample example);

    TService selectByPrimaryKey(Integer serviceid);

    int updateByExampleSelective(@Param("record") TService record, @Param("example") TServiceExample example);

    int updateByExampleWithBLOBs(@Param("record") TService record, @Param("example") TServiceExample example);

    int updateByExample(@Param("record") TService record, @Param("example") TServiceExample example);

    int updateByPrimaryKeySelective(TService record);

    int updateByPrimaryKeyWithBLOBs(TService record);

    int updateByPrimaryKey(TService record);
}