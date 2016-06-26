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
    <title>Register</title>
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
            <div class="row">
                <div class="small-12 medium-12 large-12 columns">
                    <form action="" method="" name="registrationForm" onsubmit="return validateForm()" autocomplete="off">
                        <div class="large-6 columns">
                            <h6>Voter Details</h6>
                            <hr>
                            <fieldset>
                                <label>Full Names</label>
                                <input type="text" name="fullname" placeholder="FULL NAMES">
                            </fieldset>
                            <fieldset>
                                <label>ID Card Number</label>
                                <input type="text" name="idcard" placeholder="ID CARD NUMBER">
                            </fieldset>
                            <fieldset>
                                <label>Gender</label>
                                <select name="gender">
                                    <option value="default" selected disabled>Gender</option>
                                    <option value="male">Male</option>
                                    <option value="female">Female</option>
                                </select>
                            </fieldset>
                            <fieldset>
                                <label>Date of Birth</label>
                                <input type="date" name="dob">
                            </fieldset>
                        </div>
                        <div class="large-6 columns">
                            <h6>Voter's card details</h6>
                            <hr>
                            <fieldset>
                                <label>Voter ID</label>
                                <input type="text" value='<%="VT"+(int)(Math.random()*200)%>' name="voterid">
                            </fieldset>
<!--                            <fieldset>
                                <label>Place of Issue</label>
                                <select name="placeissued">
                                    <option value="default" selected disabled>Place issued</option>
                                </select>
                            </fieldset>-->
                            <fieldset>
                                <label>Ward</label>
                                <select name="ward">
                                    <option value="default" selected disabled>Ward</option>
                                </select>
                            </fieldset>
                            <fieldset>
                                <label>Constituency</label>
                                <input type="text" name="constituency" placeholder="CONSTITUENCY"> 
                            </fieldset>
                            <fieldset>
                                <label>County</label>
                                <input type="text" name="county" placeholder="COUNTY"> 
                            </fieldset>
                            <fieldset>
                                <label>Polling Center</label>
                                <select name="pollcenter">
                                    <option value="default" selected disabled>Polling Center</option>
                                </select>
                            </fieldset>
                        </div>
                        <button type="submit" class="button success" value="register">REGISTER</button>
                    </form>
                </div>
            </div>
        </div>
        
        
        <script src="js/vendor/foundation.js"></script>
        <script src="js/vendor/what-input.js"></script>
        <script src="js/jquery.countdown.min.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>
