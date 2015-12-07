<%-- 
    Document   : vote
    Created on : Dec 7, 2015, 1:21:17 PM
    Author     : kimaiga
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
  
  <!--Session initializer-->
<body>
<!-- container div -->
<div id="wrapper">
  <div class="container">
<p>Verify Your Voter ID details in order to proceed</p>
    <!-- Verification form -->
<div class="row">
 <div class=".col-md-6">
  <form class="form-inline" action="VerifyVoter" method="POST">
   <div class="form-group">
    <label for="idNumber">ID NO:</label>
     <input type="text" name="id_number" class="form-control" id="idNo" placeholder="ID Number">
    </div>
   <!--<button type="submit" class="btn-default">Verify</button>-->
   <input type="submit" value="Verify" />
  </form>
 </div>
</div>

<br>

<div class="container">
<div class="row">
  <!--<div class="col-xs-6 col-sm-3">-->
  <!-- drop-down menu populates with election candidates from the database-->
  <form action="VoteForCandidate" method="POST" class="form-inline">
      <!--Presidential drop-down-->
      <select class="form-control" name="president">
        <option value="Uhuru_kenyatta">Uhuru Kenyatta</option>
        <option value="Raila">Raila Amolo Odinga</option>
        <option value="Ruto">William Ruto</option>
     </select>
      <!--MP drop-down-->
      <select class="form-control" name="mp">
          <option value="sonko">Mbuvi Sonko</option>
          <option value="waititu">Ferdinand Waititu</option>
      </select>
      <!--Governor-->
      <select class="form-control" name="governor">
          <option value="kidero">Evans Kidero</option>
      </select>
      <!--MCA-->
       <select class="form-control" name="councillor">
          <option value="sonko">Mbuvi Sonko</option>
          <option value="waititu">Ferdinand Waititu</option>
      </select>
      
      <button type="submit" class="btn-primary">Vote</button>
  </form>
</div>
<!-- end of row -->
</div>

<br>

<!--Voter serial field(self-populated)-->
  <form class="form-inline" action="" method="GET">
   <div class="form-group">
    <label for="idNumber">VOTE SERIAL NUMBER:</label>
     <input type="text" name="voter_serial" class="form-control" id="voterserial" value='<%=("VT"+(int)(Math.random()*10000))%>'/>
    </div>
  </form>










  </div>
</div>
<!--</div>-->
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>


