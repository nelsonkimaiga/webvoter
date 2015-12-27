<%-- 
    Document   : vote
    Created on : Dec 22, 2015, 12:15:06 PM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>E-Voter|Vote</title>
  <!-- Bootstrap -->
  <link href="css/bootstrap.css" rel="stylesheet">
  <link href="css/bootstrap-theme.css" rel="stylesheet">
  <link href="css/styles.css" rel="stylesheet">
  <!-- font-awsome -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="fonts/font-awesome.min.css">
  <!-- fonts -->
  <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
  	<!-- JavaScript  -->
  <script src="js/jquery-1.11.3.min.js"></script>
  <script src="js/modernizr.js"></script>
</head>
    <body>
    <div id="wrapper">
     <div class="container">
        <!-- Verification form-->
      <form action="VerifyVoter" method="POST" name="VerifyForm" autocomplete="off" class="form-inline">
        <h3>Voter Verification</h3>

        <br>

        	<div class="form-group">
               <label for="idcard">ID Card Number</label>
               <input type="text" class="form-control" id="IDNum" name="id_number" placeholder="ID Card Number">
            </div>

            <div class="form-group">
               <label for="voterid">Voter ID</label>
               <input type="text" class="form-control" id="VoterID" name="voter_id" placeholder="Voter ID">
            </div>
            <button type="submit" class="btn btn-default" id="verify" role="button">Verify</button>
        </form>
      <br>
</div>      
<!-- voting form -->
<div class="container">
<form action="Vote" method="POST" name="VotingForm" autocomplete="off" class="form-group">
<div class="row">
  <!-- column 1 president -->
  <div class="col-md-3">
    <span><h3>President</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="president">
      <option value="default" selected>Select President</option>
    </select>
  </div>
  <!-- column 2 governor -->
  <div class="col-md-3">
    <span><h3>Governor</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="governor">
      <option value="default" selected>Select Governor</option>
    </select>
  </div>
<!-- column 3 MP -->
  <div class="col-md-3">
    <span><h3>Member of Parliament</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="MP">
      <option value="default" selected>Select MP</option>
    </select>
  </div>
<!-- column 4 councillor -->
  <div class="col-md-3">
    <span><h3>County Rep</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="councillor">
      <option value="default" selected>Select Councillor</option>
    </select>
  </div>
<br>

  <div class="form-inline" id="serial">
        <label for="pres">Vote Serial Number</label>
        <input type="text" class="form-control" id="voteserial" name="vote_serial"  value='<%="VT"+(int)(Math.random()*10000)%>'>
  </div>
  <br>
  <button type="submit" class="btn btn-default" id="castvote">Cast Vote</button>
</div>
</form>
     </div>
    </div>
<script src="js/ajax.js"></script>                  
    </body>
</html>

