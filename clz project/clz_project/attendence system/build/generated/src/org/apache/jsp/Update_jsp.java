package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
 
            String grade = request.getParameter("gg");
            String no = request.getParameter("no");
            String update = request.getParameter("update");
            String first = request.getParameter("fn");
            String Last = request.getParameter("ln");
            String Address = request.getParameter("add");
            String Phone = request.getParameter("pno");
            String Hphone = request.getParameter("hno");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/attendence";
                Connection con = DriverManager.getConnection(url, "root", "");

                if ("6".equals(grade)) {
                    if ("update".equals(update)) {
                        String q1 = "UPDATE student6 SET FirstName=?, LastName=?, Address=?, Phone=?, Home Phone=? WHERE No=?";
                        PreparedStatement pstmt = con.prepareStatement(q1);
                        pstmt.setString(1, first);
                        pstmt.setString(2, Last);
                        pstmt.setString(3, Address);
                        pstmt.setString(4, Phone);
                        pstmt.setString(5, Hphone);
                        pstmt.setString(6, no);
                        pstmt.executeUpdate();
                        response.sendRedirect("Grade.jsp");
                    } else if ("delete".equals(update)) {
                        String q2 = "DELETE FROM student6 WHERE No=?";
                        PreparedStatement pstmt = con.prepareStatement(q2);
                        pstmt.setString(1, no);
                        pstmt.executeUpdate();
                        response.sendRedirect("Grade.jsp");
                    }
                } else {
                    response.sendRedirect("Home.jsp");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
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
