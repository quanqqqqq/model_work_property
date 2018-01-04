package com.service.impl;

import com.model.TService;
import com.model.TServiceExample;
import com.service.ServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@Service
public class ServiceServiceImpl implements ServiceService {
    public int countByExample(TServiceExample example) {
        return 0;
    }

    public int deleteByExample(TServiceExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer serviceid) {
        return 0;
    }

    public int insert(TService record) {
        return 0;
    }

    public int insertSelective(TService record) {
        return 0;
    }

    public List<TService> selectByExampleWithBLOBs(TServiceExample example) {
        return null;
    }

    public List<TService> selectByExample(TServiceExample example) {
        return null;
    }

    public TService selectByPrimaryKey(Integer serviceid) {
        return null;
    }

    public int updateByExampleSelective(TService record, TServiceExample example) {
        return 0;
    }

    public int updateByExampleWithBLOBs(TService record, TServiceExample example) {
        return 0;
    }

    public int updateByExample(TService record, TServiceExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TService record) {
        return 0;
    }

    public int updateByPrimaryKeyWithBLOBs(TService record) {
        return 0;
    }

    public int updateByPrimaryKey(TService record) {
        return 0;
    }
}
