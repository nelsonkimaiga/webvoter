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
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Welcome</title>
        <link rel="stylesheet" href="css/foundation.css">
        <link rel="stylesheet" href="css/app.css">
        <!--font-awsome-->
        <link rel="stylesheet" href='https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css'>
        <!-- fonts -->
        <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
        <script src="js/vendor/jquery.js"></script>
    </head>
    <body>
        <nav class="nav ">
            <div class="nav-center">
                <a class="toggle-nav" href="#">&#9776;</a>
                <div class="nav-mobile">
                    <ul class="left">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="vote.jsp">Cast Your Vote</a></li>
                    </ul>
                    <ul class="right">
                        <li>
                            <a href="#">Candidate Bios</a>
                        </li>
                        <li>
                            <a href="#"></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container bodycontent">
            <h2>Registration Done Successfully!</h2>
        </div>
        
        <script src="js/vendor/foundation.js"></script>
        <script src="js/vendor/what-input.js"></script>
        <script src="js/jquery.countdown.min.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>