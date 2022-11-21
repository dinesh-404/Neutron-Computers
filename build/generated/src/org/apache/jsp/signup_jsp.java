package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/signup.css\">\n");
      out.write("        <title>Signup Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"center\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <img class=\"a img\" src=\"css/cssimg/logo-final.png\" alt=\"\" srcset=\"\">\n");
      out.write("                <center><h1>Create Your Account</h1></center><hr>\n");
      out.write("                <form method=\"post\" id=\"signupfrm\" action=\"scripts/chksignup.jsp\">\n");
      out.write("                    <div class=\"signupform\">\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"txtarea\"> \n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" required name=\"uname\" autofocus>  \n");
      out.write("                                <label class=\"label a\">Username</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"txtarea\">\n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" id=\"mail\" required name=\"mail\">\n");
      out.write("                                <label class=\"label a\">Email</label>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"txtarea\">\n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" id=\"pwd\" required name=\"pwd\">\n");
      out.write("                                <label class=\"label a\">Password</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <div class=\"txtarea\">\n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" id=\"mobileno\" required name=\"mno\">\n");
      out.write("                                <label class=\"label a\">Mobile No</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"txtarea\">\n");
      out.write("                                <input type=\"text\" class=\"txtfield inpt\" required name=\"age\">\n");
      out.write("                                <label class=\"label a\">Age</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"txtarea\">\n");
      out.write("                                <div class=\"txtfield\">\n");
      out.write("                                    <label class=\"label rbtngroup\">Gender</label>\n");
      out.write("                                    <button type=\"button\" id=\"mbtn\" class=\"rbtn rbtngroup\" onclick=\"document.getElementById('male').click(); m.classList.add('click'); f.classList.remove('click');\">Male</button>\n");
      out.write("                                    <button type=\"button\" id=\"fbtn\" class=\"rbtn rbtngroup\" onclick=\"document.getElementById('female').click(); this.classList.add('click'); m.classList.remove('click');\">Female</button>\n");
      out.write("                                    <input hidden type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" >\n");
      out.write("                                    <input hidden type=\"radio\" id=\"female\" name=\"gender\" value=\"female\" >\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"txtarea\">\n");
      out.write("                        <input type=\"text\" class=\"txtfield inpt\" required name=\"address\">\n");
      out.write("                        <label class=\"label a\">Address</label>\n");
      out.write("                    </div>\n");
      out.write("                    <center>\n");
      out.write("                        <input type=\"button\" onclick=\"validation();\" id=\"submitbtn\" value=\"Sign Up\" class=\"submitbtn\">\n");
      out.write("                    </center>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <center>\n");
      out.write("                    <h1>Already Have an Account ?</h1>\n");
      out.write("                    <div class=\"txt\">Login here to get access to your account !</div>\n");
      out.write("                    <button onclick=\"location.href = 'login.jsp'\" class=\"\">Login</button>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"javascript/validation.js\">\n");
      out.write("            let m = document.getElementById(\"mbtn\");\n");
      out.write("            let\n");
      out.write("            f = document.getElementById(\"fbtn\");\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
