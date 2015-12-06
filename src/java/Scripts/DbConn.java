/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scripts;

/**
 *
 * @author kimaiga
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet; 
import javax.swing.JOptionPane;

public class DbConn {

//This class called when pinging database comnections between MYSQL and the system
     Connection conn = null;
             String url = "jdbc:mysql://localhost:3306/uchaguzi";
             String dbName = "uchaguzi";
             String driver = "com.mysql.jdbc.Driver"; //MYSQL Driver/connector added to libary.
             String userName = "root"; //username to DB
             String password = ""; //password to DB (blank)
             Statement st;
             ResultSet rs;

             //method that connects with conditional functions
    public  static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","");
            System.out.println("Connection with Database Established");
            
            return conn;

    }
        //Exception is an error handling message that informs the user that connection wasn't successful
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection to the database has not been established successsfully." + e.getMessage());
            System.out.println("Error:"+e);
            return null;
        }    
             }
    public static void main(String[] args) {
       
  
            }
}
