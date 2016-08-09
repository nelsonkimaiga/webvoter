<%-- 
    Document   : voterdashboard
    Created on : Jul 22, 2016, 11:55:45 AM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"language="java" import="java.sql.*" errorPage=""%>
<!doctype html>
<html class="no-js" lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Getting Started</title>
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
                      <li><a href="register.jsp">Voter Registration</a></li>
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
          <hr>
          <p id="registertext">Choose an option to proceed.</p>
          <div class="row">
              <div class="small-12 medium-4 large-4 columns">
                  <a href="vote.jsp"><i class="fa fa-check-square">Cast your vote</i></a>
              </div>
              <div class="small-12 medium-4 large-4 columns">
                  <a href="verify.jsp">Verify your voter details</a>
              </div>
              <div class="small-12 medium-4 large-4 columns">
                  <a href="viewdata.jsp">View Election data</a>
              </div>
          </div>
          <hr>
      </div>
        
        <script src="js/vendor/foundation.js"></script>
        <script src="js/vendor/what-input.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>
