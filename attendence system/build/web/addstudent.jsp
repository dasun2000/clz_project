<%-- 
    Document   : addstudent
    Created on : Jul 31, 2024, 9:46:34 AM
    Author     : MSI KATANA
--%>

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
        <%try {
            // processRequest(request, response);
            String grade=request.getParameter("grade");
            String no=request.getParameter("no");
            String fn=request.getParameter("fn");
            String ln=request.getParameter("ln");
            String Add=request.getParameter("add");
            String pno=request.getParameter("pno");
            String hno=request.getParameter("hno");
            String em=request.getParameter("em");
            
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root", "");
            Statement st=con.createStatement();
            
            if(grade.equals("6"))
            { 
            String q1="INSERT INTO student6 VALUES('"+no+"','"+fn+"','"+ln+"','"+Add+"','"+em+"','"+pno+"','"+hno+"')";
            st.executeUpdate(q1);
             response.sendRedirect("Grade.jsp");
            }
            else if(grade.equals("7"))
            {
              String q1="INSERT INTO student7 VALUES('"+no+"','"+fn+"','"+ln+"','"+Add+"','"+em+"','"+pno+"','"+hno+"')";
              st.executeUpdate(q1);
              response.sendRedirect("Grade.jsp");
            }
             else if(grade.equals("8"))
            {
              String q2="INSERT INTO student8 VALUES('"+no+"','"+fn+"','"+ln+"','"+Add+"','"+em+"','"+pno+"','"+hno+"')";
              st.executeUpdate(q2);
              response.sendRedirect("Student.jsp");
            }
             else if(grade.equals("9"))
            {
              String q3="INSERT INTO student9 VALUES('"+no+"','"+fn+"','"+ln+"','"+Add+"','"+em+"','"+pno+"','"+hno+"')";
              st.executeUpdate(q3);
              response.sendRedirect("Student.jsp");
            }
             else if(grade.equals("10"))
            {
              String q4="INSERT INTO student10 VALUES('"+no+"','"+fn+"','"+ln+"','"+Add+"','"+em+"','"+pno+"','"+hno+"')";
              st.executeUpdate(q4);
              response.sendRedirect("Student.jsp");
            }
             else if(grade.equals("11"))
            {
              String q5="INSERT INTO student11 VALUES('"+no+"','"+fn+"','"+ln+"','"+Add+"','"+em+"','"+pno+"','"+hno+"')";
              st.executeUpdate(q5);
              response.sendRedirect("Student.jsp");
            }
            else
             {
                 response.sendRedirect("Loger.html");
             }
        } catch (Exception ex) {
           out.println(ex.getMessage());
        }%>
    </body>
</html>
