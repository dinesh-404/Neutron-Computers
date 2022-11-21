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
      out.write(" \n");
      out.write("<!DOCTYPE html> \n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/login.css\" />\n");
      out.write("    <title>Sign in</title><link rel=\"stylesheet\" href=\"css/login.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"main a\">\n");
      out.write("        <div class=\"mleft\"></div>\n");
      out.write("        <div class=\"mright\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"center r\">\n");
      out.write("        <img class=\"a img\" src=\"css/cssimg/logo-final.png\" alt=\"\" srcset=\"\">\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <h1>Login to Your Account</h1>\n");
      out.write("            <hr>\n");
      out.write("            <form method=\"post\" action=\"scripts/chklogin.jsp\">\n");
      out.write("                <div class=\"fields\">\n");
      out.write("                    <div class=\"txtarea r\">\n");
      out.write("                        <input type=\"text\" class=\"txtfield\" name=\"mail\" autofocus required>\n");
      out.write("                        <label class=\"lbl a\">Enter Email</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"txtarea r\">\n");
      out.write("                        <input type=\"password\" class=\"txtfield\" name=\"pwd\" required>\n");
      out.write("                        <label class=\"lbl a\">Enter Password</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" class=\"submitbtn\" value=\"Login\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"right\">\n");
      out.write("            <h1>Dont have an Account ?</h1>\n");
      out.write("            <div class=\"text\">\n");
      out.write("                Signup to get access to our site and much more..\n");
      out.write("            </div>\n");
      out.write("            <button onclick=\"location.href = 'signup.jsp'\">SignUp</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");

        String error = request.getParameter("err");
        if(error != null){
    
      out.write("\n");
      out.write("    <script>alert(");
 out.println(error); 
      out.write(");</script>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</body>\n");
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
