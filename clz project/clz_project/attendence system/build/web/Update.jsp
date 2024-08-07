<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
    </head>
    <body>
        <%
        
        String no = request.getParameter("no");
        String update = request.getParameter("update");
        String fn = request.getParameter("fn");
        String ln = request.getParameter("ln");
        String add = request.getParameter("add");
        String em = request.getParameter("em");
        String pno = request.getParameter("pno");
        String hno = request.getParameter("hno");
        String grade = request.getParameter("gg");
        
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/attendence";
        Connection con = DriverManager.getConnection(url, "root", "");
        Statement st = con.createStatement();
        
        if (grade.equals("6")) {
            if (update.equals("update")) {
                String q1 = "UPDATE student6 SET FirstName='" + fn + "', LastName='" + ln + "', Address='" + add + "', Email='" + em + "', Phone='" + pno + "', `Home Number`='" + hno + "' WHERE No='" + no + "'";
                st.executeUpdate(q1);
                response.sendRedirect("Grade.jsp");
            } else if (update.equals("delete")) {
                String q2 = "DELETE FROM student6 WHERE No='" + no + "'";
                st.executeUpdate(q2);
                response.sendRedirect("Grade.jsp");
            }
        }
        
        %>
    </body>
</html>
