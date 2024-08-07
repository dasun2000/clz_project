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
       <script>
        function x() {
            
           if (document.AddStu.no.value === "" || document.AddStu.fn.value === "" || document.AddStu.ln.value === "" || document.AddStu.add.value === "" ||  document.AddStu.pno.value === "" || document.AddStu.hno.value === "") 
            {
                alert("Please fill all details.");
                return false;
            } 
            if(isNaN(document.AddStu.no.value))
            {
                alert("Please enter valid student number")
                return false;
            }
            
             if (isNaN(document.AddStu.pno.value) || document.AddStu.pno.value.length!==10)
            {
                alert("Please enter valid Phone Number");
                return false;
            }
             if (isNaN(document.AddStu.hno.value) || document.AddStu.hno.value.length!==10)
            {
                alert("Please enter valid Home Number");
                return false;
            }
              if (document.AddStu.no.value === "" || document.AddStu.fn.value === "" || document.AddStu.ln.value === "" || document.AddStu.add.value === "" ||  document.AddStu.pno.value === "" || document.AddStu.hno.value === "") 
            {
                alert("Please fill all details.");
                return false;
            } 
            else {
                alert("Success");
                return true;
            }
        }
    </script>
    </head>
    <body>
        <%
        String grade=request.getParameter("gg");
        %>
        <table>
           <form action="addstudent.jsp" method="post" name="AddStu" onsubmit="return x()">
                <tr><td><label>Student Number</label></td> <td><input type="text" name="no"></td></tr>
                <tr><td><label>First Name</label></td><td><input type="text" name="fn"></td></tr>
                <tr><td><label>Last Name</label></td><td><input type="text" name="ln"></td></tr>
                <tr><td><label>Address</label></td><td><input type="text" name="add"></td></tr>
                <tr><td>Email</td><td><input type="text" name="em"></td></tr>
                <tr><td><label>Phone Number</label></td><td><input type="text" name="pno"></td></tr>
                <tr><td><label>Home Number</label></td><td><input type="text" name="hno"></td></tr>
                <tr><td><input type="hidden" value="<%=grade%>" name="grade"></td></tr>
                <tr><td><button type="submit">Submit</button></td><td><button type="reset">Reset</button></td></tr>
            </form>
        </table>
    </body>
</html>
