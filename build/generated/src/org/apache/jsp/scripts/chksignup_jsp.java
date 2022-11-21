package org.apache.jsp.scripts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class chksignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    Class.forName("com.mysql.jdbc.Driver");
    try {

        String mail = request.getParameter("mail");
        String pwd = request.getParameter("pwd");
        String username = request.getParameter("uname");
        String mno = request.getParameter("mno");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_Computers", "root", "");
        PreparedStatement chkusr = con.prepareStatement("select * from login where username = ? or email = ? or mobileno = ?");
        chkusr.setString(1, username);
        chkusr.setString(2, mail);
        chkusr.setString(3, mno);
        ResultSet chk = chkusr.executeQuery();
        if (chk.next()) {
            response.sendRedirect("../signup.jsp?err='same username/email/mobile no is already registered kindly change'");
        } else {
            out.println("okeee");

            PreparedStatement pst = con.prepareStatement("insert into login (username, password, email, mobileno, gender, age, address) values(?,?,?,?,?,?,?)");
            pst.setString(1, username);
            pst.setString(2, pwd);
            pst.setString(3, mail);
            pst.setString(4, mno);
            pst.setString(5, gender);
            pst.setString(6, age);
            pst.setString(7, address);
            out.println(username + pwd + mail + mno + gender + age + address);
            int a = pst.executeUpdate();
            if (a > 0) {
                out.println("insertyed");
                response.sendRedirect("../login.jsp?err='successfully created account login to continue'");
            } else {
                out.println("elese");
            }
        }
    } catch (Exception e) {
        out.println(e);
    }

      out.write('\n');
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
