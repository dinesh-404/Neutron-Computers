<%-- 
    Document   : admin
    Created on : 16 Nov, 2022, 6:22:25 PM
    Author     : Dinesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@include file="scripts/connection.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/admin.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>

    </head>
    <body>

        <div class="in">

            <br>
            <br>
            <br>
            <div class="center">
                <div class="left">
                    <center>
                        <h1>Add Products</h1>        
                    </center>
                    <form method="post" id="frm1" action="addbackend.jsp" enctype="multipart/form-data">
                        <div class="txtarea">
                            <label for="pname" class="lbl">Name</label>
                            <input type="text" id="pname" class="tb" name="pname">
                        </div>
                        <div class="txtarea">
                            <label for="price" class="lbl">price</label>
                            <input type="text" id="price" class="tb" name="price">
                        </div>
                        <div class="txtarea">
                            <label for="pinfo" class="lbl">info</label>
                            <input type="text" id="pinfo" class="tb" name="pinfo">
                        </div>
                        <div class="txtarea">
                            <label for="p" class="lbl">file</label>
                            <div class="tb">
                                <input type="file" name="fileinput"  id="finput" multiple="true" accept=".jpg"/><br/>
                            </div>
                        </div>
                        <center><input class="tb button" type="submit" value="submit"></center>
                    </form>
                </div> 
                <div class="right">
                    <img src="productimg/Nvdia RTX 4090/Nvdia RTX 40900.jpg" class="showimage" alt="">
                    <img src="productimg/Nvdia RTX 4090/Nvdia RTX 40901.jpg" class="showimage" alt="">
                    <img src="productimg/Nvdia RTX 4090/Nvdia RTX 40902.jpg" class="showimage" alt="">
                    <img src="productimg/Nvdia RTX 4090/Nvdia RTX 40903.jpg" class="showimage" alt="">
                    <img src="productimg/Nvdia RTX 4090/Nvdia RTX 40904.jpg" class="showimage" alt="">
                    <img src="productimg/Nvdia RTX 4090/Nvdia RTX 40905.jpg" class="showimage" alt="">
                </div>
            </div>
            <br>
            <br>
            <%                String sql = "select lg.username , lg.email,p.name,p.price from login lg inner join cart c on lg.id = c.uid inner join products p on c.pid = p.id";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
            %>
            <%=rs.getString(1)%>
            <%=rs.getString(2)%>
            <%=rs.getString(3)%>
            <%=rs.getString(4)%>
            <%out.println("<br>");
                }
            %>
            <table border="2" >
                <tr><td colspan="5">click on row to delete it</td><tr>
                <tr>
                    <td>id</td>
                    <td>Name</td>
                    <td>pwd</td>
                                        <td>mobileno</td>
                    <td>email</td>

                </tr>
                <%                    try {
                        String q = "select * from login";
                        Statement pstmt = con.createStatement();
                        ResultSet ps = pstmt.executeQuery(q);
                        while (ps.next()) {
                %>
                <tr class="tablerow" onclick="location.href = 'deletescript.jsp?id=<%=ps.getInt("id")%> '"> <td><%=ps.getString("id")%></td>
                    <td class="tablec"><%=ps.getString("username")%></td>
                    <td class="tablec"><%=ps.getString("password")%></td>
                                        <td class="tablec"><%=ps.getString("mobileno")%></td>
                    <td class="tablec"><%=ps.getString("email")%></td>

                </tr>
                <%
                        }
                    } catch (Exception e) {
                        out.println(e);
                    }
                %>
            </table>
        </div>
        <script>
            let fileinput = document.getElementById('finput');
            let imgtag = document.getElementsByClassName('showimage');
            fileinput.addEventListener("onchange", showimg());
            function showimg() {
            if (fileinput.files.length > 0) {
            for (let i = 0; i < fileinput.files.length; i++) {
            imgtag[i].src = URL.createObjectURL(fileinput.files[i]);
            }
            if (fileinput.files.length < 5 || fileinput.files.length < 5) {
            alert('enter 6 files');
            }
            if (fileinput.files.length == 6) {
            val = 0;
            }
            }
            };
        </script>
    </body>
</html>
