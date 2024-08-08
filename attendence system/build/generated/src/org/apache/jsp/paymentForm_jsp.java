package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class paymentForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String sno=request.getParameter("sno");
            String sname=request.getParameter("sname");
            String date=request.getParameter("date");
        String gr=request.getParameter("gg");
        
            if (gr.equals("6"))
            {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            
            String q1="SELECT * FROM student6 WHERE No='"+sno+"' AND FirstName='"+sname+"'";
            
            ResultSet rs=st.executeQuery(q1);
            if (rs.next()){
            
             String q3 = "INSERT INTO Payment6 (No, FirstName, LastName, Date, Payment) VALUES ('" + rs.getString("No") + "', '" + rs.getString("FirstName") + "', '" + rs.getString("LastName") + "', '" + date + "', 'Paid')";
            st.executeUpdate(q3);
            response.sendRedirect("Grade.jsp");
            }
            }
            else if (gr.equals("7"))
            {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            
            String q1="SELECT * FROM student7 WHERE No='"+sno+"' AND FirstName='"+sname+"'";
            
            ResultSet rs=st.executeQuery(q1);
            if (rs.next()){
            
             String q3 = "INSERT INTO Payment7 (No, FirstName, LastName, Date, Payment) VALUES ('" + rs.getString("No") + "', '" + rs.getString("FirstName") + "', '" + rs.getString("LastName") + "', '" + date + "', 'Paid')";
            st.executeUpdate(q3);
            response.sendRedirect("Grade.jsp");
            }
            }
            else if (gr.equals("8"))
            {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            
            String q1="SELECT * FROM student8 WHERE No='"+sno+"' AND FirstName='"+sname+"'";
            
            ResultSet rs=st.executeQuery(q1);
            if (rs.next()){
            
             String q3 = "INSERT INTO Payment8 (No, FirstName, LastName, Date, Payment) VALUES ('" + rs.getString("No") + "', '" + rs.getString("FirstName") + "', '" + rs.getString("LastName") + "', '" + date + "', 'Paid')";
            st.executeUpdate(q3);
            response.sendRedirect("Grade.jsp");
            }
            }
            else if (gr.equals("9"))
            {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            
            String q1="SELECT * FROM student9 WHERE No='"+sno+"' AND FirstName='"+sname+"'";
            
            ResultSet rs=st.executeQuery(q1);
            if (rs.next()){
            
             String q3 = "INSERT INTO Payment9 (No, FirstName, LastName, Date, Payment) VALUES ('" + rs.getString("No") + "', '" + rs.getString("FirstName") + "', '" + rs.getString("LastName") + "', '" + date + "', 'Paid')";
            st.executeUpdate(q3);
            response.sendRedirect("Grade.jsp");
            }
            }
            else if (gr.equals("10"))
            {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            
            String q1="SELECT * FROM student10 WHERE No='"+sno+"' AND FirstName='"+sname+"'";
            
            ResultSet rs=st.executeQuery(q1);
            if (rs.next()){
            
             String q3 = "INSERT INTO Payment10 (No, FirstName, LastName, Date, Payment) VALUES ('" + rs.getString("No") + "', '" + rs.getString("FirstName") + "', '" + rs.getString("LastName") + "', '" + date + "', 'Paid')";
            st.executeUpdate(q3);
            response.sendRedirect("Grade.jsp");
            }
            }else if (gr.equals("11"))
            {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            
            String q1="SELECT * FROM student11 WHERE No='"+sno+"' AND FirstName='"+sname+"'";
            
            ResultSet rs=st.executeQuery(q1);
            if (rs.next()){
            
             String q3 = "INSERT INTO Payment11 (No, FirstName, LastName, Date, Payment) VALUES ('" + rs.getString("No") + "', '" + rs.getString("FirstName") + "', '" + rs.getString("LastName") + "', '" + date + "', 'Paid')";
            st.executeUpdate(q3);
            response.sendRedirect("Grade.jsp");
            }
            }
            
        
      out.write("\r\n");
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
