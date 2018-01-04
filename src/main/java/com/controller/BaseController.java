package com.controller;

import com.utils.PageData;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by QuanQqqqq on 2018/1/4.
 */
public class BaseController {
    protected String requestParam(HttpServletRequest request, String key){

        return request.getParameter(key);
    }


    public PageData getPageData(){
        return new PageData(this.getRequest());
    }

    public HttpServletRequest getRequest(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }
}
