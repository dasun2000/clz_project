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
import java.sql.ResultSet;
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
 * @author Akila Udantha
 */
@WebServlet(name = "AGenerate", urlPatterns = {"/AGenerate"})
public class AGenerate extends HttpServlet {

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
            out.println("<title>Servlet AGenerate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AGenerate at " + request.getContextPath() + "</h1>");
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
    Connection con = null;
    Statement st1 = null;
    Statement st2 = null;
    Statement st = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    
    try {
        String grade = request.getParameter("gg");
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Attendence";
        con = DriverManager.getConnection(url, "root", "");
        
        st1 = con.createStatement();
        st2 = con.createStatement();
        st = con.createStatement();

        if ("6".equals(grade)) {
            String q1 = "SELECT * FROM student6";
            String q2 = "SELECT * FROM Tmpattend6";
            
            rs1 = st1.executeQuery(q1);
            rs2 = st2.executeQuery(q2);
            
            while (rs2.next()) {
                while (rs1.next()) {
                    if (rs1.getString("No").equals(rs2.getString("No"))) {
                        String date = rs2.getString("Date").replaceAll("[^a-zA-Z0-9]","_"); // Safely format column names
                        String q = "ALTER TABLE attendance6 ADD COLUMN `" + date + "` INT(5)";
                        st.executeUpdate(q);
                        String q3 = "UPDATE attendance6 SET '" + date + "' = 1 WHERE No = '" + rs2.getString("No") + "'";
                        st.executeUpdate(q3);
                        response.sendRedirect("Home.jsp");
                        return; // Ensure redirection happens once
                    }
                }
                rs1.beforeFirst(); 
            }
        }
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(AGenerate.class.getName()).log(Level.SEVERE, null, ex);
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An error occurred: " + ex.getMessage());
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
