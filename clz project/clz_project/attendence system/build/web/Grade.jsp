<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Admin Panel</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        
        <table><tr><td>
                    <h1>Welcome to Admin Panel</h1></td></tr>
            
            
           
             <tr><td> <form action="Home.jsp">
            <button type="submit">Grade 6</button>
            <input type="hidden" value="6" name="gg">
        </form></td></tr>
       <tr><td> <form action="Home.jsp">
            <button type="submit">Grade 7</button>
            <input type="hidden" value="7" name="gg">
        </form></td></tr>
        <tr><td> <form action="Home.jsp">
            <button type="submit">Grade 8</button>
            <input type="hidden" value="8" name="gg">
        </form></td></tr>
        <tr><td> <form action="Home.jsp">
            <button type="submit">Grade 9</button>
            <input type="hidden" value="9" name="gg">
        </form></td></tr>
        <tr><td> <form action="Home.jsp">
            <button type="submit">Grade 10</button>
            <input type="hidden" value="10" name="gg">
        </form></td></tr>
        <tr><td> <form action="Home.jsp">
            <button type="submit">Grade 11</button>
            <input type="hidden" value="11" name="gg">
        </form></td></tr>
       <tr><td> <form action="index.html">
            <button type="submit">Exit</button>
        </form></td></tr>
        </table>
        
    </body>
</html>
