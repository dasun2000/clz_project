<%-- 
    Document   : Isearch
    Created on : Aug 1, 2024, 1:43:10 PM
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
        <link rel="stylesheet" type="text/css" href="style2.css">
        <title>JSP Page</title>
    </head>
    <body>
          <%
            String index=request.getParameter("index");
            String gr=request.getParameter("gg");
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
           
           if (gr.equals("6"))
           {
        
            String q1="SELECT * FROM payment6 WHERE No='"+index+"'";
            ResultSet rs1=st.executeQuery(q1);
           
        %>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Date")%></td><td><%=rs1.getString("Payment")%></td></tr>
            <%}%></table>
            <%}
            
            
               else if (gr.equals("7"))
           {
        
            String q1="SELECT * FROM payment7 WHERE No='"+index+"'";
            ResultSet rs1=st.executeQuery(q1);
           
        %>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Date")%></td><td><%=rs1.getString("Payment")%></td></tr>
            <%}%></table>
            <%}
            
                else if (gr.equals("8"))
           {
           
           String q1="SELECT * FROM payment8 WHERE No='"+index+"'";
            ResultSet rs1=st.executeQuery(q1);
           
        %>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Date")%></td><td><%=rs1.getString("Payment")%></td></tr>
            <%}%></table>
            <%}
            
            
                else if (gr.equals("9"))
           {
           
            String q1="SELECT * FROM payment9 WHERE No='"+index+"'";
            ResultSet rs1=st.executeQuery(q1);
           
        %>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Date")%></td><td><%=rs1.getString("Payment")%></td></tr>
            <%}%></table>
            <%}
            
            
                else if(gr.equals("10"))
                   
           {
           
            String q1="SELECT * FROM payment10 WHERE No='"+index+"'";
            ResultSet rs1=st.executeQuery(q1);
           
        %>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Date")%></td><td><%=rs1.getString("Payment")%></td></tr>
            <%}%></table>
            <%}
            
            
                else if(gr.equals("11"))
           {
           
            String q1="SELECT * FROM payment11 WHERE No='"+index+"'";
            ResultSet rs1=st.executeQuery(q1);
           
        %>
            
            <table border="1" style="width: 100%; height: 100%; border-collapse: collapse;"  >
                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Date</td><td>Payment</td></thead>
                <%while (rs1.next())
            {%>
            <tr><td><center><%=rs1.getString("No")%></center></td><td><%=rs1.getString("FirstName")%></td><td><center><%=rs1.getString("LastName")%></center></td><td><%=rs1.getString("Date")%></td><td><%=rs1.getString("Payment")%></td></tr>
            <%}%></table>
            <%}
            
            
            else{
                   response.sendRedirect("Loger.html");
                  
                    }
            %>
    </body>
</html>
