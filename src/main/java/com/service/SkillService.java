package com.service;

import com.model.TSkill;
import com.model.TSkillExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
public interface SkillService {
    int countByExample(TSkillExample example);

    int deleteByExample(TSkillExample example);

    int deleteByPrimaryKey(Integer skillid);

    int insert(TSkill record);

    int insertSelective(TSkill record);

    List<TSkill> selectByExampleWithBLOBs(TSkillExample example);

    List<TSkill> selectByExample(TSkillExample example);

    TSkill selectByPrimaryKey(Integer skillid);

    int updateByExampleSelective(TSkill record, TSkillExample example);

    int updateByExampleWithBLOBs(TSkill record, TSkillExample example);

    int updateByExample(TSkill record, TSkillExample example);

    int updateByPrimaryKeySelective(TSkill record);

    int updateByPrimaryKeyWithBLOBs(TSkill record);

    int updateByPrimaryKey(TSkill record);
}
