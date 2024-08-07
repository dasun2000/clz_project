<%-- 
    Document   : UpdateStudent
    Created on : Jul 30, 2024, 11:37:52 AM
    Author     : MSI KATANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
        <script>
            function x() {
                const form = document.forms['UpStu'];
                if (form.no.value === "" || (form.update.value === "update" && (form.fn.value === "" || form.ln.value === "" || form.add.value === "" || form.em.value === "" || form.pno.value === "" || form.hno.value === ""))) {
                    alert("Please fill all details.");
                    return false;
                }
                if (isNaN(form.no.value)) {
                    alert("Please enter a valid student number.");
                    return false;
                }
                if (form.update.value === "") {
                    alert("Please select Update or Delete.");
                    return false; 
                }
                if (form.update.value === "update") {
                    if (isNaN(form.pno.value) || form.pno.value.length !== 10) {
                        alert("Please enter a valid Phone Number.");
                        return false;
                    }
                    if (isNaN(form.hno.value) || form.hno.value.length !== 10) {
                        alert("Please enter a valid Home Number.");
                        return false;
                    }
                }
                return true;
            }
        </script>
    </head>
    <body>
        <%
            String grade = request.getParameter("gg");
        %>
        <form action="Update.jsp" method="post" name="UpStu" onsubmit="return x()">
            <table>
                <tr>
                    <td><label>Enter Student No</label></td>
                    <td><input type="text" name="no"></td>
                </tr>
                <tr>
                    <td><label>What do you want</label></td>
                    <td>
                        <select name="update">
                            <option value="">Select</option>
                            <option value="update">Update</option>
                            <option value="delete">Delete</option>
                        </select>
                    </td>
                </tr>
            </table>
            <h3>If you want to update, please fill this form</h3>
            <table>
                <tr>
                    <td><label>First Name</label></td>
                    <td><input type="text" name="fn"></td>
                </tr>
                <tr>
                    <td><label>Last Name</label></td>
                    <td><input type="text" name="ln"></td>
                </tr>
                <tr>
                    <td><label>Address</label></td>
                    <td><input type="text" name="add"></td>
                </tr>
                <tr>
                    <td><label>Email</label></td>
                    <td><input type="text" name="em"></td>
                </tr>
                <tr>
                    <td><label>Phone Number</label></td>
                    <td><input type="text" name="pno"></td>
                </tr>
                <tr>
                    <td><label>Home Number</label></td>
                    <td><input type="text" name="hno"></td>
                </tr>
                <tr>
                    <td><input type="hidden" value="<%= grade %>" name="gg"></td>
                </tr>
                <tr>
                    <td><button type="submit">Submit</button></td>
                    <td><button type="reset">Reset</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
