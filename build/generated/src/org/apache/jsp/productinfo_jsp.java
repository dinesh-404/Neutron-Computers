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

      out.write("<!-- ");
      out.write("\n");
      out.write("\n");
      out.write(" -->\n");
      out.write('\n');
      out.write('\n');

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_Computers", "root", "");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .mainimg {\n");
      out.write("                margin: 50px;\n");
      out.write("                width: 820px;\n");
      out.write("                height: 520px;\n");
      out.write("                transition: all 1.5s;\n");
      out.write("                opacity: 1;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .imgsmall {\n");
      out.write("                margin-top: 70px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .right {\n");
      out.write("                padding: 5px;\n");
      out.write("                /* background: gray; */\n");
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
      out.write("                bottom: 80px;\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            String a = "3";
            String sql = "select * from products where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, a);
            ResultSet rs = pst.executeQuery();
        
      out.write("\n");
      out.write("        <div class=\"center\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <div class=\"imgsmall\">\n");
      out.write("                    <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40902.jpg\" onclick=\"change(0)\" class=\"sideimg\" alt=\"\">\n");
      out.write("                    <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40903.jpg\" onclick=\"change(1)\" class=\"sideimg\" alt=\"\">\n");
      out.write("                    <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40904.jpg\" onclick=\"change(2)\" class=\"sideimg\" alt=\"\">\n");
      out.write("                    <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40905.jpg\" onclick=\"change(3)\" class=\"sideimg\" alt=\"\">\n");
      out.write("                    <img src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40906.jpg\" onclick=\"change(4)\" class=\"sideimg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"imgmain\"><img class=\"mainimg\" id=\"mainimg\" src=\"productimg/Nvdia RTX 4090/Nvdia RTX 40901.jpg\"\n");
      out.write("                                          alt=\"\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <h1 class=\"name\">Nvdia RTX 4090</h1>\n");
      out.write("                <h3>info</h3>\n");
      out.write("                <p>\n");
      out.write("\n");
      out.write("                    The GeForce RTX 4090 is an enthusiast-class graphics card by NVIDIA, launched on September 20th, 2022. Built\n");
      out.write("                    on the 4 nm process, and based on the AD102 graphics processor, in its AD102-300-A1 variant, the card\n");
      out.write("                    supports DirectX 12 Ultimate. This ensures that all modern games will run on GeForce RTX 4090. Additionally,\n");
      out.write("                    the DirectX 12 Ultimate capability guarantees support for hardware-raytracing, variable-rate shading and\n");
      out.write("                    more, in upcoming video games. The AD102 graphics processor is a large chip with a die area of 608 mm² and\n");
      out.write("                    76,300 million transistors. \n");
      out.write("                </p>\n");
      out.write("                <div class=\"price\">Price : 200,000/-</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"addtocart\">Add to Cart</button>\n");
      out.write("        <script>\n");
      out.write("            let img = document.getElementsByClassName(\"sideimg\");\n");
      out.write("            let mainimg = document.getElementById(\"mainimg\");\n");
      out.write("            let temp = \"\";\n");
      out.write("            function change(n) {\n");
      out.write("            mainimg.classList.add(\"hide\");\n");
      out.write("            img[n].classList.add(\"hide\");\n");
      out.write("            setTimeout(() = > {\n");
      out.write("            temp = img[n].src;\n");
      out.write("            img[n].src = mainimg.src;\n");
      out.write("            mainimg.src = temp;\n");
      out.write("            mainimg.classList.remove(\"hide\");\n");
      out.write("            img[n].classList.remove(\"hide\");\n");
      out.write("            }, 1000);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
