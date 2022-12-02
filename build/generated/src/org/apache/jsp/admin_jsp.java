package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/scripts/connection.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_Computers", "root", "");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/admin.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"outline\"></div>\n");
      out.write("        <div class=\"in\">\n");
      out.write("            <table border=\"2\">\n");
      out.write("                <tr><td colspan=\"3\">click on row to delete it</td><tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>id</td>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>pwd</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
                    try {
                        String q = "select * from login";
                        Statement pstmt = con.createStatement();
                        ResultSet rs = pstmt.executeQuery(q);
                        while (rs.next()) {
                
      out.write("\n");
      out.write("                <tr class=\"tablerow\" onclick=\"location.href = 'deletescript.jsp?id=");
      out.print(rs.getInt("id"));
      out.write(" '\"> <td>");
      out.print(rs.getString("id"));
      out.write("</td>\n");
      out.write("                    <td class=\"tablec\">");
      out.print(rs.getString("username"));
      out.write("</td>\n");
      out.write("                    <td class=\"tablec\">");
      out.print(rs.getString("password"));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                        }
                    } catch (Exception e) {
                        out.println(e);
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <center>\n");
      out.write("                        <h1>Add Products</h1>        \n");
      out.write("                    </center>\n");
      out.write("                    <form method=\"post\" id=\"frm1\" action=\"addbackend.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("                        <div class=\"txtarea\">\n");
      out.write("                            <label for=\"pname\" class=\"lbl\">Name</label>\n");
      out.write("                            <input type=\"text\" id=\"pname\" class=\"tb\" placeholder=\"dinesh\" name=\"pname\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"txtarea\">\n");
      out.write("                            <label for=\"price\" class=\"lbl\">price</label>\n");
      out.write("                            <input type=\"text\" id=\"price\" class=\"tb\" name=\"price\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"txtarea\">\n");
      out.write("                            <label for=\"pinfo\" class=\"lbl\">info</label>\n");
      out.write("                            <input type=\"text\" id=\"pinfo\" class=\"tb\" name=\"pinfo\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"txtarea\">\n");
      out.write("                            <label for=\"p\" class=\"lbl\">file</label>\n");
      out.write("                            <div class=\"tb\">\n");
      out.write("                                <input type=\"file\" name=\"fileinput\" class=\"tb\" id=\"finput\" multiple=\"true\" accept=\".jpg\"/><br/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <center><input class=\"tb button\" type=\"submit\"></center>\n");
      out.write("                    </form>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <div class=\"c\">\n");
      out.write("\n");
      out.write("                        <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40900.jpg\" class=\"showimage\" alt=\"\">\n");
      out.write("                        <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40901.jpg\" class=\"showimage\" alt=\"\">\n");
      out.write("                        <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40902.jpg\" class=\"showimage\" alt=\"\">\n");
      out.write("                        <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40903.jpg\" class=\"showimage\" alt=\"\">\n");
      out.write("                        <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40904.jpg\" class=\"showimage\" alt=\"\">\n");
      out.write("                        <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40905.jpg\" class=\"showimage\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            ");

                String sql = "select lg.username , lg.email,p.name,p.price from login lg inner join cart c on lg.id = c.uid inner join products p on c.pid = p.id";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
            
      out.write("\n");
      out.write("            ");
      out.print(rs.getString(1));
      out.write("\n");
      out.write("            ");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("            ");
      out.print(rs.getString(3));
      out.write("\n");
      out.write("            ");
      out.print(rs.getString(4));
      out.write("\n");
      out.write("            ");
out.println("<br>");
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            let fileinput = document.getElementById('finput');\n");
      out.write("            let imgtag = document.getElementsByClassName('showimage');\n");
      out.write("            fileinput.addEventListener(\"onchange\", showimg());\n");
      out.write("            function showimg() {\n");
      out.write("            if (fileinput.files.length > 0) {\n");
      out.write("            for (let i = 0; i < fileinput.files.length; i++) {\n");
      out.write("            imgtag[i].src = URL.createObjectURL(fileinput.files[i]);\n");
      out.write("            }\n");
      out.write("            if (fileinput.files.length < 5 || fileinput.files.length < 5) {\n");
      out.write("            alert('enter 6 files');\n");
      out.write("            }\n");
      out.write("            if (fileinput.files.length == 6) {\n");
      out.write("            val = 0;\n");
      out.write("            }\n");
      out.write("            }\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("\n");
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
