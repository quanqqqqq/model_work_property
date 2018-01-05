package com.controller;

import com.dao.TCustomerMapper;
import com.model.TCustomerExample;
import com.service.CustomerService;
import com.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by QuanQqqqq on 2018/1/4.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController {

    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("/authuser/customerList");
        try {
            modelAndView.addObject("list", customerServiceImpl.selectByExample(new TCustomerExample()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    @RequestMapping("/detail/{customerId}")
    public ModelAndView detail(@PathVariable(value = "customerId") String customerId) {
        ModelAndView modelAndView = new ModelAndView("/customer/personal");
        try {
            modelAndView.addObject("customer", customerServiceImpl.selectByPrimaryKey(customerId));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    @RequestMapping("/addCustomer")
    public ModelAndView addCustomer() {
        return new ModelAndView("/customer/addDetail");
    }

    @RequestMapping("/editCustomer/{customerId}")
    public ModelAndView edit(@PathVariable("customerId") String customerId) {
        ModelAndView modelAndView = new ModelAndView("/customer/editDetail");
        try {
            modelAndView.addObject("customer", customerServiceImpl.selectByPrimaryKey(customerId));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }
}
