<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style1.css">
    <title>Search Index</title>
    
    
</head>
<body>
<center><div class="container">
        <h1>Search Index</h1>
        <form action="Isearch.jsp" method="post">
            <table>
                <tr><input type="text" name="index" placeholder="Enter search index" style="height: 45px;"></tr>
                <input type="hidden" name="gg" value="<%= request.getParameter("gg") %>" required>
            </table>
            <div class="form-actions">
                <center> <table>
                <tr><td ><button type="submit">Submit</button></td><td style="padding-left: 50px;"><button type="reset">Reset</button></td></tr>
                    </table></center></div>
   
        </form>
            <form action="Grade.jsp" method="post" style="padding-top: 5px;">
                <center> <button type="submit" style="background-color: #C00000;"  >Exit</button></center>
            </form>
    </div></center>
</body>
</html>
