<%-- 
    Document   : AttendHome
    Created on : Aug 9, 2024, 12:12:06 PM
    Author     : Akila Udantha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style2.css">
        <title>Attendance Home</title>
        <script>
            function y() {
    
    return confirm("Are you sure to Generate Now ?");
}
        </script>
    </head>
    
    <body>
         <%
        String gg = request.getParameter("gg");
        %>
        
        <div class="admin-panel">
            
            
            <form action="ViewAttendance.jsp" method="post">
                <button type="submit">View Attendance History</button>
                <input type="hidden" value="<%=gg%>" name="gg">
            </form>
            
            <form action="AGenerate" method="post" onsubmit="return y()">
                <button type="submit" >Today Attendance Generate</button>
                <input type="hidden" value="<%=gg%>" name="gg">
            </form>
            
            <form action="Grade.jsp" method="post" >
                <button type="submit" style="background-color: #C00000;"  >Exit</button>
            </form>
        </div>
    </body>
</html>
