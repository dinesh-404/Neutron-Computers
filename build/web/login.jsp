<%-- 
   Document   : login
   Created on : 9 Nov, 2022, 2:15:26 PM
   Author     : Dinesh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/login.css" />
    <title>Sign in</title><link rel="stylesheet" href="css/login.css" />
</head>
<body>
    <div class="main a">
        <div class="mleft"></div>
        <div class="mright"></div>
    </div>

    <div class="center r">
        <img class="a img" src="css/cssimg/logo-final.png" alt="" srcset="">
        <div class="left">
            <h1>Login to Your Account</h1>
            <hr>
            <form method="post" action="scripts/chklogin.jsp">
                <div class="fields">
                    <div class="txtarea r">
                        <input type="text" class="txtfield" name="mail" autofocus required>
                        <label class="lbl a">Enter Email</label>
                    </div>
                    <div class="txtarea r">
                        <input type="password" class="txtfield" name="pwd" required>
                        <label class="lbl a">Enter Password</label>
                    </div>
                </div>
                <input type="submit" class="submitbtn" value="Login">
            </form>

        </div>
        <div class="right">
            <h1>Dont have an Account ?</h1>
            <div class="text">
                Signup to get access to our site and much more..
            </div>
            <button onclick="location.href = 'signup.jsp'">SignUp</button>
        </div>
    </div>
    <%
        String error = request.getParameter("err");
        if(error != null){
    %>
    <script>alert(<% out.println(error); %>);</script>
    <%
        }
    %>
</body>
</html>