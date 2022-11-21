<%@page import="java.sql.*" %>
<%
   Class.forName("com.mysql.jdbc.Driver");
   String mail = request.getParameter("mail");
   String pwd = request.getParameter("pwd");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_Computers", "root","");
   PreparedStatement pst = con.prepareStatement("select * from login where email = ? and password = ?");
   pst.setString(1,mail);
   pst.setString(2, pwd);
   ResultSet a = pst.executeQuery();
   if(a.next()){
       session.setAttribute("id", a.getString("id"));
       session.setAttribute("name", a.getString("username"));
       response.sendRedirect("../index.jsp");
   }
   else{
       out.println(mail+pwd);
      response.sendRedirect("../login.jsp?err='please+input+valid+email+or+password'");
   }
   
%>