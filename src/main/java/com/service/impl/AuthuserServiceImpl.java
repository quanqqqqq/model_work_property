package com.service.impl;

import com.dao.TAuthuserMapper;
import com.model.TAuthuser;
import com.model.TAuthuserExample;
import com.service.AuthuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@Service
public class AuthuserServiceImpl implements AuthuserService {

    @Autowired
    private TAuthuserMapper tAuthuserMapper;

    public int countByExample(TAuthuserExample example) {
        return tAuthuserMapper.countByExample(example);
    }

    public int deleteByExample(TAuthuserExample example) {
        return tAuthuserMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String authuserid) {
        return tAuthuserMapper.deleteByPrimaryKey(authuserid);
    }

    public int insert(TAuthuser record) {
        return tAuthuserMapper.insert(record);
    }

    public int insertSelective(TAuthuser record) {
        return tAuthuserMapper.insertSelective(record);
    }

    public List<TAuthuser> selectByExample(TAuthuserExample example) {
        return tAuthuserMapper.selectByExample(example);
    }

    public TAuthuser selectByPrimaryKey(String authuserid) {
        return tAuthuserMapper.selectByPrimaryKey(authuserid);
    }

    public int updateByExampleSelective(TAuthuser record, TAuthuserExample example) {
        return tAuthuserMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(TAuthuser record, TAuthuserExample example) {
        return tAuthuserMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(TAuthuser record) {
        return tAuthuserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TAuthuser record) {
        return tAuthuserMapper.updateByPrimaryKey(record);
    }
}
