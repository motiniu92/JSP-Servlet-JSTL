<%-- 
    Document   : Welcome
    Created on : Apr 7, 2019, 6:11:23 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <%
            out.print("Welcome " + request.getParameter("uname"));
            session.setAttribute("n", request.getParameter("uname"));
          
        %>  
        <a href="Second.jsp">Second jsp page</a>  
    </body>
</html>
