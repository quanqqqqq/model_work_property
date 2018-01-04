package com.service;

import com.model.TNotice;
import com.model.TNoticeExample;
import com.model.TNoticeWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
public interface NoticeService {
    int countByExample(TNoticeExample example);

    int deleteByExample(TNoticeExample example);

    int deleteByPrimaryKey(Integer noticeid);

    int insert(TNoticeWithBLOBs record);

    int insertSelective(TNoticeWithBLOBs record);

    List<TNoticeWithBLOBs> selectByExampleWithBLOBs(TNoticeExample example);

    List<TNotice> selectByExample(TNoticeExample example);

    TNoticeWithBLOBs selectByPrimaryKey(Integer noticeid);

    int updateByExampleSelective(TNoticeWithBLOBs record, TNoticeExample example);

    int updateByExampleWithBLOBs(TNoticeWithBLOBs record, TNoticeExample example);

    int updateByExample(TNotice record, TNoticeExample example);

    int updateByPrimaryKeySelective(TNoticeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TNoticeWithBLOBs record);

    int updateByPrimaryKey(TNotice record);
}
