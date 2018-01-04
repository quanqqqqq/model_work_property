package com.service.impl;

import com.model.TWorkers;
import com.model.TWorkersExample;
import com.service.WorkersService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@Service
public class WorkersServiceImpl implements WorkersService {

    public int countByExample(TWorkersExample example) {
        return 0;
    }

    public int deleteByExample(TWorkersExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(String workerid) {
        return 0;
    }

    public int insert(TWorkers record) {
        return 0;
    }

    public int insertSelective(TWorkers record) {
        return 0;
    }

    public List<TWorkers> selectByExample(TWorkersExample example) {
        return null;
    }

    public TWorkers selectByPrimaryKey(String workerid) {
        return null;
    }

    public int updateByExampleSelective(@Param("record") TWorkers record, @Param("example") TWorkersExample example) {
        return 0;
    }

    public int updateByExample(@Param("record") TWorkers record, @Param("example") TWorkersExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TWorkers record) {
        return 0;
    }

    public int updateByPrimaryKey(TWorkers record) {
        return 0;
    }
}
