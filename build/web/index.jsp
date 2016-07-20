<%-- 
    Document   : index
    Created on : Jun 13, 2016, 3:54:11 PM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Start Page</title>
    <link rel="stylesheet" href="css/foundation.css">
    <link rel="stylesheet" href="css/app.css">
    <!--font-awsome-->
    <link rel="stylesheet" href='https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css'>
    <!-- fonts -->
    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
    <script src="js/vendor/jquery.js"></script>
    <body>
        <div class="container">
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
                                <a href="#"><i class="fa fa-envelope"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <br>
            <div class="row bodycontent">
                <div class="medium-8 columns">
                    
                </div>
                <div class="medium-4 columns">
                    <div id="movingicon">
                        <i class="fa fa-hourglass fa-3x fa-spin icon-color"></i>
                        <br/>
                        <div id="countdown">
                            
                        </div>                            
                    </div>                        
                </div>                    
            </div>           
        </div>
        <!-- countdown timer -->
        <script type="text/javascript">
            $('#countdown').countdown('2017/08/01', function(event) {
                $(this).html(event.strftime('Count down to the General Election: %w weeks %d days %H:%M:%S'));
            });
                </script>
        <script src="js/vendor/foundation.js"></script>
        <script src="js/vendor/what-input.js"></script>
        <script src="js/jquery.countdown.min.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>
