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
    conn = DriverManager.getConnection("jdbc:mysql://197.248.5.16/cityscen_project","cityscen_kimaiga","nelsonkimaiga2016");
		
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
                    sqlInsertregistration ="insert into registration (fullnames, password, idnumber, gender, date, voterid, ward, constituency, county, pollingcenter)" +"values(?, password('"+password+"'),?, ?, ?, ?, ?)";
                    
                    	psInsert=conn.prepareStatement(sqlInsertregistration);
			psInsert.setString(1,fullnames);
			psInsert.setString(2,password);
			psInsert.setString(3,idnumber);
			psInsert.setString(4,gender);
			psInsert.setString(5,dateofbirth);
			psInsert.setString(6,voterid);
			psInsert.setString(7,ward);
			psInsert.setString(8,constituency);
			psInsert.setString(9,county);
			psInsert.setString(10,pollcenter);
                        
                        psInsert.executeUpdate();
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