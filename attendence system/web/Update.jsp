<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% 
            String grade = request.getParameter("gg");
            String no = request.getParameter("no");
            String update = request.getParameter("update");
            String first = request.getParameter("fn");
            String Last = request.getParameter("ln");
            String Address = request.getParameter("add");
            String Phone = request.getParameter("pno");
            String Hphone = request.getParameter("hno");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/attendence";
                Connection con = DriverManager.getConnection(url, "root", "");

                if ("6".equals(grade)) {
                    if ("update".equals(update)) {
                        String q1 = "UPDATE student6 SET FirstName=?, LastName=?, Address=?, Phone=?, Home Phone=? WHERE No=?";
                        PreparedStatement pstmt = con.prepareStatement(q1);
                        pstmt.setString(1, first);
                        pstmt.setString(2, Last);
                        pstmt.setString(3, Address);
                        pstmt.setString(4, Phone);
                        pstmt.setString(5, Hphone);
                        pstmt.setString(6, no);
                        pstmt.executeUpdate();
                        response.sendRedirect("Grade.jsp");
                    } else if ("delete".equals(update)) {
                        String q2 = "DELETE FROM student6 WHERE No=?";
                        PreparedStatement pstmt = con.prepareStatement(q2);
                        pstmt.setString(1, no);
                        pstmt.executeUpdate();
                        response.sendRedirect("Grade.jsp");
                    }
                } else {
                    response.sendRedirect("Home.jsp");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </body>
</html>
