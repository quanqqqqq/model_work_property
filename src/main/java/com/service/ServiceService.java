package com.service;

import com.model.TService;
import com.model.TServiceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
public interface ServiceService {
    int countByExample(TServiceExample example);

    int deleteByExample(TServiceExample example);

    int deleteByPrimaryKey(Integer serviceid);

    int insert(TService record);

    int insertSelective(TService record);

    List<TService> selectByExampleWithBLOBs(TServiceExample example);

    List<TService> selectByExample(TServiceExample example);

    TService selectByPrimaryKey(Integer serviceid);

    int updateByExampleSelective(TService record, TServiceExample example);

    int updateByExampleWithBLOBs(TService record, TServiceExample example);

    int updateByExample(TService record, TServiceExample example);

    int updateByPrimaryKeySelective(TService record);

    int updateByPrimaryKeyWithBLOBs(TService record);

    int updateByPrimaryKey(TService record);
}
