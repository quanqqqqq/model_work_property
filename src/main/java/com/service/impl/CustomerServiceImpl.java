package com.service.impl;

import com.dao.TCustomerMapper;
import com.model.TCustomer;
import com.model.TCustomerExample;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private TCustomerMapper tCustomerMapper;

    public int countByExample(TCustomerExample example) {
        return tCustomerMapper.countByExample(example);
    }

    public int deleteByExample(TCustomerExample example) {
        return tCustomerMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String authuserid) {
        return tCustomerMapper.deleteByPrimaryKey(authuserid);
    }

    public int insert(TCustomer record) {
        return tCustomerMapper.insert(record);
    }

    public int insertSelective(TCustomer record) {
        return tCustomerMapper.insertSelective(record);
    }

    public List<TCustomer> selectByExample(TCustomerExample example) {
        return tCustomerMapper.selectByExample(example);
    }

    public TCustomer selectByPrimaryKey(String authuserid) {
        return tCustomerMapper.selectByPrimaryKey(authuserid);
    }

    public int updateByExampleSelective(TCustomer record, TCustomerExample example) {
        return tCustomerMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(TCustomer record, TCustomerExample example) {
        return tCustomerMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(TCustomer record) {
        return tCustomerMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TCustomer record) {
        return tCustomerMapper.updateByPrimaryKey(record);
    }
}
