package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head><title>Admin Panel</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style2.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         ");

        String gg = request.getParameter("gg");
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"admin-panel\">\r\n");
      out.write("            <h1>Welcome to Admin Panel</h1>\r\n");
      out.write("            <form action=\"Student.jsp\" method=\"post\">\r\n");
      out.write("                <button type=\"submit\">View students list</button>\r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\r\n");
      out.write("            </form>\r\n");
      out.write("            <form action=\"SAttend.jsp\" method=\"post\">\r\n");
      out.write("                <button type=\"submit\">Student Attendance</button>\r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\r\n");
      out.write("            </form>\r\n");
      out.write("            <form action=\"Addstu.jsp\" method=\"post\">\r\n");
      out.write("                <button type=\"submit\">Add New Student</button>\r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\r\n");
      out.write("            </form>\r\n");
      out.write("            <form action=\"PaymentHome.jsp\" method=\"post\">\r\n");
      out.write("                <button type=\"submit\">Payment</button>\r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\r\n");
      out.write("            </form>\r\n");
      out.write("            <form action=\"Updatestu.jsp\" method=\"post\">\r\n");
      out.write("                <button type=\"submit\">Student List Update</button>\r\n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\r\n");
      out.write("            </form>\r\n");
      out.write("            <form action=\"Grade.jsp\" method=\"post\">\r\n");
      out.write("                <button type=\"submit\">Exit</button>\r\n");
      out.write("            </form>\r\n");
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
