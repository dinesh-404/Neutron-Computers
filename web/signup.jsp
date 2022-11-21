<%-- 
    Document   : signup
    Created on : 12 Nov, 2022, 12:42:27 PM
    Author     : Dinesh
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/signup.css">
        <title>Signup Page</title>
    </head>
    <body>
        <div class="center">
            <div class="left">
                <img class="a img" src="css/cssimg/logo-final.png" alt="" srcset="">
                <center><h1>Create Your Account</h1></center><hr>
                <form method="post" id="signupfrm" action="scripts/chksignup.jsp">
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
                            <div class="txtarea">
                                <div class="txtfield">
                                    <label class="label rbtngroup">Gender</label>
                                    <button type="button" id="mbtn" class="rbtn rbtngroup" onclick="document.getElementById('male').click(); m.classList.add('click'); f.classList.remove('click');">Male</button>
                                    <button type="button" id="fbtn" class="rbtn rbtngroup" onclick="document.getElementById('female').click(); this.classList.add('click'); m.classList.remove('click');">Female</button>
                                    <input hidden type="radio" id="male" name="gender" value="male" >
                                    <input hidden type="radio" id="female" name="gender" value="female" >
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
                        <input type="button" onclick="validation();" id="submitbtn" value="Sign Up" class="submitbtn">
                    </center>
                </form>
            </div>
            <div class="right">
                <center>
                    <h1>Already Have an Account ?</h1>
                    <div class="txt">Login here to get access to your account !</div>
                    <button onclick="location.href = 'login.jsp'" class="">Login</button>
                </center>
            </div>
        </div>
        <script src="javascript/validation.js">
            let m = document.getElementById("mbtn");
            let f = document.getElementById("fbtn");
        </script>
    </body>
</html>
