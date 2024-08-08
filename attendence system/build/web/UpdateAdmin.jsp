<%-- 
    Document   : UpdateAdmin
    Created on : Aug 8, 2024, 3:59:04 PM
    Author     : Akila Udantha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style1.css">
        <title>Update Admin</title>
    </head>
    <body>
        <div class="container">
        <form action="upAdmin" method="post" name="up">
            <h1>Update Admin</h1>
            <table>
                <tr><td><label>Current Password</label></td><td><input type="password" name="cpw"></td></tr>
                <tr><td><label>New Username</label></td><td><input type="text" name="nus"></td></tr>
                <tr><td><label>New Password</label></td><td><input type="password" name="npw"></td></tr>
                <tr><td><label>Re-Enter new Password</label></td><td><input type="password" name="rnpw"></td></tr>
            </table>
                <div class="form-actions">
                <table>
                <tr><td ><button type="submit">Submit</button></td><td style="padding-left: 50px;"><button type="reset">Reset</button></td></tr>
            </table></div>
            
        </form><form action="index.html" method="post">
            <center><button type="submit" style="background-color: #C00000;"  >Exit</button></center>
            </form></div>
    </body>
</html>
