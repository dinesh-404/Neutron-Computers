<!-- <%-- 
    Document   : productinfo
    Created on : 21 Nov, 2022, 6:42:00 PM
    Author     : Dinesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> -->
<%@include file="scripts/connection.jsp" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Ubuntu:wght@300;400;500;700&display=swap');
            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&family=Staatliches&display=swap');
            @import url('https://fonts.googleapis.com/css2?family=Blinker:wght@100;200;300;400;600;700;800;900&display=swap');

            body {
                /* font-family: "Ubuntu"; */
                font-family: 'Staatliches', cursive;
                font-family: 'Blinker', sans-serif;
                margin: 0;
                padding: 0;
            }

            .center {
                height: 745px;
                display: grid;
                grid-template-columns: 1fr 500px;
            }

            .left {
                display: grid;
                grid-template-columns: 100px 1fr;
                height: 700px;
            }

            .sideimg {
                width: 100px;
                height: 60px;
                margin: 17px;
                transition: all .6s;
                opacity: 1;
                border-radius: 3px;
            }

            .mainimg {
                margin: 50px;
                width: 820px;
                height: 520px;
                transition: all 1.5s;
                opacity: 1;
                border-radius: 5px;
            }

            .imgsmall {
                margin-top: 70px;
            }

            .right {
                padding: 5px;
                /* background: gray; */
            }

            .name {
                font-size: 60px;
                font-family: 'Staatliches', cursive;
                /* color: rgb(0,0,0,0.9); */
                letter-spacing: 2px;
            }

            .price {
                position: absolute;
                bottom: 170px;
                font-size: 30px;
                font-family: 'Staatliches', cursive;
                font-weight: 100;
            }

            .hide {
                opacity: 0;
            }
            .addtocart{
                position: absolute;
                left: 50%;
                bottom: 80px;
                height: 50px;
                width: 150px;
                background:white;
                color: black;
                transition: all .4s;
                font-family: 'Staatliches', cursive;
                border-radius: 3px;
                font-size: 20px;

            }
            .addtocart:hover{
                background:black;
                color:white;
                width: 160px;
                font-size: 17px;
                height: 40px;
                border-radius: 5px;
            }
            p{
                word-spacing: 2px;
                letter-spacing: 1px;
            }
            
        </style>
    </head>
    <body>
        <% 
            String a = "3";
            String sql = "select * from products where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, a);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
        %>
        <div class="center">
            <div class="left">
                <div class="imgsmall">
                    <%
                        int i;
                        for (i = 1; i <=5; i++) {
                    %>
                    <img src="productimg/<%=rs.getString("pimage")+i  %>.jpg" onclick="change(<%out.println(i-1);%>)" class="sideimg" alt="">
                    <% } %>
                    
                </div>
                <div class="imgmain"><img class="mainimg" id="mainimg" src="productimg/<%=rs.getString("pimage")%>0.jpg" alt=""></div>
            </div>
            <div class="right">
                <h1 class="name"><%=rs.getString("name")%></h1>
                <h3>info</h3>
                <p>
                    <%=rs.getString("info")%>
                </p>
                <div class="price" >Price : <%=rs.getString("price")%>/-</div>
            </div>
        </div>
        <button class="addtocart" onclick="location.href='scripts/add_to_cart.jsp?pid=<%=rs.getString("id")%>'">Add to Cart</button>
        <% }%>
        <script src="javascript/imgchange.js"></script>
    </body>

</html>