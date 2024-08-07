<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Student</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f4f4f4;
        }

        .container {
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            width: 100%;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"] {
            width: calc(100% - 22px);
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        button {
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            margin: 5px 0;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #0056b3;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-actions {
            text-align: center;
        }

        .form-actions button[type="reset"] {
            background-color: #6c757d;
        }

        .form-actions button[type="reset"]:hover {
            background-color: #5a6268;
        }
    </style>
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
        <h1>Add Student</h1>
        <form name="AddStu" action="addstudent.jsp" method="post" onsubmit="return validateForm()">
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
                <button type="submit">Submit</button>
                <button type="reset">Reset</button>
            </div>
        </form>
    </div>
</body>
</html>
