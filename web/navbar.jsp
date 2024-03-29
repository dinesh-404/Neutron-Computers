!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Ubuntu:wght@300;400;500;700&display=swap');
            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&family=Staatliches&display=swap');
            @import url('https://fonts.googleapis.com/css2?family=Blinker:wght@100;200;300;400;600;700;800;900&display=swap');
            @import url('https://fonts.googleapis.com/css2?family=Ubuntu+Mono:ital,wght@0,400;0,700;1,400;1,700&display=swap');

            .navmain {

                position: absolute;
                top:0;
                width: 100%;
                z-index: 5;
                font-family: "Ubuntu Mono";
                display: grid;
                padding-top: 5px;
                background:white;
                grid-template-columns: 1fr 1fr 1fr;
                height: 50px;
                box-shadow: rgba(0, 0, 0, 0.1) 0px 1px 3px 0px, rgba(0, 0, 0, 0.06) 0px 1px 2px 0px;
            }
            .navcenter{
                text-align: center;
                font-size: 30px;
            }
            .navcenter a{
                margin-top: 10px;
                font-family: "Blinker";
                font-weight: 500;
                text-decoration: none;
                color: black;
                margin: 20px;
            }
            .navcenter a:hover{
                text-decoration: underline;
            }
            .navright{
                /* background:lightslategray; */
                text-align: right;
            }
            .navright .logo{
                margin-right:15px;
            }
            .navleft .logo{
                margin-left: 15px;
            }
            .logo{
                height: 40px;
                width: 40px;
            }
        </style>
    </head>
    <body>
        <div class="navmain">
            <div class="navleft"><a href="index.jsp"><img class="logo" src="css/cssimg/logo-final.png" alt=""></a></div>
            <div class="navcenter">
                <a href="index.jsp">Home</a>
                <a href="shop.jsp">Shop</a>
                <a href="cart.jsp">Cart</a>
             
            </div>
            <!--<div class="navright"><a href=""><img class="logo" src="css/cssimg/logo-final.png" alt=""></a></div>-->
            <div class="navright"><%

                    if (session.getAttribute("id") != null) {
                        out.println("<a href='logout' class='logo'>logout</a>");
                    } else {
                        out.println("<a href='login.jsp' class='logo'>login</a>");
                    }
                %></div>

        </div>
    </body>
</html>