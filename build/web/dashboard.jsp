<%-- 
    Document   : admin
    Created on : Jun 26, 2016, 8:18:32 PM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administration</title>
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
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="">Election Management</a></li>
                        <li><a href=""></a></li>
                    </ul>
                    <ul class="right">
                        <li>
                            <a href="#">Candidate Bios</a>
                        </li>
                        <li>
                            <a href="logout.jsp"><i class="fa fa-envelope">Logout</i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container bodycontent">
            <div class="row">
                <div class="large-6 large-centered columns">
                    <a href="candidates.jsp">Candidate Registration</a>
                    <hr>
                    <a href="electoral-boundaries.jsp">Electoral Boundaries</a>
                    <hr>
                </div>
            </div>
        </div>
    </body>
</html>
