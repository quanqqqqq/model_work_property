package com.service.impl;

import com.dao.TSkillMapper;
import com.model.TSkill;
import com.model.TSkillExample;
import com.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private TSkillMapper tSkillMapper;

    public int countByExample(TSkillExample example) {
        return tSkillMapper.countByExample(example);
    }

    public int deleteByExample(TSkillExample example) {
        return tSkillMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer skillid) {
        return tSkillMapper.deleteByPrimaryKey(skillid);
    }

    public int insert(TSkill record) {
        return tSkillMapper.insert(record);
    }

    public int insertSelective(TSkill record) {
        return tSkillMapper.insertSelective(record);
    }

    public List<TSkill> selectByExampleWithBLOBs(TSkillExample example) {
        return tSkillMapper.selectByExampleWithBLOBs(example);
    }

    public List<TSkill> selectByExample(TSkillExample example) {
        return tSkillMapper.selectByExample(example);
    }

    public TSkill selectByPrimaryKey(Integer skillid) {
        return tSkillMapper.selectByPrimaryKey(skillid);
    }

    public int updateByExampleSelective(TSkill record, TSkillExample example) {
        return tSkillMapper.updateByExampleSelective(record, example);
    }

    public int updateByExampleWithBLOBs(TSkill record, TSkillExample example) {
        return tSkillMapper.updateByExampleWithBLOBs(record, example);
    }

    public int updateByExample(TSkill record, TSkillExample example) {
        return tSkillMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(TSkill record) {
        return tSkillMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKeyWithBLOBs(TSkill record) {
        return tSkillMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    public int updateByPrimaryKey(TSkill record) {
        return tSkillMapper.updateByPrimaryKey(record);
    }
}
