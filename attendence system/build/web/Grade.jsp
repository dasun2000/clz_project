<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Admin Panel</title>
       
        <link rel="stylesheet" type="text/css" href="style2.css">
    </head>
    <body> 
        <div class="admin-panel">
            <h1>Welcome to Admin Panel</h1>
            
            <form action="Home.jsp" method="post">
                <button type="submit">Grade 6</button>
                <input type="hidden" value="6" name="gg">
            </form>
            <form action="Home.jsp" method="post">
                <button type="submit">Grade 7</button>
                <input type="hidden" value="7" name="gg">
            </form>
            <form action="Home.jsp" method="post">
                <button type="submit">Grade 8</button>
                <input type="hidden" value="8" name="gg">
            </form>
            <form action="Home.jsp" method="post">
                <button type="submit">Grade 9</button>
                <input type="hidden" value="9" name="gg">
            </form>
            <form action="Home.jsp" method="post">
                <button type="submit">Grade 10</button>
                <input type="hidden" value="10" name="gg">
            </form>
            <form action="Home.jsp" method="post">
                <button type="submit">Grade 11</button>
                <input type="hidden" value="11" name="gg">
            </form>
            <form action="UpdateAdmin.jsp" method="post" >
                <button type="submit" style="background-color: #7D0DC3;" >Update Admin</button>
                
            </form>
            <form action="index.html" method="post">
                <button type="submit" style="background-color: #C00000;"  >Exit</button>
            </form>
        </div>
            
    </body>
</html>
