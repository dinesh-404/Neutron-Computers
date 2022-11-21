<%-- 
    Document   : index
    Created on : 11 Nov, 2022, 8:44:17 PM
    Author     : Dinesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <a href="login.jsp">Loginnnnnnnnnnn</a>
        <%
            out.println(session.getAttribute("id"));
                        out.println(session.getAttribute("name"));

            %>
    </body>
</html>
