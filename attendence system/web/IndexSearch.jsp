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
    <div class="container">
        <h1>Search Index</h1>
        <form action="Isearch.jsp" method="post">
            <table>
                <tr><input type="text" name="index" placeholder="Enter search index"></tr>
                <input type="hidden" name="gg" value="<%= request.getParameter("gg") %>">
            </table>
            <div class="form-actions">
                <table>
                <tr><td ><button type="submit">Submit</button></td><td style="padding-left: 50px;"><button type="reset">Reset</button></td></tr>
            </table></div>
            
            
            
        </form>
    </div>
</body>
</html>
