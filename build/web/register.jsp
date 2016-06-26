<%-- 
    Document   : register
    Created on : Jun 26, 2016, 6:54:51 PM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Start Page</title>
    <link rel="stylesheet" href="css/foundation.css">
    <link rel="stylesheet" href="css/app.css">
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
                        <li><a href="#"><i class="fa fa-home"></i> Home</a></li>
                        <li><a href="register.jsp"><i class="fa fa-book"></i>Voter Registration</a></li>
                        <li><a href="vote.jsp"><i class="fa fa-fire"></i> Cast Your Vote</a></li>
                    </ul>
                    <ul class="right">
                        <li>
                            <a href="#"><i class="fa fa-user"></i>Candidate Bios</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-envelope"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container bodycontent">
            <h5 id="registertext">Register as a voter by filling the registration form below</h5>
            <br>
            <form action="" method="" name="registrationForm" onsubmit="return validateForm()">
                
            </form>
        </div>
        
        
        <script src="js/vendor/foundation.js"></script>
        <script src="js/vendor/what-input.js"></script>
        <script src="js/jquery.countdown.min.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>
