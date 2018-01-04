package com.dao;

import com.model.TAuthuser;
import com.model.TAuthuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAuthuserMapper {
    int countByExample(TAuthuserExample example);

    int deleteByExample(TAuthuserExample example);

    int deleteByPrimaryKey(String authuserid);

    int insert(TAuthuser record);

    int insertSelective(TAuthuser record);

    List<TAuthuser> selectByExample(TAuthuserExample example);

    TAuthuser selectByPrimaryKey(String authuserid);

    int updateByExampleSelective(@Param("record") TAuthuser record, @Param("example") TAuthuserExample example);

    int updateByExample(@Param("record") TAuthuser record, @Param("example") TAuthuserExample example);

    int updateByPrimaryKeySelective(TAuthuser record);

    int updateByPrimaryKey(TAuthuser record);
}