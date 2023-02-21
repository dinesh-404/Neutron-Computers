import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

/**
 *
 * @author Dinesh
 */
@WebServlet(urlPatterns = {"/add_products"})
public class add_products extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(2048);
            ServletFileUpload uploader = new ServletFileUpload(factory);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Optical_Computers", "root", "");
                List<FileItem> item = uploader.parseRequest(request);
                String destination = "../../web/productimg";
                ServletContext context = request.getServletContext();
                String Dest = context.getRealPath(destination);
                factory.setRepository(new File(Dest));
                Iterator it = item.iterator();
                int i = 1;

                FileItem n = item.get(0);
                String Name = n.getString();

                n = item.get(1);
                String price = n.getString();

                n = item.get(2);
                String about = n.getString();

                String itemPath = Name + "/" + Name;
                while (it.hasNext()) {
                    FileItem f = (FileItem) it.next();
                    if (f.isFormField()) {
                    } else {
                        File theDir = new File(Dest + "/" + Name);
                        if (!theDir.exists()) {
                            theDir.mkdirs();
                        }
                        String FileOldName = f.getName();
                        String FileNewName = Name + i + FileOldName.substring(FileOldName.lastIndexOf("."));
                        File file = new File(Dest + "/" + Name, FileNewName);
                        out.println(i);
                        f.write(file);
                        i = i + 1;
                    }
                }
                String sql = "insert into products (name,info,price,pimage) values(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, Name);
                pst.setString(2, about);
                pst.setString(3, price);
                pst.setString(4, itemPath);
                int a = pst.executeUpdate();
                if (a > 0) {
                    response.sendRedirect("admin.jsp?err='added product'");
                } else {
                    out.println("some error came");
                }
            } catch (Exception e) {
                out.println(e);
            }
        }
    }
}
