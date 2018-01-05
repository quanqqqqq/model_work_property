package com.dao;

import com.model.TNotice;
import com.model.TNoticeExample;
import com.model.TNoticeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

public interface TNoticeMapper {
    int countByExample(TNoticeExample example);

    int deleteByExample(TNoticeExample example);

    int deleteByPrimaryKey(Integer noticeid);

    int insert(TNoticeWithBLOBs record);

    int insertSelective(TNoticeWithBLOBs record);

    List<TNoticeWithBLOBs> selectByExampleWithBLOBs(TNoticeExample example);

    List<TNotice> selectByExample(TNoticeExample example);

    TNoticeWithBLOBs selectByPrimaryKey(Integer noticeid);

    int updateByExampleSelective(@Param("record") TNoticeWithBLOBs record, @Param("example") TNoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") TNoticeWithBLOBs record, @Param("example") TNoticeExample example);

    int updateByExample(@Param("record") TNotice record, @Param("example") TNoticeExample example);

    int updateByPrimaryKeySelective(TNoticeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TNoticeWithBLOBs record);

    int updateByPrimaryKey(TNotice record);
}