<%--
  Created by IntelliJ IDEA.
  User: QuanQqqqq
  Date: 2018/1/3
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">小区报修系统</a>
        </div>

        <%
            String username = (String) session.getAttribute("username");
            int type = 0;
            if (session.getAttribute("type") != null) {
                type = Integer.valueOf((String) session.getAttribute("type"));
            }
        %>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <c:if test="${username != null}">
                    <%-- 管理员 --%>
                    <c:if test="${type == 1}">
                        <li><a href="#">查看所有工单</a></li>
                        <li><a href="#">管理小区人员</a> </li>
                        <li><a href="#">管理小区工人</a> </li>
                    </c:if>
                    <c:if test="${type == 2}">
                        <li><a href="#">查看所有工单</a></li>
                    </c:if>
                    <c:if test="${type == 3}">
                        <li><a href="#">查看所有工单</a></li>
                    </c:if>
                </c:if>
            </ul>
            <ul class="nav navbar-nav navbar-right">

                <c:choose>
                    <c:when test="${username == null}">
                        <li><a href="/login">登录</a></li>
                    </c:when>
                    <c:otherwise>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                <%=session.getAttribute("name")%>
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">个人中心</a></li>
                                <li><a href="#">退出登录</a></li>
                            </ul>
                        </li>
                    </c:otherwise>
                </c:choose>

            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
