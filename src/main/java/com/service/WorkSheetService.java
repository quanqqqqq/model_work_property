package com.service;

import com.model.TWorksheet;
import com.model.TWorksheetExample;
import com.model.TWorksheetWithBLOBs;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
public interface WorkSheetService {
    int countByExample(TWorksheetExample example);

    int deleteByExample(TWorksheetExample example);

    int deleteByPrimaryKey(Integer sheetid);

    int insert(TWorksheetWithBLOBs record);

    int insertSelective(TWorksheetWithBLOBs record);

    List<TWorksheetWithBLOBs> selectByExampleWithBLOBs(TWorksheetExample example);

    List<TWorksheet> selectByExample(TWorksheetExample example);

    TWorksheetWithBLOBs selectByPrimaryKey(Integer sheetid);

    int updateByExampleSelective(@Param("record") TWorksheetWithBLOBs record, @Param("example") TWorksheetExample example);

    int updateByExampleWithBLOBs(@Param("record") TWorksheetWithBLOBs record, @Param("example") TWorksheetExample example);

    int updateByExample(@Param("record") TWorksheet record, @Param("example") TWorksheetExample example);

    int updateByPrimaryKeySelective(TWorksheetWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TWorksheetWithBLOBs record);

    int updateByPrimaryKey(TWorksheet record);

    List<TWorksheet> selectByCustomerId(String customerId);

    List<TWorksheet> selectByWorkerId(String workerId);
}
