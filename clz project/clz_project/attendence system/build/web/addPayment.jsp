<%-- 
    Document   : addPayment
    Created on : Jul 31, 2024, 3:23:35 PM
    Author     : MSI KATANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String gg=request.getParameter("gg");%>
        <table>
            <form action="paymentForm.jsp" method="post">
                <tr><td>Student No</td><td><input type="text" name="sno"></td></tr>
                 <tr><td>Student Name</td><td><input type="text" name="sname"></td></tr>
                 <tr><td>Date</td><td><input type="date" name="date"></td></tr>
                  
                  <input type="hidden" value="<%=gg%>" name="gg">
                  <tr><td><button type="submit">Submit</button></td><td><button type="reset">Reset</button></td></tr>
            </form>
        </table>
    </body>
</html>
