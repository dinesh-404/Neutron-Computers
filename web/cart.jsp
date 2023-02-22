<%-- Document : mycart Created on : 5 Dec, 2022, 12:00:13 PM Author : Dinesh --%>
<%
    if (session.getAttribute("id") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="resources/css/imports.css">
        <link rel="stylesheet" href="css/cart.css">
        <title>My Cart</title>
    </head>
    <body>
    <center>
        <table class="CartTable">

            <tr>
                <th colspan="5">
                    <h1>My Cart</h1>
                </th>
            </tr>
            <%
                String uid = (String) session.getAttribute("id");
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_computers", "root", "");
                String sql = "select uc.id ,uc.status,uc.payment,p.name,p.price,p.pimage from cart uc inner join products p on p.id = uc.pid where uc.uid = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, uid);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {%>
            <tr class="CartRow" onclick="location.href = 'productinfo.jsp?id=<%=rs.getString("id")%>'">
                <td class="cartimg"><img src="productimg/<%=rs.getString("pimage")%>1.jpg" alt="" srcset=""></td>
                <td class="CartColumns">   <%=rs.getString("name")%> </td>
                <td class="CartColumns"><%=rs.getString("price")%></td>
                <td class="CartColumns"><%=rs.getString("status")%></td>

                <td class="CartColumns"><a href="resources/phpscripts/delete_cart.php?pid=<?php echo $row['id']; ?>">Remove</a></td>
            </tr>
            <% }%>

            <tr class="price">
                <td class="CartColumns" colspan="4">Checkout with Cash On Delivery</td>
                <td class="CartColumms"><button onclick="location.href='order'">Check Out</button></td>
            </tr>

        </table>
    </center>
</body>
</html>