package com.controller;

import com.model.TWorkersExample;
import com.model.TWorksheet;
import com.model.TWorksheetExample;
import com.model.TWorksheetWithBLOBs;
import com.service.WorkSheetService;
import com.service.WorkersService;
import com.service.impl.WorkSheetServiceImpl;
import com.utils.PageData;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@Controller
@RequestMapping("/worksheet")
public class WorkSheetController extends BaseController {

    @Autowired
    private WorkSheetServiceImpl workSheetService;

    @RequestMapping("/list/{id}")
    public ModelAndView workSheetList(@PathVariable(value="id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("list", workSheetService.selectByExample(new TWorksheetExample()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        modelAndView.setViewName("/worksheet/sheetList");
        return modelAndView;
    }

    @RequestMapping("/list/workers/{workerId}")
    public ModelAndView workSheetListForWorker(@PathVariable(value="workerId") String workerId) {
        ModelAndView modelAndView = new ModelAndView("/worker/workSheetList");
        try {
            modelAndView.addObject("list", workSheetService.selectByWorkerId(workerId));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    @RequestMapping("/detail/{id}")
    public ModelAndView workSheetDetail(@PathVariable(value="id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("worksheet", workSheetService.selectByPrimaryKey(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        modelAndView.setViewName("/worksheet/sheetDetail");
        return modelAndView;
    }


    /**
     * 删除订单
     *
     */
    @ResponseBody
    @RequestMapping("/api/deleteDetail")
    public Map<String, Object> deleteDetail() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            workSheetService.deleteByPrimaryKey(Integer.valueOf(pageData.getString("workSheetId")));
            status = true;
            errMsg = "删除成功";
        } catch (Exception e) {
            e.printStackTrace();
            errMsg = "系统出错";
        }
        map.put("status", status);
        map.put("errMsg", errMsg);
        return map;
    }


    /**
     * 增加订单
     *
     */
    @ResponseBody
    @RequestMapping("/api/addDetail")
    public Map<String, Object> addDetail() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            TWorksheetWithBLOBs worksheet = new TWorksheetWithBLOBs();

            worksheet.setComsume(0);
            worksheet.setProcess(0);
            worksheet.setSheetname(pageData.getString("sheetName"));
            worksheet.setDescription(pageData.getString("description"));
            workSheetService.insert(worksheet);
            status = true;
            errMsg = "增加工单成功，稍后将为进行处理";
        } catch (Exception e) {
            e.printStackTrace();
            errMsg = "系统出错";
        }
        map.put("status", status);
        map.put("errMsg", errMsg);
        return map;
    }


    /**
     * 用户修改工单信息
     *
     */
    @ResponseBody
    @RequestMapping("/api/updateDetailByCustomer")
    public Map<String, Object> updateDetailByCustomer() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            TWorksheetWithBLOBs worksheet = workSheetService.selectByPrimaryKey(Integer.valueOf(pageData.getString("worksheetId")));
            worksheet.setSheetname(pageData.getString("sheetName"));
            worksheet.setComment(pageData.getString("comment"));
            worksheet.setWorkerid(pageData.getString("workerId"));
            worksheet.setDescription(pageData.getString("description"));
            workSheetService.updateByPrimaryKeyWithBLOBs(worksheet);
            errMsg = "更新成功";
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
            errMsg = "系统出错";
        }
        map.put("status", status);
        map.put("errMsg", errMsg);
        return map;
    }


    /**
     * 后台管理员修改工单信息
     *
     */
    @ResponseBody
    @RequestMapping("/api/updateDetailByAuthUser")
    public Map<String, Object> updateDetailByAuthUser() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            TWorksheetWithBLOBs worksheet = workSheetService.selectByPrimaryKey(Integer.valueOf(pageData.getString("worksheetId")));
            worksheet.setProcess(Integer.valueOf(pageData.getString("process")));
            if (Integer.valueOf(pageData.getString("process")) == 1) {
                worksheet.setComsume(Integer.valueOf(pageData.getString("comsume")));
            }
            worksheet.setComment(pageData.getString("comment"));
            worksheet.setWorkerid(pageData.getString("workerId"));
            worksheet.setDescription(pageData.getString("description"));
            worksheet.setSheetname(pageData.getString("sheetName"));
            worksheet.setAuthuserid(pageData.getString("authuserId"));
            workSheetService.updateByPrimaryKeyWithBLOBs(worksheet);
            errMsg = "更新成功";
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
            errMsg = "系统出错";
        }
        map.put("status", status);
        map.put("errMsg", errMsg);
        return map;
    }



    /**
     * 支付工单
     *
     */
    @ResponseBody
    @RequestMapping("/api/payDetailByCustomer")
    public Map<String, Object> payDetailByCustomer() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        try {
            //这里不是很想写

        } catch (Exception e) {
            e.printStackTrace();
            errMsg = "系统出错";
        }
        map.put("status", status);
        map.put("errMsg", errMsg);
        return map;
    }
}
