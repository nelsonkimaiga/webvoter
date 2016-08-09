<%-- 
    Document   : doregister
    Created on : Aug 8, 2016, 5:22:04 PM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*" errorPage=""%>
<jsp:useBean id="dbConn" scope="request" class="db.DbConn"/>
<%
                    Connection conn=null;
                    //    conn=dbConn.getConnection();
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn = DriverManager.getConnection("jdbc:mysql://localhost/webvoter","root","303seminarian");
		
		PreparedStatement psInsert=null;
		
		String fullnames=request.getParameter("fullname");
                String password = request.getParameter("password");
		String idnumber=request.getParameter("idcard");
		String gender=request.getParameter("gender");
		String dateofbirth=request.getParameter("dob");
		String voterid=request.getParameter("voterid");
		String ward=request.getParameter("ward");
		String constituency=request.getParameter("constituency");
		String county=request.getParameter("county");
		String pollcenter=request.getParameter("pollcenter");
		
		String sqlInsertregistration=null;
                
                try{
                    sqlInsertregistration ="INSERT into registration VALUES ('"+fullnames+"', '"+password+"', '"+idnumber+"', '"+gender+"', '"+dateofbirth+"', '"+voterid+"', '"+ward+"', '"+constituency+"', '"+county+"', '"+pollcenter+"')";
                    
                    	psInsert=conn.prepareStatement(sqlInsertregistration);                        
                        psInsert.executeUpdate();
                        
                        request.setAttribute("fullnames", fullnames);
                        request.setAttribute("password", password);
                        request.setAttribute("idcard", idnumber);
                        request.setAttribute("gender", gender);
                        request.setAttribute("dob", dateofbirth);
                        request.setAttribute("voterid", voterid);
                        request.setAttribute("ward", ward);
                        request.setAttribute("constituency", constituency);
                        request.setAttribute("county", county);
                        request.setAttribute("pollcenter", pollcenter);
                }
                catch(Exception exp){
                    exp.printStackTrace();
                    request.setAttribute("error","<span class='sSError'>&nbsp; Registration is not successful, May be User ID already Exists &nbsp; </span>");
                    RequestDispatcher dispatch = request.getRequestDispatcher("/register.jsp");
                    dispatch.forward(request, response);
                }
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Test</title>
    </head>
    <body>
        <p>Hey!</p>
    </body>
</html>