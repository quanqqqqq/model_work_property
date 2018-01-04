package com.service.impl;

import com.model.TWorksheet;
import com.model.TWorksheetExample;
import com.model.TWorksheetWithBLOBs;
import com.service.WorkSheetService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@Service
public class WorkSheetServiceImpl implements WorkSheetService {

    public int countByExample(TWorksheetExample example) {
        return 0;
    }

    public int deleteByExample(TWorksheetExample example) {
        return 0;
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
}
