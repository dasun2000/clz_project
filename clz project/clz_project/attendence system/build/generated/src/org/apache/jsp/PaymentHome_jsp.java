package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PaymentHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function y() {\n");
      out.write("    \n");
      out.write("    return confirm(\"Are you sure?\");\n");
      out.write("}\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("            background-image: url('Image/login.jpg');\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            background-image: url('Image/form.jpg');\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"],\n");
      out.write("        input[type=\"password\"],\n");
      out.write("        button {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            background-color: red;\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 180px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("        p {\n");
      out.write("            font-size: 12px;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        input {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        h1{\n");
      out.write("            color: black;\n");
      out.write("            font-family: Helvetica;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String gg=request.getParameter("gg");
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table><tr><td>\n");
      out.write("                    <h1>Welcome to Admin Panel</h1></td></tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <tr><td><form action=\"addPayment.jsp\" method=\"post\">\n");
      out.write("            <button type=\"submit\">Add Payment</button>\n");
      out.write("               <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\n");
      out.write("                    </form></td></tr>\n");
      out.write("            <tr><td><form action=\"PaymentSuccess.jsp\" method=\"post\">\n");
      out.write(" \n");
      out.write("            <button type=\"submit\">Payment Success List</button>\n");
      out.write("               <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\n");
      out.write("                    </form></td></tr>\n");
      out.write("            <tr><td><form action=\"Student.jsp\" method=\"post\">\n");
      out.write("            <button type=\"submit\">Payment unSuccess List</button>\n");
      out.write("               <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\n");
      out.write("                    </form></td></tr>\n");
      out.write("            <tr><td><form action=\"IndexSearch.jsp\" method=\"post\">\n");
      out.write("            <button type=\"submit\">Search Index</button>\n");
      out.write("               <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\n");
      out.write("                    </form></td></tr>\n");
      out.write("            <tr><td><form action=\"ClearPay\" method=\"post\" name=\"clear\" onsubmit=\"return y()\">\n");
      out.write("                        <button type=\"submit\" >Clear All Payment</button>\n");
      out.write("            <input type=\"hidden\"  value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\n");
      out.write("                    </form></td></tr>\n");
      out.write("            <tr><td><form action=\"Grade.jsp\" method=\"post\">\n");
      out.write("            <button type=\"submit\">Exit</button>\n");
      out.write("               <input type=\"hidden\" value=\"");
      out.print(gg);
      out.write("\" name=\"gg\">\n");
      out.write("                    </form></td></tr>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
