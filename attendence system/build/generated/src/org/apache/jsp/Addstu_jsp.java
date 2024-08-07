package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Addstu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Add Student</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            background-color: #f4f4f4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            max-width: 600px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        label {\r\n");
      out.write("            display: block;\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"text\"] {\r\n");
      out.write("            width: calc(100% - 22px);\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button {\r\n");
      out.write("            background-color: #007bff;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            margin: 5px 0;\r\n");
      out.write("            transition: background-color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button:hover {\r\n");
      out.write("            background-color: #0056b3;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-group {\r\n");
      out.write("            margin-bottom: 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-actions {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-actions button[type=\"reset\"] {\r\n");
      out.write("            background-color: #6c757d;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-actions button[type=\"reset\"]:hover {\r\n");
      out.write("            background-color: #5a6268;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        function validateForm() {\r\n");
      out.write("            const form = document.forms[\"AddStu\"];\r\n");
      out.write("            const fields = [\"no\", \"fn\", \"ln\", \"add\", \"pno\", \"hno\"];\r\n");
      out.write("            const phoneFields = [\"pno\", \"hno\"];\r\n");
      out.write("            \r\n");
      out.write("            for (const field of fields) {\r\n");
      out.write("                if (form[field].value.trim() === \"\") {\r\n");
      out.write("                    alert(\"Please fill all details.\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            if (isNaN(form[\"no\"].value)) {\r\n");
      out.write("                alert(\"Please enter a valid student number.\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            for (const phoneField of phoneFields) {\r\n");
      out.write("                if (isNaN(form[phoneField].value) || form[phoneField].value.length !== 10) {\r\n");
      out.write("                    alert(`Please enter a valid Phone Number`);\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            alert(\"Success\");\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h1>Add Student</h1>\r\n");
      out.write("        <form name=\"AddStu\" action=\"addstudent.jsp\" method=\"post\" onsubmit=\"return validateForm()\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"no\">Student Number</label>\r\n");
      out.write("                <input type=\"text\" id=\"no\" name=\"no\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"fn\">First Name</label>\r\n");
      out.write("                <input type=\"text\" id=\"fn\" name=\"fn\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"ln\">Last Name</label>\r\n");
      out.write("                <input type=\"text\" id=\"ln\" name=\"ln\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"add\">Address</label>\r\n");
      out.write("                <input type=\"text\" id=\"add\" name=\"add\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"em\">Email</label>\r\n");
      out.write("                <input type=\"text\" id=\"em\" name=\"em\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"pno\">Phone Number</label>\r\n");
      out.write("                <input type=\"text\" id=\"pno\" name=\"pno\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"hno\">Home Number</label>\r\n");
      out.write("                <input type=\"text\" id=\"hno\" name=\"hno\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <input type=\"hidden\" name=\"grade\" value=\"");
      out.print( request.getParameter("gg") );
      out.write("\">\r\n");
      out.write("            <div class=\"form-actions\">\r\n");
      out.write("                <button type=\"submit\">Submit</button>\r\n");
      out.write("                <button type=\"reset\">Reset</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
