package com.service;

import com.model.TAuthuser;
import com.model.TAuthuserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
public interface AuthuserService {
    int countByExample(TAuthuserExample example);

    int deleteByExample(TAuthuserExample example);

    int deleteByPrimaryKey(String authuserid);

    int insert(TAuthuser record);

    int insertSelective(TAuthuser record);

    List<TAuthuser> selectByExample(TAuthuserExample example);

    TAuthuser selectByPrimaryKey(String authuserid);

    int updateByExampleSelective(TAuthuser record, TAuthuserExample example);

    int updateByExample(TAuthuser record, TAuthuserExample example);

    int updateByPrimaryKeySelective(TAuthuser record);

    int updateByPrimaryKey(TAuthuser record);

}
