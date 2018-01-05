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
import com.utils.PageData;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by QuanQqqqq on 2018/1/3.
 */
@RequestMapping("/login")
@Controller
public class LoginController extends BaseController {

    @Autowired
    private AuthuserServiceImpl authuserServiceImpl;

    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @Autowired
    private WorkersServiceImpl workersServiceImpl;

    @RequestMapping("/api/doLogin")
    @ResponseBody
    public Map<String, Object> doCustomerLogin(HttpSession session) {
        Map<String, Object> map = new HashMap<String, Object>();
        boolean status = false;
        String errMsg = "";
        PageData pageData = this.getPageData();
        try {
            String type = pageData.getString("type");
            String username = pageData.getString("username");
            String password = DigestUtils.md5Hex(pageData.getString("password"));
            if (type.equals("authuser")) {
                TAuthuser authuser = authuserServiceImpl.selectByPrimaryKey(username);
                if (authuser == null) {
                    errMsg = "账号不存在";
                } else {
                    if (password.equals(authuser.getAuthuserpassword())) {
                        errMsg = "登录成功";
                        status = true;
                        session.setAttribute("username", username);
                        session.setAttribute("type", 1);
                        session.setAttribute("name", authuser.getAuthusername());
                    } else {
                        errMsg = "密码错误";
                    }
                }
            } else if (type.equals("customer")) {
                TCustomer customer = customerServiceImpl.selectByPrimaryKey(username);
                if (customer == null) {
                    errMsg = "账号不存在";
                } else {
                    if (password.equals(customer.getCustomerpassword())) {
                        errMsg = "登录成功";
                        status = true;
                        session.setAttribute("username", username);
                        session.setAttribute("name", customer.getCustomername());
                        session.setAttribute("type", 2);
                    } else {
                        errMsg = "密码错误";
                    }
                }
            } else if (type.equals("worker")) {
                TWorkers workers = workersServiceImpl.selectByPrimaryKey(username);
                if (workers == null) {
                    errMsg = "账号不存在";
                } else {
                    if (password.equals(workers.getWorkerpassword())) {
                        errMsg = "登录成功";
                        status = true;
                        session.setAttribute("username", username);
                        session.setAttribute("type", 3);
                        session.setAttribute("name", workers.getWorkername());
                    } else {
                        errMsg = "密码错误";
                    }
                }
            } else {
                errMsg = "请选择正确的登录类型";
            }
        } catch (Exception e) {
            errMsg = "无效登录";
            e.printStackTrace();
        }
        map.put("status", status);
        map.put("errMsg", errMsg);
        return map;
    }

    @RequestMapping("/doLogout")
    public ModelAndView doLogout(HttpSession session) {
        session.invalidate();
        return new ModelAndView("redirect:/login");
    }

    @RequestMapping("")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
}
