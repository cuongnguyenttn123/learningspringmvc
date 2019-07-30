<%--
  Created by IntelliJ IDEA.
  User: cuong
  Date: 28/07/2019
  Time: 03:35 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
    <title>LOGIN-MVC</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
<div class="wrapper">
    <h1>Login Account</h1>
    <div class="content">
        <div id="form_wrapper" class="form_wrapper">

            <h2 style="padding: 20px;">${message}</h2>

            <form class="login active" name='loginForm' action="/login" method='POST'>
                <h3>Login</h3>
                <p style='color:red;font-weight:bold;font-style:italic'>${error}</p>
                <%session.getAttribute("user");%>

                <div>
                    <label>Username:</label>
                    <input name="username" type="text" placeholder=" Enter Username"/>
                </div>
                <div>
                    <label>Password:</label>
                    <input type="password" name="password" placeholder=" Enter password"/>
                </div>
                <div class="bottom">
                    <input name="submit" type="submit" value="login" />
                    <div class="clear"></div>
                </div>

                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>
        </div>
        <div class="clear"></div>
    </div>
</div>
</body>
</html>
