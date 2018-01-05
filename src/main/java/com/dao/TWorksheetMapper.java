package com.dao;

import com.model.TWorksheet;
import com.model.TWorksheetExample;
import com.model.TWorksheetWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

public interface TWorksheetMapper {
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