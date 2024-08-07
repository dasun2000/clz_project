<%-- 
    Document   : paymentForm
    Created on : Jul 31, 2024, 3:46:28 PM
    Author     : MSI KATANA
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
            String sno=request.getParameter("sno");
            String sname=request.getParameter("sname");
            String date=request.getParameter("date");
        String gr=request.getParameter("gg");
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            
            String q1="SELECT * FROM student6 WHERE No='"+sno+"' AND FirstName='"+sname+"'";
            
            ResultSet rs=st.executeQuery(q1);
            if (rs.next()){
            
             String q3 = "INSERT INTO Payment (No, FirstName, LastName, Date, Payment) VALUES ('" + rs.getString("No") + "', '" + rs.getString("FirstName") + "', '" + rs.getString("LastName") + "', '" + date + "', 'Paid')";
            st.executeUpdate(q3);
            response.sendRedirect("Grade.jsp");
            }
        %>
    </body>
</html>
