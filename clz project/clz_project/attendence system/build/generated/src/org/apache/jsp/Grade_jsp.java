package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Grade_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin Panel</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            margin: 0;\n");
      out.write("            background-image: url('Image/login.jpg');\n");
      out.write("            background-size: cover;\n");
      out.write("        }   \n");
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
      out.write("        \n");
      out.write("        <table><tr><td>\n");
      out.write("                    <h1>Welcome to Admin Panel</h1></td></tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("             <tr><td> <form action=\"Home.jsp\">\n");
      out.write("            <button type=\"submit\">Grade 6</button>\n");
      out.write("            <input type=\"hidden\" value=\"6\" name=\"gg\">\n");
      out.write("        </form></td></tr>\n");
      out.write("       <tr><td> <form action=\"Home.jsp\">\n");
      out.write("            <button type=\"submit\">Grade 7</button>\n");
      out.write("            <input type=\"hidden\" value=\"7\" name=\"gg\">\n");
      out.write("        </form></td></tr>\n");
      out.write("        <tr><td> <form action=\"Home.jsp\">\n");
      out.write("            <button type=\"submit\">Grade 8</button>\n");
      out.write("            <input type=\"hidden\" value=\"8\" name=\"gg\">\n");
      out.write("        </form></td></tr>\n");
      out.write("        <tr><td> <form action=\"Home.jsp\">\n");
      out.write("            <button type=\"submit\">Grade 9</button>\n");
      out.write("            <input type=\"hidden\" value=\"9\" name=\"gg\">\n");
      out.write("        </form></td></tr>\n");
      out.write("        <tr><td> <form action=\"Home.jsp\">\n");
      out.write("            <button type=\"submit\">Grade 10</button>\n");
      out.write("            <input type=\"hidden\" value=\"10\" name=\"gg\">\n");
      out.write("        </form></td></tr>\n");
      out.write("        <tr><td> <form action=\"Home.jsp\">\n");
      out.write("            <button type=\"submit\">Grade 11</button>\n");
      out.write("            <input type=\"hidden\" value=\"11\" name=\"gg\">\n");
      out.write("        </form></td></tr>\n");
      out.write("       <tr><td> <form action=\"index.html\">\n");
      out.write("            <button type=\"submit\">Exit</button>\n");
      out.write("        </form></td></tr>\n");
      out.write("        </table>\n");
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
