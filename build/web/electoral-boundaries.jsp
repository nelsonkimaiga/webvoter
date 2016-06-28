<%-- 
    Document   : electoral-boundaries
    Created on : Jun 27, 2016, 1:44:33 PM
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
            <div class="row">
                <div class="small-12 medium-8 large-4 columns">
                    <h6>County</h6>
                    <form action="" method="" name="">
                        <fieldset>
                            <label>County ID</label>
                            <input type="text" value='<%="COUN"+(int) (Math.random()*200)%>'>
                        </fieldset>
                        <fieldset>
                            <label>Name</label>
                            <select name="countyname">
                                <option value="default" disabled="true" selected="true">County Name</option>
                            </select>
                        </fieldset>
                        <button type="submit" class="button secondary">Save</button>
                    </form>
                        <hr>
                        <h6>Constituency</h6>
                        <form action="" method="" name="">
                            <fieldset>
                                <label>County ID</label>
                                <input type="text" value='<%="CONS"+(int) (Math.random()*200)%>'>
                            </fieldset>
                            <fieldset>
                                <label>Name</label>
                                <select name="constituencyname">
                                    <option value="default" disabled="true" selected="true">Constituency Name</option>
                                </select>
                            </fieldset>
                            <button type="submit" class="button secondary">Save</button>
                    </form>
                            <hr>
                            <h6>Ward</h6>
                            <form action="" method="" name="">
                                <fieldset>
                                    <label>Ward ID</label>
                                    <input type="text" value='<%="WARD"+(int) (Math.random()*200)%>'>
                                </fieldset>
                                <fieldset>
                                    <label>Name</label>
                                    <select name="wardname">
                                        <option value="default" disabled="true" selected="true">Ward Name</option>
                                    </select>
                                </fieldset>
                                <button type="submit" class="button secondary">Save</button>
                            </form>
                </div>
                                <!--election panel starts here-->
                                <div class="small-12 medium-12 large-8 columns">
                                    <h6>LOL</h6>
                                </div>
            </div>
        </div>
        <script src="js/vendor/foundation.js"></script>
        <script src="js/vendor/what-input.js"></script>
        <script src="js/jquery.countdown.min.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>
