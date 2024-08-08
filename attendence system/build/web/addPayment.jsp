<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style1.css">
    <title>Add Payment</title>
    
</head>
<body>
    <div class="container">
        <h1>Add Payment</h1>
        <form action="paymentForm.jsp" method="post">
            <div class="form-group">
                <label for="sno">Student No</label>
                <input type="text" id="sno" name="sno" required>
            </div>
            <div class="form-group">
                <label for="sname">Student Name</label>
                <input type="text" id="sname" name="sname" required>
            </div>
            <div class="form-group">
                <label for="date">Date</label>
                <input type="date" id="date" name="date" required>
            </div>
            <input type="hidden" name="gg" value="<%= request.getParameter("gg") %>">
            <div class="form-actions">
                <table><tr><td><button type="submit">Submit</button></td><td style="padding-left: 50px;"><button type="reset">Reset</button></td></tr></table>
            </div>
        </form>
    </div>
</body>
</html>
