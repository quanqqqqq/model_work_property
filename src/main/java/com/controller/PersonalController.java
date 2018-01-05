package com.controller;

import com.model.TAuthuser;
import com.model.TCustomer;
import com.model.TWorkers;
import com.service.AuthuserService;
import com.service.CustomerService;
import com.service.WorkersService;
import com.service.impl.AuthuserServiceImpl;
import com.service.impl.CustomerServiceImpl;
import com.service.impl.WorkersServiceImpl;
import com.sun.deploy.ref.AppModel;
import com.utils.PageData;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@Controller
@RequestMapping("/personal")
public class PersonalController extends BaseController {
    @Autowired
    private AuthuserServiceImpl authuserServiceImpl;

    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @Autowired
    private WorkersServiceImpl workersServiceImpl;

    /**
     * 增加用户
     *
     * @return
     */
    @RequestMapping("/api/addCustomer")
    @ResponseBody
    public Map<String, Object> addCustomer() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            TCustomer customer = new TCustomer();
            customer.setAddress(pageData.getString("address"));
            customer.setCustomerid(pageData.getString("customerId"));
            customer.setCustomername(pageData.getString("name"));
            customer.setCustomerpassword(DigestUtils.md5Hex(pageData.getString("password")));
            customer.setCustomersex(Integer.valueOf(pageData.getString("sex")));
            customer.setCustomertel(pageData.getString("tel"));
            customer.setWorktotal(0);
            customer.setHasapplywork((byte) 0);
            customerServiceImpl.insert(customer);
            errMsg = "增加客户成功";
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
     * 增加管理员
     *
     * @return
     */
    @RequestMapping("/api/addAuthuser")
    @ResponseBody
    public Map<String, Object> addAuthuser() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            TAuthuser authuser = new TAuthuser();
            authuser.setAuthpower(Integer.valueOf(pageData.getString("authpower")));
            authuser.setAuthuseremail(pageData.getString("email"));
            authuser.setAuthuserid(pageData.getString("authuserId"));
            authuser.setAuthuserpassword(DigestUtils.md5Hex(pageData.getString("password")));
            authuser.setAuthusersex(Integer.valueOf(pageData.getString("sex")));
            authuser.setAuthusertel(pageData.getString("tel"));
            authuser.setLastloginip("0");
            authuserServiceImpl.insert(authuser);
            errMsg = "增加管理员成功";
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
     * 增加工人
     *
     * @return
     */
    @RequestMapping("/api/addWorker")
    @ResponseBody
    public Map<String, Object> addWorker() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        PageData pageData = this.getPageData();
        String errMsg = "";
        try {
            TWorkers workers = new TWorkers();
            workers.setWorkeraddress(pageData.getString("address"));
            workers.setWorkeremail(pageData.getString("email"));
            workers.setWorkerid(pageData.getString("workerId"));
            workers.setWorkername(pageData.getString("name"));
            workers.setWorkertel(pageData.getString("tel"));
            workers.setWorkerpassword(DigestUtils.md5Hex(pageData.getString("password")));
            workersServiceImpl.insert(workers);
            errMsg = "增加工人成功";
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
     * 更改用户
     *
     * @return
     */
    @RequestMapping("/api/updateCustomer")
    @ResponseBody
    public Map<String, Object> updateCustomer() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            TCustomer customer = customerServiceImpl.selectByPrimaryKey(pageData.getString("customerId"));
            customer.setAddress(pageData.getString("address"));
            customer.setCustomername(pageData.getString("name"));
            customer.setCustomerpassword(DigestUtils.md5Hex(pageData.getString("password")));
            customer.setCustomersex(Integer.valueOf(pageData.getString("sex")));
            customer.setCustomertel(pageData.getString("tel"));
            customer.setWorktotal(0);
            customer.setHasapplywork((byte) 0);
            customerServiceImpl.updateByPrimaryKey(customer);
            errMsg = "更新用户信息成功";
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
     * 更改管理员信息
     *
     * @return
     */
    @RequestMapping("/api/updateAuthuser")
    @ResponseBody
    public Map<String, Object> updateAuthuser() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            TAuthuser authuser = authuserServiceImpl.selectByPrimaryKey(pageData.getString("authuserId"));
            authuser.setAuthpower(Integer.valueOf(pageData.getString("authpower")));
            authuser.setAuthuseremail(pageData.getString("email"));
            authuser.setAuthuserid(pageData.getString("authuserId"));
            authuser.setAuthuserpassword(DigestUtils.md5Hex(pageData.getString("password")));
            authuser.setAuthusersex(Integer.valueOf(pageData.getString("sex")));
            authuser.setAuthusertel(pageData.getString("tel"));
            authuser.setLastloginip("0");
            authuserServiceImpl.updateByPrimaryKey(authuser);
            errMsg = "更新管理员信息成功";
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
     * 更改工人信息
     *
     * @return
     */
    @RequestMapping("/api/updateWorker")
    @ResponseBody
    public Map<String, Object> updateWorker() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            TWorkers workers = workersServiceImpl.selectByPrimaryKey(pageData.getString("workerId"));
            workers.setWorkeraddress(pageData.getString("address"));
            workers.setWorkeremail(pageData.getString("email"));
            workers.setWorkerid(pageData.getString("workerId"));
            workers.setWorkername(pageData.getString("name"));
            workers.setWorkertel(pageData.getString("tel"));
            workers.setWorkerpassword(DigestUtils.md5Hex(pageData.getString("password")));
            workersServiceImpl.updateByPrimaryKey(workers);
            errMsg = "更新工人信息成功";
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
     * 删除用户
     *
     * @return
     */
    @RequestMapping("/api/deleteCustomer")
    @ResponseBody
    public Map<String, Object> deleteCustomer() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            customerServiceImpl.deleteByPrimaryKey(pageData.getString("customerId"));
             errMsg = "删除成功";
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
     * 删除管理员
     *
     * @return
     */
    @RequestMapping("/api/deleteAuthuser")
    @ResponseBody
    public Map<String, Object> deleteAuthuser() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            authuserServiceImpl.deleteByPrimaryKey(pageData.getString("authuserid"));
            errMsg = "删除管理员成功";
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
     * 删除工人
     *
     * @return
     */
    @RequestMapping("/api/deleteWorker")
    @ResponseBody
    public Map<String, Object> deleteWorker() {
        Map<String, Object> map = new HashMap();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            workersServiceImpl.deleteByPrimaryKey(pageData.getString("workerId"));
            errMsg = "删除工人成功";
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
            errMsg = "系统出错";
        }
        map.put("status", status);
        map.put("errMsg", errMsg);
        return map;
    }
}
