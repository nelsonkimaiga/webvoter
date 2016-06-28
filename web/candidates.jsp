<%-- 
    Document   : candidates
    Created on : Jun 27, 2016, 10:58:32 AM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Candidate Registration</title>
    <link rel="stylesheet" href="css/foundation.css">
    <link rel="stylesheet" href="css/app.css">
    <!--font-awesome-->
    <link rel="stylesheet" href='https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css'>
    <!-- fonts -->
    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
    <body>
        <nav class="nav ">
            <div class="nav-center">
                <a class="toggle-nav" href="#">&#9776;</a>
                <div class="nav-mobile">
                    <ul class="left">
                        <li><a href="#"><i class="fa fa-home"></i> Home</a></li>
                        <li><a href=""><i class="fa fa-book"></i>Election Management</a></li>
                        <li><a href=""><i class="fa fa-fire"></i></a></li>
                    </ul>
                    <ul class="right">
                        <li>
                            <a href="#"><i class="fa fa-user"></i>Candidate Bios</a>
                        </li>
                        <li>
                            <a href="logout.jsp"><i class="fa fa-envelope">Logout</i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container bodycontent">
            <div class="large-8 columns large-centered">
                <h6 id="registertext">Candidate Details</h6>
                <form action="" method="post" name="candidateForm">
                    <fieldset>
                        <label>Full Names</label>
                        <input type="text" name="fullname" placeholder="Full Names">
                    </fieldset>
                    <fieldset>
                        <label>Party/Coalition</label>
                        <select name="party">
                            <option value="default" disabled selected>Party</option>
                        </select>
                    </fieldset>
                    <fieldset>
                        <label>Candidature(POST)</label>
                        <select name="post">
                            <option value="default" disabled selected>POST</option>
                            <option value="CORD">CORD</option>
                        </select>
                    </fieldset>
                    <fieldset>
                        <label>Photo</label>
                        <input type="file">
                    </fieldset>
                    <button type="submit" class="button success">REGISTER CANDIDATE</button>
                </form>
            </div>
        </div>
        
        <script src="js/vendor/foundation.js"></script>
        <script src="js/vendor/what-input.js"></script>
        <script src="js/jquery.countdown.min.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>
