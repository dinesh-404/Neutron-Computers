<%-- 
    Document   : admin
    Created on : 16 Nov, 2022, 6:22:25 PM
    Author     : Dinesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@include file="scripts/connection.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/admin.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
        
        
        <div class="outline"></div>
            <div class="in">
                
                <table border="2">
                    <tr><td colspan="3">click on row to delete it</td><tr>
                    <tr>
                        <td>id</td>
                        <td>Name</td>
                        <td>pwd</td>
                    </tr>
<%                try {
                            String q = "select * from login";
                            Statement pstmt = con.createStatement();
                            ResultSet rs = pstmt.executeQuery(q);
                            while (rs.next()) {
                    %>
                    <tr class="tablerow" onclick="location.href = 'deletescript.jsp?id=<%=rs.getInt("id")%> '"> <td><%=rs.getString("id")%></td>
                        <td class="tablec"><%=rs.getString("username")%></td>
                        <td class="tablec"><%=rs.getString("password")%></td>
                    </tr>
                    <%
                            }
                        } catch (Exception e) {
                            out.println(e);
                        }
                    %>
                </table>
                <br>
                                <br>
                <br>

                <%@include file="scripts/addproducts.jsp" %>
                <br>
                <br>
        </div>
    </body>
</html>
