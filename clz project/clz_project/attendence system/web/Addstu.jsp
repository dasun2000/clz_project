<%-- 
    Document   : Addstu
    Created on : Jul 29, 2024, 4:07:57 PM
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
        <%
        String grade=request.getParameter("gg");
        %>
        <table>
            <form action="addstu" method="post">
                <tr><td><label>No</label></td> <td><input type="text" name="no"></td></tr>
                <tr><td><label>First Name</label></td><td><input type="text" name="fn"></td></tr>
                <tr><td><label>Last Name</label></td><td><input type="text" name="ln"></td></tr>
                <tr><td><label>Address</label></td><td><input type="text" name="add"></td></tr>
                <tr><td><label>Phone Number</label></td><td><input type="text" name="pno"></td></tr>
                <tr><td><label>Home Number</label></td><td><input type="text" name="hno"></td></tr>
                <tr><td><input type="hidden" value="<%=grade%>" name="grade"></td></tr>
                <tr><td><button type="submit">Submit</button></td><td><button type="reset">Reset</button></td></tr>
            </form>
        </table>
    </body>
</html>
