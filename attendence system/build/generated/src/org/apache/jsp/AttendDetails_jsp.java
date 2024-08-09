package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDateTime;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class AttendDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            String grade=request.getParameter("grade");
            String index=request.getParameter("index");
            LocalDateTime currentDateTime = LocalDateTime.now();
            if(grade.equals("6"))
            {
                Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/ASttendence";
                Connection con=DriverManager.getConnection(url, "root", "");
                Statement st=con.createStatement();
                
                String q1="SELECT * FROM student6";
                ResultSet rs=st.executeQuery(q1);
            
      out.write("\n");
      out.write("            \n");
      out.write("            <form action=\"\"\n");
      out.write("            <table>\n");
      out.write("            \n");
      out.write("            ");

                while (rs.next())
                {
                    if (index.equals(rs.getString("No")))
                    {
      out.write("\n");
      out.write("                      \n");
      out.write("                    <tr><td>Student Index No :</td><td>");
      out.print(rs.getString("No"));
      out.write("</td></tr>\n");
      out.write("                    <tr><td>Name :</td><td>");
      out.print(rs.getString("FirstName"));
      out.write(' ');
      out.print(rs.getString("LastName"));
      out.write("</td></tr>\n");
      out.write("                    <tr><td>Grade :</td><td>Grade ");
      out.print(grade);
      out.write("</td></tr>\n");
      out.write("                    <tr><td>Date & Time :</td><td>");
      out.print(currentDateTime);
      out.write("</td></tr>\n");
      out.write("                    <tr><td><button type=\"submit\">Submit</button></td><td style=\"padding-left: 50px;\"><button type=\"reset\">Reset</button></td></tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");
}
                    
                }
      out.write("\n");
      out.write("                </table>\n");
      out.write("            ");
}
        
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
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
