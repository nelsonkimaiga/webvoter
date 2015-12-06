/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scripts;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kimaiga
 */
public class VerifyVoter extends HttpServlet {

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
        PrintWriter out = response.getWriter();
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet VerifyVoter</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet VerifyVoter at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }

//Database connection variables
    Connection conn= null;
    String url = "jdbc:mysql://localhost/";
    String dbName = "uchaguzi";
    String driver ="com.mysql.jdbc.Driver";
    String user = "root";
    String password = "";
    Statement st = null;
    ResultSet rs;

    //attmept to connect to db
             try{
	       Class.forName(driver);

             conn = DriverManager.getConnection(url+dbName,user,password);

              st = conn.createStatement();

	            }
	            catch(Exception exp){
	              out.println("<h3>Cannot connect to the database,check network settings.</h3>");
	            }
             
          //get input form data
          String idnumber=request.getParameter("id_number");
          
          //check for ID Number in DB
          String sql = "Select id_no,s_name,m_name,m_name,gender,voter_id,ward,	constituency,county,poll_center	 from registration where id_no ='"+idnumber+"'";
          
            try{
            int c=0;
            rs = st.executeQuery(sql);
            st = conn.prepareStatement(sql);
             
                  while(rs.next()){
                    c++;
                    }
            if (c==1) {


           rs = st.executeQuery(sql);
             st = conn.prepareStatement(sql);
//            verification_table.setModel(DbUtils.resultSetToTableModel(rs));
//            start_voting_button_.setVisible(true);
out.println("<h3>Empty fields!</h3>");
            } 
            
            else {
//                 JOptionPane.showMessageDialog(null, "<html><b><font color=red>NOT REGISTERED</font><br/>ID Number: <font color=red>"+id+"</font></html>\n<html><b>Voter ID : <font color=red>"+vid+"<br/> </html>","Information",JOptionPane.INFORMATION_MESSAGE );
            }
           
            
                

        } catch(Exception exp){
            out.println("<h3>Cannot connect to the database,check network settings.</h3>");
//            JOptionPane.showMessageDialog(null, exp,"Error",JOptionPane.ERROR_MESSAGE);           
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
        processRequest(request, response);
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
