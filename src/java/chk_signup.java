/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author Dinesh
 */
@WebServlet(urlPatterns = {"/chk_signup"})
public class chk_signup extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.jdbc.Driver");
                out.println("<script>alert('ok')</script>");
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
                    response.sendRedirect("login.jsp?err='same username/email/mobile no is already registered kindly change'");
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
                        response.sendRedirect("login.jsp?err='successfully created account login to continue'");
                    } else {
                        out.println("elese");
                    }
                }
            } catch (Exception e) {
                response.getWriter().println(e);
            }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
