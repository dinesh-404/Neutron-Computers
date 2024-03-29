<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/signup.css">
        <title>Signup Page</title>
    </head>
    <body>
        <%
            if (session.getAttribute("id") != null) {
                response.sendRedirect("index.jsp");
            }
            String alrt = request.getParameter("err");
            if (alrt!=null) {
                out.println("<script>alert(" + alrt + ")</script>");
            }
        %>
        <%@include file="navbar.jsp" %>
        <div class="center" id="signupfrm">
            <div class="left">
                <center>
                    <h1>Create Your Account</h1>
                </center>
                <hr>
                <form method="post" id="signupfrm" action="chk_signup">
                    <div class="signupform">
                        <div>
                            <div class="txtarea">
                                <input type="text" class="txtfield inpt" required name="uname" autofocus>
                                <label class="label a">Username</label>
                            </div>
                            <div class="txtarea">
                                <input type="text" class="txtfield inpt" id="mail" required name="mail">
                                <label class="label a">Email</label>
                            </div>
                            <div class="txtarea">
                                <input type="text" class="txtfield inpt" id="pwd" required name="pwd">
                                <label class="label a">Password</label>
                            </div>
                        </div>
                        <div>
                            <div class="txtarea">
                                <input type="text" class="txtfield inpt" id="mobileno" required name="mno">
                                <label class="label a">Mobile No</label>
                            </div>
                            <div class="txtarea">
                                <input type="text" class="txtfield inpt" required name="age">
                                <label class="label a">Age</label>
                            </div>
                            <div class="txtarea" >
                                <div class="txtfield">
                                    <label class="label rbtngroup">Gender</label>
                                    <div class="radiobtns">
                                        <button type="button" id="mbtn" class="rbtn rbtngroup"
                                                onclick="document.getElementById('male').click(); m.classList.add('click'); f.classList.remove('click');">Male</button>
                                        <button type="button" id="fbtn" class="rbtn rbtngroup"
                                                onclick="document.getElementById('female').click(); this.classList.add('click'); m.classList.remove('click');">Female</button>
                                    </div>
                                    <input hidden type="radio" id="male" name="gender" value="male">
                                    <input hidden type="radio" id="female" name="gender" value="female">
                                </div>
                            </div>
                        </div>
                    </div>
                    <br>
                    <div class="txtarea">
                        <input type="text" class="txtfield inpt" required name="address">
                        <label class="label a">Address</label>
                    </div>
                    <center>
                        <input type="button" id="submitbt" value="Sign Up" class="submitbtn">
                    </center>
                </form>
            </div>
            <div class="right">
                <h1>Already have an Account ?</h1>
                <div class="text">
                    Login and get access to your account
                </div>
                <button id="submitbtn" class="submitbtn">Login</button>
            </div>
        </div>
        <div class="center r hide" id="loginfrm">
            <div class="left">
                <center>
                    <h1>Login to Your Account</h1>
                </center>
                <hr>
                <form method="post" action="chk_login">
                    <div class="fields">
                        <div class="txtarea r">
                            <input type="text" class="txtfield" name="mail" autofcode
                                   ocus required>
                            <label class="label a">Enter Email</label>
                        </div> 
                        <div class="txtarea r">
                            <input type="password" class="txtfield" name="pwd" required>
                            <label class="label a">Enter Password</label>
                        </div>
                    </div>
                    <br>
                    <center>
                        <input type="submit" class="submitbtn" value="Login">
                    </center>
                </form>
            </div>
            <div class="right">
                <h1>Dont have an Account ?</h1>
                <div class="text">
                    Signup to get access to our site and much more..
                </div>
                <button id="loginbtn" class="submitbtn">SignUp</button>
            </div>
        </div>
        <script src="javascript/validation.js"></script>
        <script>
                                                    // these variables are used in with html dont delete it
                                                    let m = document.getElementById("mbtn");
                                                            let f = document.getElementById("fbtn");
                                                            let
                                                    submitbtn = document.getElementById("submitbtn");
                                                            let
                                                    signupfrm = document.getElementById("signupfrm");
                                                    let
                                                    loginbtn = document.getElementById("loginbtn");
                                                    submitbtn.addEventListener("mousedown", function () {
                                                        signupfrm.classList.add("hide");
                                                        loginfrm.classList.remove("hide");
                                                    });
                                                    loginbtn.addEventListener("mousedown", function () {
                                                        signupfrm.classList.remove("hide");
                                                        loginfrm.classList.add("hide");
                                                    });
        </script>
    </body>
</html>
