<%-- 
    Document   : welcome
    Created on : Apr 18, 2019, 3:10:18 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <a  href = "second.jsp" > second jsp page</a >  
        <title>JSP Page</title>
    </head>
    <body>
        <%

            String name = request.getParameter("uname");
            out.print("Welcome " + name);

            pageContext.setAttribute("user", name, PageContext.SESSION_SCOPE);

           
  
        %>  
    </body>
</html>
