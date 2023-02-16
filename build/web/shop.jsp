    <%-- 
    Document   : shop
    Created on : 5 Dec, 2022, 12:01:01 PM
    Author     : Dinesh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/shop.css">
        <link href="css/footer.css" rel="stylesheet">
        <title>Shop</title>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <br><br><br>
        <div class="row">
            <%  String sql = "select * from products";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_Computers", "root", "");
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet a = pst.executeQuery();
                while (a.next()) {
            %>
            <div class="card">
                <h1><%=a.getString("name")%></h1>
                <div class="price">Price : <%=a.getString("price")%></div>
                <img class="bimg" src="<%=a.getString("pimage")%>1.jpg" alt="">
                <button class="see-btn" onclick="location.href = 'productinfo.jsp?id=<%=a.getInt("id")%>'">See More </button>
            </div>
            <% }%>
        </div>
        <%@include file="footer.html" %>
    </body>
</html>