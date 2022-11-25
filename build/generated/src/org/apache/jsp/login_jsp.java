package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/signup.css\">\r\n");
      out.write("    <title>Signup Page</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .hide {\r\n");
      out.write("            height: 0;\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: -5px;\r\n");
      out.write("            margin-left: 120px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"center\" id=\"signupfrm\">\r\n");
      out.write("        <div class=\"left\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <h1>Create Your Account</h1>\r\n");
      out.write("            </center>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <form method=\"post\" id=\"signupfrm\" action=\"chk_signup\">\r\n");
      out.write("                <div class=\"signupform\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div class=\"txtarea\">\r\n");
      out.write("                            <input type=\"text\" class=\"txtfield inpt\" required name=\"uname\" autofocus>\r\n");
      out.write("                            <label class=\"label a\">Username</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"txtarea\">\r\n");
      out.write("                            <input type=\"text\" class=\"txtfield inpt\" id=\"mail\" required name=\"mail\">\r\n");
      out.write("                            <label class=\"label a\">Email</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"txtarea\">\r\n");
      out.write("                            <input type=\"text\" class=\"txtfield inpt\" id=\"pwd\" required name=\"pwd\">\r\n");
      out.write("                            <label class=\"label a\">Password</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div class=\"txtarea\">\r\n");
      out.write("                            <input type=\"text\" class=\"txtfield inpt\" id=\"mobileno\" required name=\"mno\">\r\n");
      out.write("                            <label class=\"label a\">Mobile No</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"txtarea\">\r\n");
      out.write("                            <input type=\"text\" class=\"txtfield inpt\" required name=\"age\">\r\n");
      out.write("                            <label class=\"label a\">Age</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"txtarea\">\r\n");
      out.write("                            <div class=\"txtfield\">\r\n");
      out.write("                                <label class=\"label rbtngroup\">Gender</label>\r\n");
      out.write("                                <button type=\"button\" id=\"mbtn\" class=\"rbtn rbtngroup\"\r\n");
      out.write("                                    onclick=\"document.getElementById('male').click(); m.classList.add('click'); f.classList.remove('click');\">Male</button>\r\n");
      out.write("                                <button type=\"button\" id=\"fbtn\" class=\"rbtn rbtngroup\"\r\n");
      out.write("                                    onclick=\"document.getElementById('female').click(); this.classList.add('click'); m.classList.remove('click');\">Female</button>\r\n");
      out.write("                                <input hidden type=\"radio\" id=\"male\" name=\"gender\" value=\"male\">\r\n");
      out.write("                                <input hidden type=\"radio\" id=\"female\" name=\"gender\" value=\"female\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"txtarea\">\r\n");
      out.write("                    <input type=\"text\" class=\"txtfield inpt\" required name=\"address\">\r\n");
      out.write("                    <label class=\"label a\">Address</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <center>\r\n");
      out.write("                    <input type=\"button\" id=\"submitbt\" value=\"Sign Up\" class=\"submitbtn\">\r\n");
      out.write("                </center>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"right\">\r\n");
      out.write("            <h1>Already have an Account ?</h1>\r\n");
      out.write("            <div class=\"text\">\r\n");
      out.write("                Login and get access to your account\r\n");
      out.write("            </div>\r\n");
      out.write("            <button id=\"submitbtn\" class=\"submitbtn\">Login</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"center r hide\" id=\"loginfrm\">\r\n");
      out.write("        <div class=\"left\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <h1>Login to Your Account</h1>\r\n");
      out.write("            </center>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <form method=\"post\" action=\"chk_lohin\">\r\n");
      out.write("                <div class=\"fields\">\r\n");
      out.write("                    <div class=\"txtarea r\">\r\n");
      out.write("                        <input type=\"text\" class=\"txtfield\" name=\"mail\" autofocus required>\r\n");
      out.write("                        <label class=\"label a\">Enter Email</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"txtarea r\">\r\n");
      out.write("                        <input type=\"password\" class=\"txtfield\" name=\"pwd\" required>\r\n");
      out.write("                        <label class=\"label a\">Enter Password</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <center>\r\n");
      out.write("                    <input type=\"submit\" class=\"submitbtn\" value=\"Login\">\r\n");
      out.write("                </center>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"right\">\r\n");
      out.write("            <h1>Dont have an Account ?</h1>\r\n");
      out.write("            <div class=\"text\">\r\n");
      out.write("                Signup to get access to our site and much more..\r\n");
      out.write("            </div>\r\n");
      out.write("            <button id=\"loginbtn\" class=\"submitbtn\">SignUp</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- <script src=\"javascript/validation.js\"> -->\r\n");
      out.write("    <script>\r\n");
      out.write("        // these variables are used in with html dont delete it\r\n");
      out.write("        let m = document.getElementById(\"mbtn\");\r\n");
      out.write("        let f = document.getElementById(\"fbtn\");\r\n");
      out.write("        let submit = document.getElementById(\"submitbtn\");\r\n");
      out.write("        let signupfrm = document.getElementById(\"signupfrm\");\r\n");
      out.write("        let loginbtn = document.getElementById(\"loginbtn\");\r\n");
      out.write("        submit.addEventListener(\"mousedown\", function () {\r\n");
      out.write("            signupfrm.classList.add(\"hide\");\r\n");
      out.write("            loginfrm.classList.remove(\"hide\");\r\n");
      out.write("        });\r\n");
      out.write("        loginbtn.addEventListener(\"mousedown\", function () {\r\n");
      out.write("            signupfrm.classList.remove(\"hide\");\r\n");
      out.write("            loginfrm.classList.add(\"hide\");\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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
