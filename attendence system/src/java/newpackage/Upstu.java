/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MSI KATANA
 */
@WebServlet(name = "Upstu", urlPatterns = {"/Upstu"})
public class Upstu extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Upstu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Upstu at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                String grade=request.getParameter("grade");
                String no=request.getParameter("no");
                String update=request.getParameter("update");
                String first=request.getParameter("fn");
                String Last=request.getParameter("ln");
                String Address=request.getParameter("add");
                String Phone=request.getParameter("pno");
                String Hphone=request.getParameter("hno");
                
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/attendence";
                    Connection con=DriverManager.getConnection(url,"root","");
                    Statement st=con.createStatement();
                    if(grade.equals("6"))
                    {
                    if(update.equals("update"))
                    {
                        String q1="UPDATE student6 SET FirstName='"+first+"',LastName='"+Last+"',Address='"+Address+"',Phone='"+Phone+"',HomeNumber='"+Hphone+"' WHERE No='"+no+"'";
                        st.executeUpdate(q1);
                        response.sendRedirect("Grade.jsp");
                    }
                    else if(update.equals("delete"))
                    {
                        String q2="DELETE FROM student6 WHERE No='"+no+"'";
                        st.executeUpdate(q2);
                        response.sendRedirect("Grade.jsp");
                     }
                    }
                             
                 } catch (Exception e) {
        Logger.getLogger(Upstu.class.getName()).log(Level.SEVERE, null, e);
    }
            
    }
            /**
             * Returns a short description of the servlet.
             *
             * @return a String containing servlet description
             */
            @Override
            public String getServletInfo() {
            return "Short description";
        }// </editor-fold>
       

}
