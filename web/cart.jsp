<%-- 
    Document   : mycart
    Created on : 5 Dec, 2022, 12:00:13 PM
    Author     : Dinesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String uid = request.getParameter("uid");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_computers", "root", "");
            String sql = "select uc.status,uc.payment,p.name,p.price,p.pimage from cart uc inner join products p on p.id = uc.pid where uc.uid = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uid);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
        %>
        <table class="tbl" >
            <td>
                <tr>g</tr>
                <tr>g</tr>
            </td>
            <td>
                <tr>g</tr>
                <tr>g</tr>
            </td>
            <%=rs.getString("name")%>
            <%=rs.getString("payment")%>
            <%=rs.getString("price")%>
            <%=rs.getString("pimage")%>
        </table>


    <% }%>
</body>
</html>
