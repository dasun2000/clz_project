package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student List</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            
            String gr=request.getParameter("gg");
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/attendence";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
           
           if (gr.equals("6"))
           {
        
            String q1="SELECT * FROM student6";
            ResultSet rs1=st.executeQuery(q1);
           
        
      out.write("\n");
      out.write("            \n");
      out.write("            <table border=\"1\" style=\"width: 100%; height: 100%; border-collapse: collapse;\"  >\n");
      out.write("                <thead><td>No</td><td>First Name</td><td>Last Name</td><td>Address</td><td>Email</td><td>Contact Number</td><td>Home Number</td></thead>\n");
      out.write("                ");
while (rs1.next())
            {
      out.write("\n");
      out.write("            <tr><td><center>");
      out.print(rs1.getString("No"));
      out.write("</center></td><td>");
      out.print(rs1.getString("FirstName"));
      out.write("</td><td><center>");
      out.print(rs1.getString("LastName"));
      out.write("</center></td><td>");
      out.print(rs1.getString("Address"));
      out.write("</td><td>");
      out.print(rs1.getString("Email"));
      out.write("</td><td>");
      out.print(rs1.getString("Phone"));
      out.write("</td><td>");
      out.print(rs1.getString("Home Number"));
      out.write("</td></tr>\n");
      out.write("            ");
}
      out.write("</table>\n");
      out.write("            ");
}
            
            
                else if (gr.equals("7"))
           {
           
            String q2="SELECT * FROM student7";
            ResultSet rs1=st.executeQuery(q2);
      out.write("\n");
      out.write("            \n");
      out.write("            <table border=\"1\" style=\"width: 100%; height: 100%; border-collapse: collapse;\"  >\n");
      out.write("            \n");
      out.write("                ");
while (rs1.next())
            {
      out.write("\n");
      out.write("            <tr><td><center>");
      out.print(rs1.getString("No"));
      out.write("</center></td><td>");
      out.print(rs1.getString("FirstName"));
      out.write("</td><td><center>");
      out.print(rs1.getString("LastName"));
      out.write("</center></td><td>");
      out.print(rs1.getString("Address"));
      out.write("</td><td>");
      out.print(rs1.getString("Email"));
      out.write("</td><td>");
      out.print(rs1.getString("Phone"));
      out.write("</td><td>");
      out.print(rs1.getString("Home Number"));
      out.write("</td></tr>\n");
      out.write("            ");
}
      out.write("</table>\n");
      out.write("            ");
}
            
                else if (gr.equals("8"))
           {
           
            String q3="SELECT * FROM student8";
            ResultSet rs1=st.executeQuery(q3);
      out.write("\n");
      out.write("            \n");
      out.write("            <table border=\"1\" style=\"width: 100%; height: 100%; border-collapse: collapse;\"  >\n");
      out.write("            \n");
      out.write("                ");
while (rs1.next())
            {
      out.write("\n");
      out.write("            <tr><td><center>");
      out.print(rs1.getString("No"));
      out.write("</center></td><td>");
      out.print(rs1.getString("FirstName"));
      out.write("</td><td><center>");
      out.print(rs1.getString("LastName"));
      out.write("</center></td><td>");
      out.print(rs1.getString("Address"));
      out.write("</td><td>");
      out.print(rs1.getString("Email"));
      out.write("</td><td>");
      out.print(rs1.getString("Phone"));
      out.write("</td><td>");
      out.print(rs1.getString("Home Number"));
      out.write("</td></tr>\n");
      out.write("            ");
}
      out.write("</table>\n");
      out.write("            ");
}
            
            
            else if(gr.equals("8"))
           {
           
            String q4="SELECT * FROM student8";
            ResultSet rs1=st.executeQuery(q4);
      out.write("\n");
      out.write("            \n");
      out.write("            <table border=\"1\" style=\"width: 100%; height: 100%; border-collapse: collapse;\"  >\n");
      out.write("            \n");
      out.write("                ");
while (rs1.next())
            {
      out.write("\n");
      out.write("            <tr><td><center>");
      out.print(rs1.getString("No"));
      out.write("</center></td><td>");
      out.print(rs1.getString("FirstName"));
      out.write("</td><td><center>");
      out.print(rs1.getString("LastName"));
      out.write("</center></td><td>");
      out.print(rs1.getString("Address"));
      out.write("</td><td>");
      out.print(rs1.getString("Email"));
      out.write("</td><td>");
      out.print(rs1.getString("Phone"));
      out.write("</td><td>");
      out.print(rs1.getString("Home Number"));
      out.write("</td></tr>\n");
      out.write("            ");
}
      out.write("</table>\n");
      out.write("            ");
}
            
            
                else if (gr.equals("9"))
           {
           
            String q5="SELECT * FROM student9";
            ResultSet rs1=st.executeQuery(q5);
      out.write("\n");
      out.write("            \n");
      out.write("            <table border=\"1\" style=\"width: 100%; height: 100%; border-collapse: collapse;\"  >\n");
      out.write("            \n");
      out.write("                ");
while (rs1.next())
            {
      out.write("\n");
      out.write("            <tr><td><center>");
      out.print(rs1.getString("No"));
      out.write("</center></td><td>");
      out.print(rs1.getString("FirstName"));
      out.write("</td><td><center>");
      out.print(rs1.getString("LastName"));
      out.write("</center></td><td>");
      out.print(rs1.getString("Address"));
      out.write("</td><td>");
      out.print(rs1.getString("Email"));
      out.write("</td><td>");
      out.print(rs1.getString("Phone"));
      out.write("</td><td>");
      out.print(rs1.getString("Home Number"));
      out.write("</td></tr>\n");
      out.write("            ");
}
      out.write("</table>\n");
      out.write("            ");
}
            
            
                else if(gr.equals("10"))
                   
           {
           
            String q6="SELECT * FROM student10";
            ResultSet rs1=st.executeQuery(q6);
      out.write("\n");
      out.write("            \n");
      out.write("            <table border=\"1\" style=\"width: 100%; height: 100%; border-collapse: collapse;\"  >\n");
      out.write("            \n");
      out.write("                ");
while (rs1.next())
            {
      out.write("\n");
      out.write("            <tr><td><center>");
      out.print(rs1.getString("No"));
      out.write("</center></td><td>");
      out.print(rs1.getString("FirstName"));
      out.write("</td><td><center>");
      out.print(rs1.getString("LastName"));
      out.write("</center></td><td>");
      out.print(rs1.getString("Address"));
      out.write("</td><td>");
      out.print(rs1.getString("Email"));
      out.write("</td><td>");
      out.print(rs1.getString("Phone"));
      out.write("</td><td>");
      out.print(rs1.getString("Home Number"));
      out.write("</td></tr>\n");
      out.write("            ");
}
      out.write("</table>\n");
      out.write("            ");
}
            
            
                else if(gr.equals("11"))
           {
           
            String q7="SELECT * FROM student11";
            ResultSet rs1=st.executeQuery(q7);
      out.write("\n");
      out.write("            \n");
      out.write("            <table border=\"1\" style=\"width: 100%; height: 100%; border-collapse: collapse;\"  >\n");
      out.write("            \n");
      out.write("                ");
while (rs1.next())
            {
      out.write("\n");
      out.write("            <tr><td><center>");
      out.print(rs1.getString("No"));
      out.write("</center></td><td>");
      out.print(rs1.getString("FirstName"));
      out.write("</td><td><center>");
      out.print(rs1.getString("LastName"));
      out.write("</center></td><td>");
      out.print(rs1.getString("Address"));
      out.write("</td><td>");
      out.print(rs1.getString("Email"));
      out.write("</td><td>");
      out.print(rs1.getString("Phone"));
      out.write("</td><td>");
      out.print(rs1.getString("Home Number"));
      out.write("</td></tr>\n");
      out.write("            ");
}
      out.write("</table>\n");
      out.write("            ");
}
            
            
            else{
                   response.sendRedirect("Loger.html");
                  
                    }
            
      out.write("\n");
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
