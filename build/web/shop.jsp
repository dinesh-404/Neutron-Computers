<!-- <%-- 
    Document   : shop
    Created on : 5 Dec, 2022, 12:01:01 PM
    Author     : Dinesh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> -->
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/shop.css">
        <title>Shop</title>
    </head>

    <body>
        <%@include file="navbar.jsp" %>
        <br><br><br>
        <%  String sql = "select * from products"; %>
        <div class="row">
            <% for (int i = 1; i < 6; i++) {%>
            ok
            <!--            <div class="card">
            <h1>Origin-Pc</h1>
            <img class="bimg" src="css/cssimg/origin-pc.jpg" alt="">
            <div class="price">Price : 170,000 </div>
            <button class="see-btn">See More</button>

        </div>-->
            <% }%>

        </div>
    </body>

</html>