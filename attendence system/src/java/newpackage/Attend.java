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
import java.time.LocalDate;
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
@WebServlet(name = "Attend", urlPatterns = {"/Attend"})
public class Attend extends HttpServlet {

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
            out.println("<title>Servlet Attend</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Attend at " + request.getContextPath() + "</h1>");
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
            //processRequest(request, response);
            
            String grade=request.getParameter("gg");
            String index=request.getParameter("index");
            String currentDate=request.getParameter("date");
            
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Attendence";
            Connection con;
            
                con = DriverManager.getConnection(url,"root","");
                Statement st=con.createStatement();
            PrintWriter out=response.getWriter();
            out.println("Error");
            
            if (grade.equals("6"))
            {
                String q1="INSERT INTO Tmpattend6 (No,Date,Attendence) VALUES ('"+index+"','"+currentDate+"','1')";
                
                st.executeUpdate(q1);
                response.sendRedirect("AttendSuccess.html");
            }
            else if (grade.equals("7"))
            {
                String q1="INSERT INTO Tmpattend7 VALUES ('"+index+"','"+currentDate+"','1')";
                st.executeUpdate(q1);
                response.sendRedirect("AttendSuccess.html");
            }
            else if (grade.equals("8"))
            {
                String q1="INSERT INTO Tmpattend8 VALUES ('"+index+"','"+currentDate+"','1')";
                st.executeUpdate(q1);
                response.sendRedirect("AttendSuccess.html");
            }
            else if (grade.equals("9"))
            {
                String q1="INSERT INTO Tmpattend9 VALUES ('"+index+"','"+currentDate+"','1')";
                st.executeUpdate(q1);
                response.sendRedirect("AttendSuccess.html");
            }
            else if (grade.equals("10"))
            {
                String q1="INSERT INTO Tmpattend10 VALUES ('"+index+"','"+currentDate+"','1')";
                st.executeUpdate(q1);
                response.sendRedirect("AttendSuccess.html");
            }
            else if (grade.equals("11"))
            {
                String q1="INSERT INTO Tmpattend11 VALUES ('"+index+"','"+currentDate+"','1')";
                st.executeUpdate(q1);
                response.sendRedirect("AttendSuccess.html");
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(Attend.class.getName()).log(Level.SEVERE, null, ex);
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
