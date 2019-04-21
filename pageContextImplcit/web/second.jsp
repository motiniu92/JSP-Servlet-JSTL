<%-- 
    Document   : second
    Created on : Apr 18, 2019, 3:13:40 PM
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
        <%

            String name = (String) pageContext.getAttribute("user", PageContext.SESSION_SCOPE);
            out.print("Hello " + name);

        %>  
    </body>
</html>
