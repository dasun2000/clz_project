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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">\r\n");
      out.write("    <title>Add Student</title>\r\n");
      out.write("    \r\n");
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
