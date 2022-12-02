package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class productinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/scripts/connection.jsp");
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

      out.write("<!-- ");
      out.write("\n");
      out.write(" \n");
      out.write(" -->\n");
      out.write('\n');
      out.write('\n');

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_Computers", "root", "");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Ubuntu:wght@300;400;500;700&display=swap');\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&family=Staatliches&display=swap');\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Blinker:wght@100;200;300;400;600;700;800;900&display=swap');\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                /* font-family: \"Ubuntu\"; */\n");
      out.write("                font-family: 'Staatliches', cursive;\n");
      out.write("                font-family: 'Blinker', sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .center {\n");
      out.write("                height: 745px;\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: 1fr 500px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .left {\n");
      out.write("                display: grid;\n");
      out.write("                grid-template-columns: 100px 1fr;\n");
      out.write("                height: 700px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sideimg {\n");
      out.write("                width: 100px;\n");
      out.write("                height: 60px;\n");
      out.write("                margin: 17px;\n");
      out.write("                transition: all .6s;\n");
      out.write("                opacity: 1;\n");
      out.write("                border-radius: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .mainimg {\n");
      out.write("                margin: 50px;\n");
      out.write("                width: 1200px;\n");
      out.write("                height: 700px;\n");
      out.write("                transition: all 1.5s;\n");
      out.write("                opacity: 1;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .imgsmall {\n");
      out.write("                margin-top: 170px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .right {\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .name {\n");
      out.write("                font-size: 60px;\n");
      out.write("                font-family: 'Staatliches', cursive;\n");
      out.write("                /* color: rgb(0,0,0,0.9); */\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .price {\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 170px;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-family: 'Staatliches', cursive;\n");
      out.write("                font-weight: 100;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .hide {\n");
      out.write("                opacity: 0;\n");
      out.write("            }\n");
      out.write("            .addtocart{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50%;\n");
      out.write("                bottom: 30px;\n");
      out.write("                height: 50px;\n");
      out.write("                width: 150px;\n");
      out.write("                background:white;\n");
      out.write("                color: black;\n");
      out.write("                transition: all .4s;\n");
      out.write("                font-family: 'Staatliches', cursive;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                font-size: 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .addtocart:hover{\n");
      out.write("                background:black;\n");
      out.write("                color:white;\n");
      out.write("                width: 160px;\n");
      out.write("                font-size: 17px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                word-spacing: 2px;\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        ");
            String a = "3";
            String sql = "select * from products where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, a);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
        
      out.write("\n");
      out.write("        <div class=\"center\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <div class=\"imgsmall\">\n");
      out.write("                    ");

                        int i;
                        for (i = 1; i <= 5; i++) {
                    
      out.write("\n");
      out.write("                    <img src=\"productimg/");
      out.print(rs.getString("pimage") + i);
      out.write(".jpg\" onclick=\"change(");
out.println(i - 1);
      out.write(")\" class=\"sideimg\" alt=\"\">\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"imgmain\"><img class=\"mainimg\" id=\"mainimg\" src=\"productimg/");
      out.print(rs.getString("pimage"));
      out.write("0.jpg\" alt=\"\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <h1 class=\"name\">");
      out.print(rs.getString("name"));
      out.write("</h1>\n");
      out.write("                <h3>info</h3>\n");
      out.write("                <p>\n");
      out.write("                    ");
      out.print(rs.getString("info"));
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <div class=\"price\" >Price : ");
      out.print(rs.getString("price"));
      out.write("/-</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"addtocart\" onclick=\"location.href = 'scripts/add_to_cart.jsp?pid=");
      out.print(rs.getString("id"));
      out.write("'\">Add to Cart</button>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("        <script src=\"javascript/imgchange.js\"></script>\n");
      out.write("    </body>\n");
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
