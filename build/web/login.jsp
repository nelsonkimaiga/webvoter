<%-- 
    Document   : login
    Created on : Jun 27, 2016, 10:13:21 AM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="css/foundation.css">
    <link rel="stylesheet" href="css/app.css">
    <!-- fonts -->
    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
    <script src="js/vendor/jquery.js"></script>
  </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="large-6 large-centered columns">
                    <div class="large-12 columns" id="adminlogin">
                        <h6 class="bodycontent">LOG IN AS RETURNING OFFICER</h6>
                        <form action="" method="post" name="loginForm" onsubmit="return validateForm()">
                            <fieldset>
                                <label>Username</label>
                                <input type="text" name="username" placeholder="Username">
                            </fieldset>
                            <fieldset>
                                <label>Password</label>
                                <input type="password" name="password" placeholder="Password">
                            </fieldset>
                            <button type="submit" class="button success">LOGIN</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
