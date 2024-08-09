<%-- 
    Document   : AttendDetails
    Created on : Aug 9, 2024, 12:51:06 PM
    Author     : Akila Udantha
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details</title>
    </head>
    <body>
        <% 
            String grade=request.getParameter("grade");
            String index=request.getParameter("index");
            
            LocalDate currentDate = LocalDate.now();
            
                Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/Attendence";
                Connection con=DriverManager.getConnection(url, "root", "");
                Statement st=con.createStatement();
                Statement st1=con.createStatement();
            
                if(grade.equals("6"))
            {
                String q1="SELECT * FROM student6";
                String q2="SELECT * FROM Tmpattend6";
                
                ResultSet rs1=st1.executeQuery(q2);
                while (rs1.next())
                {
                    if(index.equals(rs1.getString("No")))
                    {
                        response.sendRedirect("ALattend.html");
                    }
                }
                
                ResultSet rs=st.executeQuery(q1);
                
            %>
            
            <form action="Attend" method="post">
                <h1>Student Details</h1>
            <table>
            
            <%
                while (rs.next())
                {
                    if (index.equals(rs.getString("No")))
                    {%>
                      
                    <tr><td>Student Index No :</td><td><%=rs.getString("No")%></td></tr>
                    <tr><td>Name :</td><td><%=rs.getString("FirstName")%> <%=rs.getString("LastName")%></td></tr>
                    <tr><td><input type="hidden" name="gg" value="<%=grade%>"></td><td><input type="hidden" name="index" value="<%=index%>"><input type="hidden" name="date" value="<%=currentDate%>"></td></td></tr>
                    <tr><td>Grade :</td><td>Grade <%=grade%></td></tr>
                    <tr><td>Date & Time :</td><td><%=currentDate%></td></tr>
                    <tr><center><button type="submit">Submit</button></center></tr>
                    
                    
                    <%}

                    else{
                            response.sendRedirect("LoginError.html");
                        }
                    
                }%>
                </table>
                </form>
            <%}

        else if(grade.equals("7"))
            {
                String q1="SELECT * FROM student7";
                String q2="SELECT * FROM Tmpattend7";
                
                ResultSet rs1=st1.executeQuery(q2);
                while (rs1.next())
                {
                    if(index.equals(rs1.getString("No")))
                    {
                        response.sendRedirect("ALattend.html");
                    }
                }
                ResultSet rs=st.executeQuery(q1);
            %>
            
            <form action="Attend" method="post">
                <h1>Student Details</h1>
            <table>
            
            <%
                while (rs.next())
                {
                    if (index.equals(rs.getString("No")))
                    {%>
                      
                    <tr><td>Student Index No :</td><td><%=rs.getString("No")%></td></tr>
                    <tr><td>Name :</td><td><%=rs.getString("FirstName")%> <%=rs.getString("LastName")%></td></tr>
                    <tr><td><input type="hidden" name="gg" value="<%=grade%>"></td><td><input type="hidden" name="index" value="<%=index%>"><input type="hidden" name="date" value="<%=currentDate%>"></td></td></tr>
                    <tr><td>Grade :</td><td>Grade <%=grade%></td></tr>
                    <tr><td>Date & Time :</td><td><%=currentDate%></td></tr>
                    <tr><center><button type="submit">Submit</button></center></tr>
                    
                    
                    <%}else{
                            response.sendRedirect("LoginError.html");
                        }
                    
                }%>
                </table>
                </form>
            <%}
            else if(grade.equals("8"))
            {
                String q1="SELECT * FROM student8";
                String q2="SELECT * FROM Tmpattend8";
                
                ResultSet rs1=st1.executeQuery(q2);
                while (rs1.next())
                {
                    if(index.equals(rs1.getString("No")))
                    {
                        response.sendRedirect("ALattend.html");
                    }
                }
                ResultSet rs=st.executeQuery(q1);
            %>
            
            <form action="Attend" method="post">
                <h1>Student Details</h1>
            <table>
            
            <%
                while (rs.next())
                {
                    if (index.equals(rs.getString("No")))
                    {%>
                      
                    <tr><td>Student Index No :</td><td><%=rs.getString("No")%></td></tr>
                    <tr><td>Name :</td><td><%=rs.getString("FirstName")%> <%=rs.getString("LastName")%></td></tr>
                    <tr><td><input type="hidden" name="gg" value="<%=grade%>"></td><td><input type="hidden" name="index" value="<%=index%>"><input type="hidden" name="date" value="<%=currentDate%>"></td></td></tr>
                    <tr><td>Grade :</td><td>Grade <%=grade%></td></tr>
                    <tr><td>Date & Time :</td><td><%=currentDate%></td></tr>
                    <tr><center><button type="submit">Submit</button></center></tr>
                    
                    
                    <%}else{
                            response.sendRedirect("LoginError.html");
                        }
                    
                }%>
                </table>
                </form>
            <%}
            else if(grade.equals("9"))
            {
                String q1="SELECT * FROM student9";
                String q2="SELECT * FROM Tmpattend9";
                
                ResultSet rs1=st1.executeQuery(q2);
                while (rs1.next())
                {
                    if(index.equals(rs1.getString("No")))
                    {
                        response.sendRedirect("ALattend.html");
                    }
                }
                ResultSet rs=st.executeQuery(q1);
            %>
            
            <form action="Attend" method="post">
                <h1>Student Details</h1>
            <table>
            
            <%
                while (rs.next())
                {
                    if (index.equals(rs.getString("No")))
                    {%>
                      
                    <tr><td>Student Index No :</td><td><%=rs.getString("No")%></td></tr>
                    <tr><td>Name :</td><td><%=rs.getString("FirstName")%> <%=rs.getString("LastName")%></td></tr>
                    <tr><td><input type="hidden" name="gg" value="<%=grade%>"></td><td><input type="hidden" name="index" value="<%=index%>"><input type="hidden" name="date" value="<%=currentDate%>"></td></td></tr>
                    <tr><td>Grade :</td><td>Grade <%=grade%></td></tr>
                    <tr><td>Date & Time :</td><td><%=currentDate%></td></tr>
                    <tr><center><button type="submit">Submit</button></center></tr>
                    
                    
                    <%}else{
                            response.sendRedirect("LoginError.html");
                        }
                    
                }%>
                </table>
                </form>
            <%}
            else if(grade.equals("10"))
            {
                String q1="SELECT * FROM student10";
                String q2="SELECT * FROM Tmpattend10";
                
                ResultSet rs1=st1.executeQuery(q2);
                while (rs1.next())
                {
                    if(index.equals(rs1.getString("No")))
                    {
                        response.sendRedirect("ALattend.html");
                    }
                }
                ResultSet rs=st.executeQuery(q1);
            %>
            
            <form action="Attend" method="post">
                <h1>Student Details</h1>
            <table>
            
            <%
                while (rs.next())
                {
                    if (index.equals(rs.getString("No")))
                    {%>
                      
                    <tr><td>Student Index No :</td><td><%=rs.getString("No")%></td></tr>
                    <tr><td>Name :</td><td><%=rs.getString("FirstName")%> <%=rs.getString("LastName")%></td></tr>
                    <tr><td><input type="hidden" name="gg" value="<%=grade%>"></td><td><input type="hidden" name="index" value="<%=index%>"><input type="hidden" name="date" value="<%=currentDate%>"></td></td></tr>
                    <tr><td>Grade :</td><td>Grade <%=grade%></td></tr>
                    <tr><td>Date & Time :</td><td><%=currentDate%></td></tr>
                    <tr><center><button type="submit">Submit</button></center></tr>
                    
                    
                    <%}else{
                            response.sendRedirect("LoginError.html");
                        }
                    
                }%>
                </table>
                </form>
            <%}
            else if(grade.equals("11"))
            {
                String q1="SELECT * FROM student11";
                String q2="SELECT * FROM Tmpattend11";
                
                ResultSet rs1=st1.executeQuery(q2);
                while (rs1.next())
                {
                    if(index.equals(rs1.getString("No")))
                    {
                        response.sendRedirect("ALattend.html");
                    }
                }
                ResultSet rs=st.executeQuery(q1);
            %>
            
            <form action="Attend" method="post">
                <h1>Student Details</h1>
            <table>
            
            <%
                while (rs.next())
                {
                    if (index.equals(rs.getString("No")))
                    {%>
                      
                    <tr><td>Student Index No :</td><td><%=rs.getString("No")%></td></tr>
                    <tr><td>Name :</td><td><%=rs.getString("FirstName")%> <%=rs.getString("LastName")%></td></tr>
                    <tr><td><input type="hidden" name="gg" value="<%=grade%>"></td><td><input type="hidden" name="index" value="<%=index%>"><input type="hidden" name="date" value="<%=currentDate%>"></td></td></tr>
                    <tr><td>Grade :</td><td>Grade <%=grade%></td></tr>
                    <tr><td>Date & Time :</td><td><%=currentDate%></td></tr>
                    <tr><center><button type="submit">Submit</button></center></tr>
                    
                    
                    <%}else{
                            response.sendRedirect("LoginError.html");
                        }
                    
                }%>
                </table>
                </form>
            <%}


            
            else
              {
                 response.sendRedirect("LoginError.html");
              }
            %>
        
            
    </body>
</html>
