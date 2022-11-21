package org.apache.jsp.scripts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addproducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("<div class=\"center\">\n");
      out.write("    <div class=\"left\">    \n");
      out.write("        <h1>Add Products</h1>        \n");
      out.write("        <form method=\"post\" id=\"frm1\" action=\"addbackend.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("            <div class=\"txtarea\">\n");
      out.write("                <label for=\"pname\" class=\"lbl\">Name</label>\n");
      out.write("                <input type=\"text\" id=\"pname\" class=\"tb\" placeholder=\"dinesh\" name=\"pname\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"txtarea\">\n");
      out.write("                <label for=\"price\" class=\"lbl\">price</label>\n");
      out.write("                <input type=\"text\" id=\"price\" class=\"tb\" name=\"price\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"txtarea\">\n");
      out.write("                <label for=\"pinfo\" class=\"lbl\">info</label>\n");
      out.write("                <input type=\"text\" id=\"pinfo\" class=\"tb\" name=\"pinfo\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"txtarea\">\n");
      out.write("                <label for=\"p\" class=\"lbl\">file</label>\n");
      out.write("                <div class=\"tb\"></div>\n");
      out.write("                <input type=\"file\" hidden name=\"fileinput\" class=\"tb\" id=\"finput\" multiple=\"true\" accept=\".jpg\"/><br/>\n");
      out.write("            </div>\n");
      out.write("            <center><input class=\"tb button\" type=\"submit\"></center>\n");
      out.write("        </form>\n");
      out.write("    </div> \n");
      out.write("    <div class=\"right\">\n");
      out.write("\n");
      out.write("        <img class=\"showimage\" src=\"\" alt=\"ok\">\n");
      out.write("        <img class=\"showimage\" src=\"\" alt=\"ok\">\n");
      out.write("        <img class=\"showimage\" src=\"\" alt=\"ok\">\n");
      out.write("        <img class=\"showimage\" src=\"\" alt=\"ok\">\n");
      out.write("        <img class=\"showimage\" src=\"\" alt=\"ok\">\n");
      out.write("        <img class=\"showimage\" src=\"\" alt=\"ok\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    let fileinput = document.getElementById('finput');\n");
      out.write("    let imgtag = document.getElementsByClassName('showimage');\n");
      out.write("    fileinput.addEventListener(\"onchange\", showimg());\n");
      out.write("    function showimg() {\n");
      out.write("    if (fileinput.files.length > 0) {\n");
      out.write("    for (let i = 0; i < fileinput.files.length; i++) {\n");
      out.write("    imgtag[i].src = URL.createObjectURL(fileinput.files[i]);\n");
      out.write("    }\n");
      out.write("    if (fileinput.files.length < 5 || fileinput.files.length < 5) {\n");
      out.write("    alert('enter 6 files');\n");
      out.write("    }\n");
      out.write("    if (fileinput.files.length == 6) {\n");
      out.write("    val = 0;\n");
      out.write("    }\n");
      out.write("    }\n");
      out.write("    };\n");
      out.write("</script>\n");
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
