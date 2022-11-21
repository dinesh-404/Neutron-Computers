<%-- 
    Document   : addbackend
    Created on : 19 Nov, 2022, 3:54:43 PM
    Author     : Dinesh
--%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "org.apache.commons.fileupload.*" %>
<%@include file="connection.jsp" %>
<%    DiskFileItemFactory factory = new DiskFileItemFactory();
    factory.setSizeThreshold(2048);
    ServletFileUpload uploader = new ServletFileUpload(factory);
    try {
        List<FileItem> item = uploader.parseRequest(request);
        String destination = "../../web/productimg";
        String Dest = application.getRealPath(destination);
        factory.setRepository(new File(Dest));
        Iterator it = item.iterator();
        out.println(Dest);
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
                out.println(Name + "ok");
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
            out.println("updated successfully");
        } else {
            out.println("some error came");
        }
    } catch (Exception e) {
        out.println(e);
    }
%>