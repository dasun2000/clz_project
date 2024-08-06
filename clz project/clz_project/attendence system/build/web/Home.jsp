<%-- 
    Document   : Home
    Created on : Jul 29, 2024, 2:57:51 PM
    Author     : MSI KATANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-image: url('Image/login.jpg');
            background-size: cover;
        }

        form {
            background-image: url('Image/form.jpg');
            padding: 20px;
            border-radius: 10px;
            text-align: center;
        }

        input[type="text"],
        input[type="password"],
        button {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: none;
            border-radius: 5px;
            box-sizing: border-box;
        }

        button {
            background-color: red;
            color: white;
            cursor: pointer;
            width: 180px;
        }

        button:hover {
            background-color: #0056b3;
        }
        p {
            font-size: 12px;
            color: white;
        }
        input {
            text-align: center;
        }
        h1{
            color: black;
            font-family: Helvetica;
        }
    </style>
    </head>
    <body>
         <%
        String gg=request.getParameter("gr");
        
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
        <tr><td> <form action="stuUp.jsp">
            <button type="submit">Student List Update</button>
             <input type="hidden" value="<%=gg%>" name="gg">
        </form></td></tr>
       <tr><td> <form action="grade.jsp">
            <button type="submit">Exit</button>
     
        </form></td></tr>
        </table>
       
</html>
