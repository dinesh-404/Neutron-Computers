<%-- 
    Document   : chksignup
    Created on : 15 Nov, 2022, 10:00:25 AM
    Author     : Dinesh
--%>
<%@page import="java.sql.*" %>
<%
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
%>
