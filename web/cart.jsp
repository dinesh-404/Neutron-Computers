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
        <table class="tbl">

            <%
                String uid = request.getParameter("uid");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_computers", "root", "");
                String sql = "select uc.id ,uc.status,uc.payment,p.name,p.price,p.pimage from cart uc inner join products p on p.id = uc.pid where uc.uid = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, uid);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getString("name")%></td>
                <td><%=rs.getString("pimage")%></td>
                <td><%=rs.getString("payment")%></td>
                <td><%=rs.getString("price")%></td>
                <td><a href="delete_cart?id=<%=rs.getString("id")%>">Delete</a></td>

            </tr>
            <% }%>

        </table>

    </body>
</html> 
