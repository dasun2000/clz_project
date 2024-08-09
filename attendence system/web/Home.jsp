<%-- 
    Document   : Home
    Created on : Jul 29, 2024, 2:57:51 PM
    Author     : MSI KATANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>Admin Panel</title>
    <link rel="stylesheet" type="text/css" href="style2.css">
    <script>
        function y()
        {
            
        }
    </script>
    </head>
    <body>
         <%
        String gg = request.getParameter("gg");
        %>
        
        <div class="admin-panel">
            <h1>Welcome to Admin Panel</h1>
            <form action="Student.jsp" method="post">
                <button type="submit">View students list</button>
                <input type="hidden" value="<%=gg%>" name="gg">
            </form>
            <form action="AttendHome.jsp" method="post">
                <button type="submit">Student Attendance</button>
                <input type="hidden" value="<%=gg%>" name="gg">
            </form>
            <form action="Addstu.jsp" method="post">
                <button type="submit">Add New Student</button>
                <input type="hidden" value="<%=gg%>" name="gg">
            </form>
            <form action="PaymentHome.jsp" method="post">
                <button type="submit">Payment</button>
                <input type="hidden" value="<%=gg%>" name="gg">
            </form>
            <form action="Updatestu.jsp" method="post">
                <button type="submit">Student List Update</button>
                <input type="hidden" value="<%=gg%>" name="gg">
            </form>
            
            <form action="Grade.jsp" method="post" >
                <button type="submit" style="background-color: #C00000;"  >Exit</button>
            </form>
        </div>
    </body>
</html>
