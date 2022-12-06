package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/signup.css\">\r\n");
      out.write("        <title>Signup Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Ubuntu:wght@300;400;500;700&display=swap');\r\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&family=Staatliches&display=swap');\r\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Blinker:wght@100;200;300;400;600;700;800;900&display=swap');\r\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Ubuntu+Mono:ital,wght@0,400;0,700;1,400;1,700&display=swap');\r\n");
      out.write("\r\n");
      out.write("        .navmain {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top:0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            z-index: 5;\r\n");
      out.write("            font-family: \"Ubuntu Mono\";\r\n");
      out.write("            display: grid;\r\n");
      out.write("            padding-top: 5px;\r\n");
      out.write("            background:white;\r\n");
      out.write("            grid-template-columns: 1fr 1fr 1fr;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            box-shadow: rgba(0, 0, 0, 0.1) 0px 1px 3px 0px, rgba(0, 0, 0, 0.06) 0px 1px 2px 0px;\r\n");
      out.write("        }\r\n");
      out.write("        .navcenter{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("        }\r\n");
      out.write("        .navcenter a{\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            font-family: \"Blinker\";\r\n");
      out.write("            font-weight: 500;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: black;\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .navcenter a:hover{\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("        .navright{\r\n");
      out.write("            /* background:lightslategray; */\r\n");
      out.write("            text-align: right;\r\n");
      out.write("        }\r\n");
      out.write("        .navright .logo{\r\n");
      out.write("            margin-right:15px;\r\n");
      out.write("        }\r\n");
      out.write("        .navleft .logo{\r\n");
      out.write("            margin-left: 15px;\r\n");
      out.write("        }\r\n");
      out.write("        .logo{\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            width: 40px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"navmain\">\r\n");
      out.write("        <div class=\"navleft\"><a href=\"\"><img class=\"logo\" src=\"css/cssimg/logo-final.png\" alt=\"\"></a></div>\r\n");
      out.write("        <div class=\"navcenter\">\r\n");
      out.write("            <a href=\"http://\">Home</a>\r\n");
      out.write("            <a href=\"http://\">Shop</a>\r\n");
      out.write("            <a href=\"http://\">Cart</a>\r\n");
      out.write("            <a href=\"http://\">About</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navright\"><a href=\"\"><img class=\"logo\" src=\"css/cssimg/logo-final.png\" alt=\"\"></a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        <div class=\"center\" id=\"signupfrm\">\r\n");
      out.write("            <div class=\"left\">\r\n");
      out.write("                <center>\r\n");
      out.write("                    <h1>Create Your Account</h1>\r\n");
      out.write("                </center>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <form method=\"post\" id=\"signupfrm\" action=\"chk_signup\">\r\n");
      out.write("                    <div class=\"signupform\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <div class=\"txtarea\">\r\n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" required name=\"uname\" autofocus>\r\n");
      out.write("                                <label class=\"label a\">Username</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"txtarea\">\r\n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" id=\"mail\" required name=\"mail\">\r\n");
      out.write("                                <label class=\"label a\">Email</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"txtarea\">\r\n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" id=\"pwd\" required name=\"pwd\">\r\n");
      out.write("                                <label class=\"label a\">Password</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <div class=\"txtarea\">\r\n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" id=\"mobileno\" required name=\"mno\">\r\n");
      out.write("                                <label class=\"label a\">Mobile No</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"txtarea\">\r\n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" required name=\"age\">\r\n");
      out.write("                                <label class=\"label a\">Age</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"txtarea\">\r\n");
      out.write("                                <div class=\"txtfield\">\r\n");
      out.write("                                    <label class=\"label rbtngroup\">Gender</label>\r\n");
      out.write("                                    <button type=\"button\" id=\"mbtn\" class=\"rbtn rbtngroup\"\r\n");
      out.write("                                            onclick=\"document.getElementById('male').click(); m.classList.add('click'); f.classList.remove('click');\">Male</button>\r\n");
      out.write("                                    <button type=\"button\" id=\"fbtn\" class=\"rbtn rbtngroup\"\r\n");
      out.write("                                            onclick=\"document.getElementById('female').click(); this.classList.add('click'); m.classList.remove('click');\">Female</button>\r\n");
      out.write("                                    <input hidden type=\"radio\" id=\"male\" name=\"gender\" value=\"male\">\r\n");
      out.write("                                    <input hidden type=\"radio\" id=\"female\" name=\"gender\" value=\"female\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"txtarea\">\r\n");
      out.write("                        <input type=\"text\" class=\"txtfield inpt\" required name=\"address\">\r\n");
      out.write("                        <label class=\"label a\">Address</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <input type=\"submit\" id=\"submitbt\" value=\"Sign Up\" class=\"submitbtn\">\r\n");
      out.write("                    </center>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right\">\r\n");
      out.write("                <h1>Already have an Account ?</h1>\r\n");
      out.write("                <div class=\"text\">\r\n");
      out.write("                    Login and get access to your account\r\n");
      out.write("                </div>\r\n");
      out.write("                <button id=\"submitbtn\" class=\"submitbtn\">Login</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"center r hide\" id=\"loginfrm\">\r\n");
      out.write("            <div class=\"left\">\r\n");
      out.write("                <center>\r\n");
      out.write("                    <h1>Login to Your Account</h1>\r\n");
      out.write("                </center>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <form method=\"post\" action=\"chk_login\">\r\n");
      out.write("                    <div class=\"fields\">\r\n");
      out.write("                        <div class=\"txtarea r\">\r\n");
      out.write("                            <input type=\"text\" class=\"txtfield\" name=\"mail\" autofcode\r\n");
      out.write("                                   ocus required>\r\n");
      out.write("                            <label class=\"label a\">Enter Email</label>\r\n");
      out.write("                        </div> \r\n");
      out.write("                        <div class=\"txtarea r\">\r\n");
      out.write("                            <input type=\"password\" class=\"txtfield\" name=\"pwd\" required>\r\n");
      out.write("                            <label class=\"label a\">Enter Password</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <input type=\"submit\" class=\"submitbtn\" value=\"Login\">\r\n");
      out.write("                    </center>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right\">\r\n");
      out.write("                <h1>Dont have an Account ?</h1>\r\n");
      out.write("                <div class=\"text\">\r\n");
      out.write("                    Signup to get access to our site and much more..\r\n");
      out.write("                </div>\r\n");
      out.write("                <button id=\"loginbtn\" class=\"submitbtn\">SignUp</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"javascript/validation.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                                                // these variables are used in with html dont delete it\r\n");
      out.write("                                                let m = document.getElementById(\"mbtn\");\r\n");
      out.write("                                                        let f = document.getElementById(\"fbtn\");\r\n");
      out.write("                                                        let submitbtn = document.getElementById(\"submitbtn\");\r\n");
      out.write("                                                        let\r\n");
      out.write("                                                signupfrm = document.getElementById(\"signupfrm\");\r\n");
      out.write("                                                        let\r\n");
      out.write("                                                loginbtn = document.getElementById(\"loginbtn\");\r\n");
      out.write("                                                submitbtn.addEventListener(\"mousedown\", function () {\r\n");
      out.write("                                                    signupfrm.classList.add(\"hide\");\r\n");
      out.write("                                                    loginfrm.classList.remove(\"hide\");\r\n");
      out.write("                                                });\r\n");
      out.write("                                                loginbtn.addEventListener(\"mousedown\", function () {\r\n");
      out.write("                                                    signupfrm.classList.remove(\"hide\");\r\n");
      out.write("                                                    loginfrm.classList.add(\"hide\");\r\n");
      out.write("                                                });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
