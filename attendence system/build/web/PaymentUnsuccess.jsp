<%-- 
    Document   : PaymentUnsuccess
    Created on : Aug 7, 2024, 1:36:59 PM
    Author     : Akila Udantha
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Unsuccess</title>
         <link rel="stylesheet" type="text/css" href="style3.css">
    </head>
    <body>
        <div class="student-list">
            <h1>Unsuccessful Payments</h1>
            <%
                String gr = request.getParameter("gg");
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/attendence";
                Connection con = DriverManager.getConnection(url, "root", "");
                Statement st = con.createStatement();

                if (gr.equals("6")) {
                    String q1 = "SELECT * FROM student6 WHERE NOT EXISTS ( SELECT * FROM Payment6 WHERE No = No)";
                    ResultSet rs1 = st.executeQuery(q1);
            %>
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rs1.next()) {
                    %>
                    <tr>
                        <td><%= rs1.getString("No") %></td>
                        <td><%= rs1.getString("FirstName") %></td>
                        <td><%= rs1.getString("LastName") %></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <%
                } else if (gr.equals("7")) {
                    String q1 = "SELECT * FROM Student7 WHERE NOT EXISTS ( SELECT * FROM Payment7 WHERE No = No)";
                    ResultSet rs1 = st.executeQuery(q1);
            %>
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Date</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rs1.next()) {
                    %>
                    <tr>
                        <td><%= rs1.getString("No") %></td>
                        <td><%= rs1.getString("FirstName") %></td>
                        <td><%= rs1.getString("LastName") %></td>
                        <td><%= rs1.getString("Date") %></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <%
                } else if (gr.equals("8")) {
                    String q1 = "SELECT * FROM Student8 WHERE NOT EXISTS ( SELECT * FROM Payment8 WHERE No = No)";
                    ResultSet rs1 = st.executeQuery(q1);
            %>
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Date</th>
                        <th>Payment</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rs1.next()) {
                    %>
                    <tr>
                        <td><%= rs1.getString("No") %></td>
                        <td><%= rs1.getString("FirstName") %></td>
                        <td><%= rs1.getString("LastName") %></td>
                        <td><%= rs1.getString("Date") %></td>
                        <td><%= rs1.getString("Payment") %></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <%
                } else if (gr.equals("9")) {
                    String q1 = "SELECT * FROM Student9 WHERE NOT EXISTS ( SELECT * FROM Payment9 WHERE No = No)";
                    ResultSet rs1 = st.executeQuery(q1);
            %>
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Date</th>
                        <th>Payment</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rs1.next()) {
                    %>
                    <tr>
                        <td><%= rs1.getString("No") %></td>
                        <td><%= rs1.getString("FirstName") %></td>
                        <td><%= rs1.getString("LastName") %></td>
                        <td><%= rs1.getString("Date") %></td>
                        <td><%= rs1.getString("Payment") %></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <%
                } else if (gr.equals("10")) {
                    String q1 = "SELECT * FROM Student10 WHERE NOT EXISTS ( SELECT * FROM Payment10 WHERE No = No)";
                    ResultSet rs1 = st.executeQuery(q1);
            %>
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Date</th>
                        <th>Payment</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rs1.next()) {
                    %>
                    <tr>
                        <td><%= rs1.getString("No") %></td>
                        <td><%= rs1.getString("FirstName") %></td>
                        <td><%= rs1.getString("LastName") %></td>
                        <td><%= rs1.getString("Date") %></td>
                        <td><%= rs1.getString("Payment") %></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <%
                } else if (gr.equals("11")) {
                    String q1 = "SELECT * FROM Student11 WHERE NOT EXISTS ( SELECT * FROM Payment11 WHERE No = No)";
                    ResultSet rs1 = st.executeQuery(q1);
            %>
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Date</th>
                        <th>Payment</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (rs1.next()) {
                    %>
                    <tr>
                        <td><%= rs1.getString("No") %></td>
                        <td><%= rs1.getString("FirstName") %></td>
                        <td><%= rs1.getString("LastName") %></td>
                        <td><%= rs1.getString("Date") %></td>
                        <td><%= rs1.getString("Payment") %></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <%
                } else {
                    response.sendRedirect("Loger.html");
                }
            %>
            <form action="Grade.jsp" method="post" style="padding-top: 50px;">
                <center> <button type="submit" style="background-color: #C00000;"  >Exit</button></center>
            </form>
        </div>
    </body>
</html>
