<%-- 
    Document   : Home
    Created on : Jul 29, 2024, 2:57:51 PM
    Author     : MSI KATANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    
    </head>
    <body>
         <%
        String gg=request.getParameter("gg");
        
        %>
        
        <table><tr><td>
                    <h1>Welcome to Admin Panel</h1></td></tr>
            
            
            <tr><td><form action="Student.jsp" method="post">
            
            
            <button type="submit">View students list</button>
               <input type="hidden" value="<%=gg%>" name="gg">
                    </form></td></tr>
             <tr><td> <form action="SAttend.jsp">
            <button type="submit">Student Attendance</button>
            <input type="hidden" value="<%=gg%>" name="gg">
            
        </form></td></tr>
       <tr><td> <form action="Addstu.jsp">
            <button type="submit">Add New Student</button>
             <input type="hidden" value="<%=gg%>" name="gg">
        </form></td></tr>
       <tr><td> <form action="PaymentHome.jsp">
            <button type="submit">Payment</button>
             <input type="hidden" value="<%=gg%>" name="gg">
        </form></td></tr>
        <tr><td> <form action="Updatestu.jsp">
            <button type="submit">Student List Update</button>
             <input type="hidden" value="<%=gg%>" name="gg">
        </form></td></tr>
       <tr><td> <form action="Grade.jsp">
            <button type="submit">Exit</button>
     
        </form></td></tr>
        </table>
       
</html>
