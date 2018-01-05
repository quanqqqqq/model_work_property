package com.service.impl;

import com.dao.TWorksheetMapper;
import com.model.TWorksheet;
import com.model.TWorksheetExample;
import com.model.TWorksheetWithBLOBs;
import com.service.WorkSheetService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@Service
public class WorkSheetServiceImpl implements WorkSheetService {

    @Autowired
    private TWorksheetMapper worksheetMapper;

    public int countByExample(TWorksheetExample example) {
        return worksheetMapper.countByExample(example);
    }

    public int deleteByExample(TWorksheetExample example) {
        return worksheetMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer sheetid) {
        return 0;
    }

    public int insert(TWorksheetWithBLOBs record) {
        return 0;
    }

    public int insertSelective(TWorksheetWithBLOBs record) {
        return 0;
    }

    public List<TWorksheetWithBLOBs> selectByExampleWithBLOBs(TWorksheetExample example) {
        return null;
    }

    public List<TWorksheet> selectByExample(TWorksheetExample example) {
        return null;
    }

    public TWorksheetWithBLOBs selectByPrimaryKey(Integer sheetid) {
        return null;
    }

    public int updateByExampleSelective(@Param("record") TWorksheetWithBLOBs record, @Param("example") TWorksheetExample example) {
        return 0;
    }

    public int updateByExampleWithBLOBs(@Param("record") TWorksheetWithBLOBs record, @Param("example") TWorksheetExample example) {
        return 0;
    }

    public int updateByExample(@Param("record") TWorksheet record, @Param("example") TWorksheetExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TWorksheetWithBLOBs record) {
        return 0;
    }

    public int updateByPrimaryKeyWithBLOBs(TWorksheetWithBLOBs record) {
        return 0;
    }

    public int updateByPrimaryKey(TWorksheet record) {
        return 0;
    }

    public List<TWorksheet> selectByCustomerId(String customerId) {
        return worksheetMapper.selectByCustomerId(customerId);
    }

    public List<TWorksheet> selectByWorkerId(String workerId) {
        return worksheetMapper.selectByWorkerId(workerId);
    }
}
