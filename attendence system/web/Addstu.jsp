<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style1.css">
    <title>Add Student</title>
    
    <script>
        function validateForm() {
            const form = document.forms["AddStu"];
            const fields = ["no", "fn", "ln", "add", "pno", "hno"];
            const phoneFields = ["pno", "hno"];
            
            for (const field of fields) {
                if (form[field].value.trim() === "") {
                    alert("Please fill all details.");
                    return false;
                }
            }
            
            if (isNaN(form["no"].value)) {
                alert("Please enter a valid student number.");
                return false;
            }

            for (const phoneField of phoneFields) {
                if (isNaN(form[phoneField].value) || form[phoneField].value.length !== 10) {
                    alert(`Please enter a valid Phone Number`);
                    return false;
                }
            }

            alert("Success");
            return true;
        }
    </script>
</head>
<body>
    <div class="container">
        
        <form name="AddStu" action="addstudent.jsp" method="post" onsubmit="return validateForm()" >
            <h1>Student Registration Form</h1>
            <div class="form-group">
                <label for="no">Student Number</label>
                <input type="text" id="no" name="no">
            </div>
            <div class="form-group">
                <label for="fn">First Name</label>
                <input type="text" id="fn" name="fn">
            </div>
            <div class="form-group">
                <label for="ln">Last Name</label>
                <input type="text" id="ln" name="ln">
            </div>
            <div class="form-group">
                <label for="add">Address</label>
                <input type="text" id="add" name="add">
            </div>
            <div class="form-group">
                <label for="em">Email</label>
                <input type="text" id="em" name="em">
            </div>
            <div class="form-group">
                <label for="pno">Phone Number</label>
                <input type="text" id="pno" name="pno">
            </div>
            <div class="form-group">
                <label for="hno">Home Number</label>
                <input type="text" id="hno" name="hno">
            </div>
            <input type="hidden" name="grade" value="<%= request.getParameter("gg") %>">
            <div class="form-actions">
                <table><tr><td><button type="submit">Submit</button></td><td style="padding-left: 50px;"><button type="reset">Reset</button></td></tr></table>
            </div>
        </form>
            <form action="Grade.jsp" method="post" style="padding-top: 5px;">
                <center> <button type="submit" style="background-color: #C00000;"  >Exit</button></center>
            </form>
    </div>
</body>
</html>
