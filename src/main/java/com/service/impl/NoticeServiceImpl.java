package com.service.impl;

import com.dao.TNoticeMapper;
import com.model.TNotice;
import com.model.TNoticeExample;
import com.model.TNoticeWithBLOBs;
import com.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private TNoticeMapper tNoticeMapper;

    public int countByExample(TNoticeExample example) {
        return tNoticeMapper.countByExample(example);
    }

    public int deleteByExample(TNoticeExample example) {
        return tNoticeMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer noticeid) {
        return tNoticeMapper.deleteByPrimaryKey(noticeid);
    }

    public int deleteByPrimaryKey(int noticeId) {
        return tNoticeMapper.deleteByPrimaryKey(noticeId);
    }

    public int insert(TNoticeWithBLOBs record) {
        return tNoticeMapper.insert(record);
    }

    public int insertSelective(TNoticeWithBLOBs record) {
        return tNoticeMapper.insertSelective(record);
    }

    public List<TNoticeWithBLOBs> selectByExampleWithBLOBs(TNoticeExample example) {
        return null;
    }

    public List<TNotice> selectByExample(TNoticeExample example) {
        return tNoticeMapper.selectByExample(example);
    }

    public TNoticeWithBLOBs selectByPrimaryKey(Integer noticeid) {
        return null;
    }

    public TNotice selectByPrimaryKey(int authuserid) {
        return tNoticeMapper.selectByPrimaryKey(authuserid);
    }

    public int updateByExampleSelective(TNoticeWithBLOBs record, TNoticeExample example) {
        return tNoticeMapper.updateByExampleSelective(record, example);
    }

    public int updateByExampleWithBLOBs(TNoticeWithBLOBs record, TNoticeExample example) {
        return 0;
    }

    public int updateByExample(TNotice record, TNoticeExample example) {
        return tNoticeMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(TNoticeWithBLOBs record) {
        return tNoticeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKeyWithBLOBs(TNoticeWithBLOBs record) {
        return 0;
    }

    public int updateByPrimaryKey(TNotice record) {
        return tNoticeMapper.updateByPrimaryKey(record);
    }
}
