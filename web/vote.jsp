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
  <!-- fonts -->
  <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
  	<!-- JavaScript  -->
  <script src="js/jquery-1.11.3.min.js"></script>
  <script src="js/modernizr.js"></script>
  <script type="text/javascript"><!--
      function init(){
        alert('<%="Error"%>');
        window.location.replace('javascript:""');
      }
    //--></script>
</head>
    <body>
    <div id="wrapper">
     <div class="container">
        <!-- Verification form and voting section -->
        <form action="vote" method="POST" name="VotingForm" autocomplete="off" class="form-inline">
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
            <button type="submit" class="btn-primary" onclick="init();">Verify</button>

            <br>
<h3>Proceed to Start Voting</h3>
           <label for="pres">President</label>
		<select class="form-control" name="president">
        		<option value="uhuru">Uhuru Kenyatta</option>
        		<option value="Raila">Raila Amolo Odinga</option>
        		<option value="Ruto">William Ruto</option>
     		</select>

     	<label for="gov">Governor</label>
     		<select class="form-control" name="governor">
        		<option value="kidero">Evans Kidero</option>
        		<option value=""></option>
        		<option value=""></option>
     		</select>

     	<label for="mp">MP</label>
     		<select class="form-control" name="mp">
        		<option value="mbuvi">Gideon Mbuvi</option>
        		<option value=""></option>
        		<option value=""></option>
     		</select>

     	<label for="councillor">Councillor</label>	
     		<select class="form-control" name="councillor">
        		<option value="kabogo">William Kabogo</option>
        		<option value=""></option>
        		<option value=""></option>
     		</select>

     	<div class="form-horizontal">
     	<br>     		
     		<div class="form-goup">
     		<label for="pres">Vote Serial Number</label>
     		<input type="text" class="form-control" id="voteserial" name="vote_serial" value='<%="VT"+(int)(Math.random()*10000)%>'>	
     		</div>
     	<br>
        <button type="submit" class="btn-primary">Cast Vote</button>
     	</div>
        </form>
     </div>
    </div>               
    </body>
</html>

