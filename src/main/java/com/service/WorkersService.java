package com.service;

import com.model.TWorkers;
import com.model.TWorkersExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
public interface WorkersService {
    int countByExample(TWorkersExample example);

    int deleteByExample(TWorkersExample example);

    int deleteByPrimaryKey(String workerid);

    int insert(TWorkers record);

    int insertSelective(TWorkers record);

    List<TWorkers> selectByExample(TWorkersExample example);

    TWorkers selectByPrimaryKey(String workerid);

    int updateByExampleSelective(@Param("record") TWorkers record, @Param("example") TWorkersExample example);

    int updateByExample(@Param("record") TWorkers record, @Param("example") TWorkersExample example);

    int updateByPrimaryKeySelective(TWorkers record);

    int updateByPrimaryKey(TWorkers record);
}
