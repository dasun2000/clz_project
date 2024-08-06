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
@WebServlet(name = "addstu", urlPatterns = {"/addstu"})
public class addstu extends HttpServlet {

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
            out.println("<title>Servlet addstu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addstu at " + request.getContextPath() + "</h1>");
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
        try {
            // processRequest(request, response);
            String grade=request.getParameter("grade");
            String no=request.getParameter("no");
            String fn=request.getParameter("fn");
            String ln=request.getParameter("ln");
            String pno=request.getParameter("pno");
            String hno=request.getParameter("hno");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence","root", "");
            Statement st=con.createStatement();
            
            if(grade.equals("6"))
            {
            String q1="INSERT INTO student6 VALUES('"+no+"','"+fn+"','"+ln+"','"+pno+"','"+hno+"')";
            }
            else if(grade.equals("7"))
            {
              String q1="INSERT INTO student6 VALUES('"+no+"','"+fn+"','"+ln+"','"+pno+"','"+hno+"')";
            }
             else if(grade.equals("8"))
            {
              String q1="INSERT INTO student6 VALUES('"+no+"','"+fn+"','"+ln+"','"+pno+"','"+hno+"')";
            }
             else if(grade.equals("9"))
            {
              String q1="INSERT INTO student6 VALUES('"+no+"','"+fn+"','"+ln+"','"+pno+"','"+hno+"')";
            }
             else if(grade.equals("10"))
            {
              String q1="INSERT INTO student6 VALUES('"+no+"','"+fn+"','"+ln+"','"+pno+"','"+hno+"')";
            }
             else if(grade.equals("11"))
            {
              String q1="INSERT INTO student6 VALUES('"+no+"','"+fn+"','"+ln+"','"+pno+"','"+hno+"')";
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addstu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addstu.class.getName()).log(Level.SEVERE, null, ex);
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
