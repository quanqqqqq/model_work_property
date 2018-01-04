package com.dao;

import com.model.TSkill;
import com.model.TSkillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSkillMapper {
    int countByExample(TSkillExample example);

    int deleteByExample(TSkillExample example);

    int deleteByPrimaryKey(Integer skillid);

    int insert(TSkill record);

    int insertSelective(TSkill record);

    List<TSkill> selectByExampleWithBLOBs(TSkillExample example);

    List<TSkill> selectByExample(TSkillExample example);

    TSkill selectByPrimaryKey(Integer skillid);

    int updateByExampleSelective(@Param("record") TSkill record, @Param("example") TSkillExample example);

    int updateByExampleWithBLOBs(@Param("record") TSkill record, @Param("example") TSkillExample example);

    int updateByExample(@Param("record") TSkill record, @Param("example") TSkillExample example);

    int updateByPrimaryKeySelective(TSkill record);

    int updateByPrimaryKeyWithBLOBs(TSkill record);

    int updateByPrimaryKey(TSkill record);
}