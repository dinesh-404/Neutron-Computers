<%-- 
    Document   : connection
    Created on : 16 Nov, 2022, 6:26:34 PM
    Author     : Dinesh
--%>
<%@page import="java.sql.*" %>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_Computers", "root", "");
%>