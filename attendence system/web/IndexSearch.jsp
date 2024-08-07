<%-- 
    Document   : IndexSearch
    Created on : Aug 2, 2024, 11:30:23 AM
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
        <form action="Isearch.jsp" method="post">
            <table>
                <tr><td>Search Index </td><td><input type="text" name="index"></td><td><button type="submit">Search</button></td></tr>
                <tr><td><input type="hidden" name="gg" value="<%=grade%>"</td></tr>
            </table>
        </form>
    </body>
</html>
