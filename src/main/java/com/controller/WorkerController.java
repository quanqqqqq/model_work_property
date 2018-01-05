package com.controller;

import com.model.TWorkers;
import com.model.TWorkersExample;
import com.service.WorkersService;
import com.service.impl.WorkersServiceImpl;
import com.utils.PageData;
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
@RequestMapping("/worker")
public class WorkerController extends BaseController {

    @Autowired
    private WorkersServiceImpl workersService;

    @RequestMapping("list/{id}")
    public ModelAndView list(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        //设置页面信息
        try {
            TWorkersExample workersExample = new TWorkersExample();
            modelAndView.addObject("list", workersService.selectByExample(workersExample));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }


    /**
     * 获得工人列表
     *
     */
    @RequestMapping("/api/getWorkersList")
    @ResponseBody
    public Map<String, Object> getWorkersList() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            map.put("list", workersService.selectByExample(new TWorkersExample()));
            status = true;
            errMsg = "获取列表成功";
        } catch (Exception e) {
            e.printStackTrace();
            errMsg = "系统出错";
        }
        map.put("status", status);
        map.put("errMsg", errMsg);
        return map;
    }

    /**
     * 分配工人工资
     *
     */
    @RequestMapping("/api/payMoneyToWorker")
    @ResponseBody
    public Map<String, Object> payMoneyToWorker() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            //这里忘记写字段了，先空着吧
            TWorkers workers = workersService.selectByPrimaryKey(pageData.getString("workId"));
            int money = Integer.valueOf(pageData.getString("money"));

            workersService.updateByPrimaryKey(workers);
            status = true;
            errMsg = "分配工资成功";
        } catch (Exception e) {
            e.printStackTrace();
            errMsg = "系统出错";
        }
        map.put("status", status);
        map.put("errMsg", errMsg);
        return map;
    }

}
