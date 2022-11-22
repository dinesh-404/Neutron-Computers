<%-- 
    Document   : add_to_cart
    Created on : 22 Nov, 2022, 8:46:18 PM
    Author     : Dinesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="connection.jsp" %>
<%    try {
        String session_id = "1";
        String id = request.getParameter("pid");
        String status = "added to cart";
        String payment = "not received";
        String sql = "insert into cart (uid ,pid ,status ,payment ) values(?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, session_id);
        pst.setString(2, id);
        pst.setString(3, status);
        pst.setString(4, payment);
        int i = pst.executeUpdate();
        if (i > 0) {
            response.sendRedirect("../productinfo.jsp?alrt='Successfully added to cart'");
        } else {
            response.sendRedirect("../productinfo.jsp?alrt='could not add product to cart'");
        }
    } catch (Exception e) {
        out.println(e);
    }
%>