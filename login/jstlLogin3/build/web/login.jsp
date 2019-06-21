<%-- 
    Document   : login
    Created on : May 8, 2019, 10:29:30 AM
    Author     : Md Abdul Motin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Please Login!</h1>
        <form action="loginAuthenticate.jsp">
            username:<input type="text" name="username"/><br/>
            password:<input type="password" name="password"/><br/>
            <input type="submit" value="login"/>
        </form>
        <font color="red">
        <c:if test="${not empty param.errMsg}">
            <c:out value="${param.errMsg}"/>
        </c:if>
        <font/>
</html>
