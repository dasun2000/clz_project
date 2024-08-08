package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Updatestu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">\r\n");
      out.write("        <title>Update Student</title>\r\n");
      out.write("        <script>\r\n");
      out.write("            function x() {\r\n");
      out.write("                const form = document.forms['UpStu'];\r\n");
      out.write("                if (form.no.value === \"\" || (form.update.value === \"update\" && (form.fn.value === \"\" || form.ln.value === \"\" || form.add.value === \"\" || form.em.value === \"\" || form.pno.value === \"\" || form.hno.value === \"\"))) {\r\n");
      out.write("                    alert(\"Please fill all details.\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if (isNaN(form.no.value)) {\r\n");
      out.write("                    alert(\"Please enter a valid student number.\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if (form.update.value === \"\") {\r\n");
      out.write("                    alert(\"Please select Update or Delete.\");\r\n");
      out.write("                    return false; \r\n");
      out.write("                }\r\n");
      out.write("                if (form.update.value === \"update\") {\r\n");
      out.write("                    if (isNaN(form.pno.value) || form.pno.value.length !== 10) {\r\n");
      out.write("                        alert(\"Please enter a valid Phone Number.\");\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                    if (isNaN(form.hno.value) || form.hno.value.length !== 10) {\r\n");
      out.write("                        alert(\"Please enter a valid Home Number.\");\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String grade = request.getParameter("gg");
        
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        <form action=\"Update.jsp\" method=\"post\" name=\"UpStu\" onsubmit=\"return x()\">\r\n");
      out.write("            <h1>Update Student Details</h1>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><label>Enter Student No</label></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"no\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><label>What do you want</label></td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"update\">\r\n");
      out.write("                            <option value=\"\">Select</option>\r\n");
      out.write("                            <option value=\"update\">Update</option>\r\n");
      out.write("                            <option value=\"delete\">Delete</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <h3>If you want to update, please fill this form</h3>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><label>First Name</label></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"fn\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><label>Last Name</label></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"ln\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><label>Address</label></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"add\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><label>Email</label></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"em\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><label>Phone Number</label></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"pno\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><label>Home Number</label></td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"hno\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print( grade );
      out.write("\" name=\"gg\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("            </table>\r\n");
      out.write("                <div class=\"form-actions\">\r\n");
      out.write("                <table>\r\n");
      out.write("                <tr><td ><button type=\"submit\">Submit</button></td><td style=\"padding-left: 50px;\"><button type=\"reset\">Reset</button></td></tr>\r\n");
      out.write("            </table></div>\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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
