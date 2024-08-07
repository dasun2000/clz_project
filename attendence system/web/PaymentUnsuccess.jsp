<%-- 
    Document   : PaymentUnsuccess
    Created on : Aug 7, 2024, 1:36:59 PM
    Author     : Akila Udantha
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
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
            
            String gr=request.getParameter("gg");
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
           
           if (gr.equals("6"))
           {
        
            String q1="SELECT * FROM student6 WHERE NOT EXISTS ( SELECT * FROM Payment6 WHERE No = No)";
            
           
        %>
  
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td></thead>
                <%ResultSet rs1=st.executeQuery(q1);
                    while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td></tr>
            <%}%></table>

        <%}
            
            
                else if (gr.equals("7"))
           {
           
            String q1="SELECT * FROM Students WHERE NOT EXISTS ( SELECT * FROM Payment7 WHERE No = No)";
            
           
        %>
  
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td></thead>
                <%ResultSet rs1=st.executeQuery(q1);
                    while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td></tr>
            <%}%></table>

        <%}
            
                else if (gr.equals("8"))
           {
           
            String q1="SELECT * FROM Students WHERE NOT EXISTS ( SELECT * FROM Payment8 WHERE No = No)";
            
           
        %>
  
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%ResultSet rs1=st.executeQuery(q1);
                    while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td></tr>
            <%}%></table>

        <%}
            
            
                else if (gr.equals("9"))
           {
           
            String q1="SELECT * FROM Students WHERE NOT EXISTS ( SELECT * FROM Payment9 WHERE No = No)";
            
           
        %>
  
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%ResultSet rs1=st.executeQuery(q1);
                    while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td></tr>
            <%}%></table>

        <%}
            
            
                else if(gr.equals("10"))
                   
           {
           
            String q1="SELECT * FROM Students WHERE NOT EXISTS ( SELECT * FROM Payment10 WHERE No = No)";
            
           
        %>
  
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%ResultSet rs1=st.executeQuery(q1);
                    while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td></tr>
            <%}%></table>

        <%}
            
            
                else if(gr.equals("11"))
           {
           
            String q1="SELECT * FROM Students WHERE NOT EXISTS ( SELECT * FROM Payment11 WHERE No = No)";
            
           
        %>
  
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%ResultSet rs1=st.executeQuery(q1);
                    while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td></tr>
            <%}%></table>

        <%}
            
            
            else{
                   response.sendRedirect("Loger.html");
                  
                    }
            %>
    </body>
</html>
