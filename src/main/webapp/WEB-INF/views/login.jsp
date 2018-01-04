<%--
  Created by IntelliJ IDEA.
  User: QuanQqqqq
  Date: 2018/1/3
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@include file="public/head.jsp"%>
</head>
<body>
    <%@include file="public/navbar.jsp"%>
    <div class="container" style="width: 40%;">
        <h1>登录物业管理系统</h1>
            <div class="input-group">
                <span class="input-group-addon" id="input1">账号</span>
                <input type="text" id="username" name="" class="form-control" placeholder="请输入账号" aria-describedby="input1">
            </div>
            <br>
            <div class="input-group">
                <span class="input-group-addon" id="input2">密码</span>
                <input type="password" id="password" name="password" class="form-control" placeholder="请输入密码" aria-describedby="input2">
            </div>
            <br>
            <span class="input-group-addon">
               <input type="radio" aria-label="..." name="type">
               管理员
            </span>
                <span class="input-group-addon">
                <input type="radio" aria-label="..." name="type">
                小区住户
            </span>
                <span class="input-group-addon">
                <input type="radio" aria-label="..." name="type">
                物业工人
            </span>
            <br>
            <button class="btn btn-primary">登录</button>
    </div>
</body>
</html>