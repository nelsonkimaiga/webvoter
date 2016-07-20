<%-- 
    Document   : vote
    Created on : Dec 22, 2015, 12:15:06 PM
    Author     : kimaiga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
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
   <!-- firebase API -->
   <script src="https://cdn.firebase.com/js/client/2.3.2/firebase.js"></script>
  <!-- Bootstrap -->
  <link href="css/foundation.css" rel="stylesheet">
  <link href="css/app.css" rel="stylesheet">
  <!-- fonts -->
  <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
  	<!-- JavaScript  -->
  <script src="js/vendor/jquery.js"></script>  
  <!-- Form validation -->
  <script type="text/javascript">
function MM_findObj(n, d) {
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_validateForm() {
  var i,p,q,nm,test,num,min,max,errors='',args=MM_validateForm.arguments;
  for (i=0; i<(args.length-2); i+=3) { test=args[i+2]; val=MM_findObj(args[i]);
    if (val) { nm=val.name; if ((val=val.value)!="") {
      if (test.indexOf('isEmail')!=-1) { p=val.indexOf('@');
        if (p<1 || p==(val.length-1)) errors+='- '+nm+' .\n';
      } else if (test!='R') { num = parseFloat(val);
        if (isNaN(val)) errors+='- '+nm+' must contain a number.\n';
        if (test.indexOf('inRange') != -1) { p=test.indexOf(':');
          min=test.substring(8,p); max=test.substring(p+1);
          if (num<min || max<num) errors+='- '+nm+' must contain a number between '+min+' and '+max+'.\n';
    } } } else if (test.charAt(0) == 'R') errors += '- '+nm+' is required.\n'; }
  } if (errors) alert('The following error(s) occurred:\n'+errors);
  document.MM_returnValue = (errors == '');
}
  </script>
</head>
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
                                <a href="#"></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            
        </div>
<!--        <div class="se-pre-con"></div>
    <div id="wrapper">
     <div class="container">
         Verification form
      <form action="VerifyVoter" method="POST" name="VerifyForm" autocomplete="off" class="form-inline">
        <h3>Voter Verification</h3>

        <br>

        	<div class="form-group">
               <label for="idcard">ID Card Number</label>
               <input type="text" class="form-control validate[required,custom[onlyNumber],length[0,8]]" id="IDNum" name="id_number" placeholder="ID Card Number">
            </div>

            <div class="form-group">
               <label for="voterid">Voter ID</label>
               <input type="text" class="form-control validate[required,custom[onlyNumber],length[0,8]]" id="VoterID" name="voter_id" placeholder="Voter ID" value='<%=request.getParameter("voter_id")%>'>
            </div>
            <button type="submit" class="btn btn-default" id="verify" role="button" onclick="MM_validateForm('id_number','','R','voter_id','','R');return document.MM_returnValue">Verify</button>
        </form>
      <br>
</div>      
 voting form 
<div class="container">
<form id="voting-form" name="VotingForm" autocomplete="off" class="form-group" onsubmit="return castVote(this)">
<p id="contact-success" class="text-success lead"></p>
<p id="contact-error" class="text-danger lead"></p>
<div class="row">
   column 1 president 
  <div class="col-md-3">
    <span><h3>President</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="president">
      <option value="default" selected disabled>Select President</option>
 
<option value=""></option> 


    </select>
  </div>
   column 2 governor 
  <div class="col-md-3">
    <span><h3>Governor</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="governor">
      <option value="default" selected disabled>Select Governor</option>
<option value=""></option> 
    </select>
  </div>
 column 3 MP 
  <div class="col-md-3">
    <span><h3>Member of Parliament</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="mp">
      <option value="default" selected disabled>Select MP</option>
 
<option value=""></option> 

    </select>
  </div>
 column 4 councillor 
  <div class="col-md-3">
    <span><h3>County Rep</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="councillor">
      <option value="default" selected disabled>Select Councillor</option> 
<option value=""></option> 

    </select>
  </div>
<br>

  <div class="form-inline" id="serial">
        <label for="pres">Vote Serial Number</label>
        <input type="text" class="form-control" id="voteserial" name="vote_serial"  value='<%="VT"+(int)(Math.random()*10000)%>' readonly>
  </div>
  <br>
  <button type="submit" class="btn btn-default" id="cast-vote">Cast Vote</button>
</div>
</form>
     </div>
   processing voting data to firebase
  <script>
    // Send message
    var votingForm = document.getElementById('voting-form');
    var contactSuccess = document.getElementById('contact-success');
    var contactError = document.getElementById('contact-error');
    var sendBtn = document.getElementById('cast-vote');
    var onMessageComplete = function(error) {
      sendBtn.disabled = false;
      if (error) {
        contactError.innerHTML = 'Sorry. Could not cast vote.';
      } else {
        contactSuccess.innerHTML = "Your vote has been cast.";
        // hide the form
//        votingForm.style.display = 'none';
      }
    };
    function castVote(formObj) {
        // Store votes to firebase
        var myFirebaseRef = new Firebase("https://electiondata.firebaseio.com/votes");
        myFirebaseRef.push({
          president: formObj.president.value,
          governor: formObj.governor.value,
          mp: formObj.mp.value,
          councillor: formObj.councillor.value,
          voteserial: formObj.voteserial.value
        }, onMessageComplete);
        sendBtn.disabled = true;
        return false;
    }
</script>-->

    </div>                
    </body>
</html>

