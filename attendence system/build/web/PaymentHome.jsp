<%-- 
    Document   : PaymentHome
    Created on : Jul 31, 2024, 12:20:41 PM
    Author     : MSI KATANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function y() {
    
    return confirm("Are you sure?");
}
        </script>
        
    </head>
    <body>
        <%
        String gg=request.getParameter("gg");
        
        %>
        
        <table><tr><td>
                    <h1>Welcome to Admin Panel</h1></td></tr>
            
            
            <tr><td><form action="addPayment.jsp" method="post">
            <button type="submit">Add Payment</button>
               <input type="hidden" value="<%=gg%>" name="gg">
                    </form></td></tr>
            <tr><td><form action="PaymentSuccess.jsp" method="post">
 
            <button type="submit">Payment Success List</button>
               <input type="hidden" value="<%=gg%>" name="gg">
                    </form></td></tr>
            <tr><td><form action="PaymentUnsuccess.jsp" method="post">
            <button type="submit">Payment unSuccess List</button>
               <input type="hidden" value="<%=gg%>" name="gg">
                    </form></td></tr>
            <tr><td><form action="IndexSearch.jsp" method="post">
            <button type="submit">Search Index</button>
               <input type="hidden" value="<%=gg%>" name="gg">
                    </form></td></tr>
            <tr><td><form action="ClearPay" method="post" name="clear" onsubmit="return y()">
                        <button type="submit" >Clear All Payment</button>
            <input type="hidden"  value="<%=gg%>" name="gg">
                    </form></td></tr>
            <tr><td><form action="Grade.jsp" method="post">
            <button type="submit">Exit</button>
               <input type="hidden" value="<%=gg%>" name="gg">
                    </form></td></tr>
        
    </body>
</html>
