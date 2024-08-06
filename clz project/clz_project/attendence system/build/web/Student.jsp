<%-- 
    Document   : Student
    Created on : Jul 29, 2024, 12:14:14 PM
    Author     : MSI KATANA
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student List</title>
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
        
            String q1="SELECT * FROM student6";
            ResultSet rs1=st.executeQuery(q1);
           
        %>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Address</td><td>Contact Number</td><td>Home Number</td></thead>
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Address")%></td><td><%=rs1.getString("Phone")%></td><td><%=rs1.getString("Home Number")%></td></tr>
            <%}%></table>
            <%}
            
            
                else if (gr.equals("7"))
           {
           
            String q2="SELECT * FROM student7";
            ResultSet rs1=st.executeQuery(q2);%>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
            
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Address")%></td><td><%=rs1.getString("Phone")%></td><td><%=rs1.getString("Home Number")%></td></tr>
            <%}%></table>
            <%}
            
                else if (gr.equals("8"))
           {
           
            String q3="SELECT * FROM student8";
            ResultSet rs1=st.executeQuery(q3);%>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
            
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Address")%></td><td><%=rs1.getString("Phone")%></td><td><%=rs1.getString("Home Number")%></td></tr>
            <%}%></table>
            <%}
            
            
            else if(gr.equals("8"))
           {
           
            String q4="SELECT * FROM student8";
            ResultSet rs1=st.executeQuery(q4);%>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
            
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Address")%></td><td><%=rs1.getString("Phone")%></td><td><%=rs1.getString("Home Number")%></td></tr>
            <%}%></table>
            <%}
            
            
                else if (gr.equals("9"))
           {
           
            String q5="SELECT * FROM student9";
            ResultSet rs1=st.executeQuery(q5);%>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
            
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Address")%></td><td><%=rs1.getString("Phone")%></td><td><%=rs1.getString("Home Number")%></td></tr>
            <%}%></table>
            <%}
            
            
                else if(gr.equals("10"))
                   
           {
           
            String q6="SELECT * FROM student10";
            ResultSet rs1=st.executeQuery(q6);%>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
            
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Address")%></td><td><%=rs1.getString("Phone")%></td><td><%=rs1.getString("Home Number")%></td></tr>
            <%}%></table>
            <%}
            
            
                else if(gr.equals("11"))
           {
           
            String q7="SELECT * FROM student11";
            ResultSet rs1=st.executeQuery(q7);%>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
            
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Address")%></td><td><%=rs1.getString("Phone")%></td><td><%=rs1.getString("Home Number")%></td></tr>
            <%}%></table>
            <%}
            
            
            else{
                   response.sendRedirect("Loger.html");
                  
                    }
            %>
            
    </body>
</html>
