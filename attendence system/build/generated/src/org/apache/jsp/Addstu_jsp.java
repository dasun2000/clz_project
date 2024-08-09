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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">\n");
      out.write("    <title>Add Student</title>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        function validateForm() {\n");
      out.write("            const form = document.forms[\"AddStu\"];\n");
      out.write("            const fields = [\"no\", \"fn\", \"ln\", \"add\", \"pno\", \"hno\"];\n");
      out.write("            const phoneFields = [\"pno\", \"hno\"];\n");
      out.write("            \n");
      out.write("            for (const field of fields) {\n");
      out.write("                if (form[field].value.trim() === \"\") {\n");
      out.write("                    alert(\"Please fill all details.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            if (isNaN(form[\"no\"].value)) {\n");
      out.write("                alert(\"Please enter a valid student number.\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            for (const phoneField of phoneFields) {\n");
      out.write("                if (isNaN(form[phoneField].value) || form[phoneField].value.length !== 10) {\n");
      out.write("                    alert(`Please enter a valid Phone Number`);\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            alert(\"Success\");\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\" style=\"padding-left: 50px; padding-right: 50px;\">\n");
      out.write("        \n");
      out.write("        <form name=\"AddStu\" action=\"addstudent.jsp\" method=\"post\" onsubmit=\"return validateForm()\" >\n");
      out.write("            <h1>Student Registration Form</h1>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"no\">Student Number</label>\n");
      out.write("                <input type=\"text\" id=\"no\" name=\"no\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"fn\">First Name</label>\n");
      out.write("                <input type=\"text\" id=\"fn\" name=\"fn\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"ln\">Last Name</label>\n");
      out.write("                <input type=\"text\" id=\"ln\" name=\"ln\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"add\">Address</label>\n");
      out.write("                <input type=\"text\" id=\"add\" name=\"add\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"em\">Email</label>\n");
      out.write("                <input type=\"text\" id=\"em\" name=\"em\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"pno\">Phone Number</label>\n");
      out.write("                <input type=\"text\" id=\"pno\" name=\"pno\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"hno\">Home Number</label>\n");
      out.write("                <input type=\"text\" id=\"hno\" name=\"hno\">\n");
      out.write("            </div>\n");
      out.write("            <input type=\"hidden\" name=\"grade\" value=\"");
      out.print( request.getParameter("gg") );
      out.write("\">\n");
      out.write("            <div class=\"form-actions\" style=\"padding-top: 0px; padding-bottom: 0px;\">\n");
      out.write("                <center><table><tr><td><button type=\"submit\">Submit</button></td><td style=\"padding-left: 50px;\"><button type=\"reset\">Reset</button></td></tr></table></center>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("            <form action=\"Grade.jsp\" method=\"post\" style=\"padding-top: 0px;\">\n");
      out.write("                <center> <button type=\"submit\" style=\"background-color: #C00000;\"  >Exit</button></center>\n");
      out.write("            </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
