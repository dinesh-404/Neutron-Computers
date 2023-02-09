<%-- Document : mycart Created on : 5 Dec, 2022, 12:00:13 PM Author : Dinesh --%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
}

table.tbl {
    width: 80%;
    margin: 30px auto;
    border-collapse: collapse;
}

table.tbl td, table.tbl th {
    border: 1px solid #333;
    padding: 8px;
}

table.tbl td.img {
    width: 20%;
}

table.tbl img {
    width: 100%;
}

table.tbl td {
    text-align: center;
}

table.tbl a {
    color: #333;
    text-decoration: none;
}

        </style>
        <body>
            <table class="tbl">
                <% String uid = request.getParameter("uid");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_computers", "root", "");
                    String sql = "select uc.id ,uc.status,uc.payment,p.name,p.price,p.pimage from cart uc inner join products p on p.id = uc.pid where uc.uid = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, uid);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {%>
                <tr>
                    <td class="img">
                        <img src="<%=rs.getString("pimage")%>0.jpg" alt="" srcset="">
                    </td>
                    <td>
                        <%=rs.getString("name")%> 
                    </td>
                    <td>
                        <%=rs.getString("payment")%>
                    </td>
                    <td>
                        <%=rs.getString("price")%>
                    </td>
                    <td><a href="delete_cart?id=<%=rs.getString("id")%>">Remove</a></td>
                </tr>    
                <% }%>
            </table>
             </body>
    </html>