
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
@WebServlet(urlPatterns = {"/chk_login"})
public class chk_login extends HttpServlet {

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
        try (
                PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.jdbc.Driver");
            String mail = request.getParameter("mail");
            String pwd = request.getParameter("pwd");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_Computers", "root", "");
            PreparedStatement pst = con.prepareStatement("select * from login where email = ? and password = ?");
            pst.setString(1, mail);
            pst.setString(2, pwd);
            ResultSet a = pst.executeQuery();
            if (a.next()) {
                String acc = a.getString("access");
                if (acc == "admin") {
                    response.sendRedirect("admin.jsp");
                } else {
                    HttpSession session = request.getSession();
                    session.setAttribute("id", a.getString("id"));
                    session.setAttribute("name", a.getString("username"));
                    session.setAttribute("access", a.getString("access"));
                    response.sendRedirect("index.jsp?err='logged in'");
                }
            } else {
                out.println(mail + pwd);
                response.sendRedirect("login.jsp?err=please enter correct id and password");
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
