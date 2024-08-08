<%-- 
    Document   : PaymentSuccess
    Created on : Aug 1, 2024, 12:21:02 PM
    Author     : MSI KATANA
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Success</title>
        <link rel="stylesheet" type="text/css" href="style3.css">
       
    </head>
    <body>
        <div class="student-list">
            <h1>Payment List</h1>
            <%
                String index = request.getParameter("index");
                String gr = request.getParameter("gg");
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/attendence";
                Connection con = DriverManager.getConnection(url, "root", "");
                Statement st = con.createStatement();

                if (gr.equals("6")) {
                    String q1 = "SELECT * FROM Payment6";
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
                } else if (gr.equals("7")) {
                    String q2 = "SELECT * FROM student7";
                    ResultSet rs1 = st.executeQuery(q2);
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
                } else if (gr.equals("8")) {
                    String q3 = "SELECT * FROM student8";
                    ResultSet rs1 = st.executeQuery(q3);
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
                    String q5 = "SELECT * FROM student9";
                    ResultSet rs1 = st.executeQuery(q5);
            %>
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Address</th>
                        <th>Email</th>
                        <th>Contact Number</th>
                        <th>Home Number</th>
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
                        <td><%= rs1.getString("Address") %></td>
                        <td><%= rs1.getString("Email") %></td>
                        <td><%= rs1.getString("Phone") %></td>
                        <td><%= rs1.getString("Home Number") %></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <%
                } else if (gr.equals("10")) {
                    String q6 = "SELECT * FROM student10";
                    ResultSet rs1 = st.executeQuery(q6);
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
                    String q7 = "SELECT * FROM student11";
                    ResultSet rs1 = st.executeQuery(q7);
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
