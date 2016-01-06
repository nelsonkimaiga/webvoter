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
<!--loading icons-->
<script>
    $(window).load(function() {
		// Animate loader off screen
		$(".se-pre-con").fadeOut("slow");;
	});
</script>
<!--xmlHTTP Request script-->
<script type="text/javascript"> 
function showEmp(name){ 
if(document.getElementById("").value!="-1"){ 
xmlHttp=GetXmlHttpObject() 
if (xmlHttp==null){ 
alert ("Browser does not support HTTP Request") 
return 
} 
var url="getvalue.jsp" 
url=url+"?name="+name 
xmlHttp.onreadystatechange=stateChanged 
xmlHttp.open("GET",url,true) 
xmlHttp.send(null) 
} 
else{ 
alert("Please Select Employee Id"); 
} 
} 
function stateChanged(){ 
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete") { 
var showdata = xmlHttp.responseText; 
var strar = showdata.split(":"); 
document.getElementById("no").value= strar[1]; 
document.getElementById("manager").value= strar[2]; 
} 
} 

function GetXmlHttpObject(){ 
var xmlHttp=null; 
try{ 
xmlHttp=new XMLHttpRequest(); 
} 
catch (e) { 
try { 
xmlHttp=new ActiveXObject("Msxml2.XMLHTTP"); 
} 
catch (e) { 
xmlHttp=new ActiveXObject("Microsoft.XMLHTTP"); 
} 
} 
return xmlHttp; 
} 
</script> 
</head>
    <body>
        <div class="se-pre-con"></div>
    <div id="wrapper">
     <div class="container">
        <!-- Verification form-->
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
<!-- voting form -->
<div class="container">
<form id="voting-form" name="VotingForm" autocomplete="off" class="form-group">
<p id="contact-success" class="text-success lead"></p>
<p id="contact-error" class="text-danger lead"></p>
<div class="row">
  <!-- column 1 president -->
  <div class="col-md-3">
    <span><h3>President</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="president">
      <option value="default" selected>Select President</option>
      <% 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/uchaguzi","root",""); 
String query = "select Fname, Lname FROM candidates where post ='president'"; 

Statement st = conn.createStatement(); 
ResultSet rs = st.executeQuery(query); 
while(rs.next()) 
{ 
%> 
<option value="<%=rs.getString("Fname")+" "+ rs.getString("Lname")%>"><%=rs.getString("Fname")+" "+ rs.getString("Lname")%></option> 
<% 
}
%>

    </select>
  </div>
  <!-- column 2 governor -->
  <div class="col-md-3">
    <span><h3>Governor</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="governor">
      <option value="default" selected>Select Governor</option>
            <% 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

Connection conn2 = DriverManager.getConnection( "jdbc:mysql://localhost:3306/uchaguzi","root",""); 
String query2 = "select Fname, Lname FROM candidates where post ='governor'"; 

Statement s = conn2.createStatement(); 
ResultSet rs2 = s.executeQuery(query2); 
while(rs2.next()) 
{ 
%> 
<option value="<%=rs2.getString("Lname")%>"><%=rs2.getString("Fname")+" "+ rs2.getString("Lname")%></option> 
<% 
}
%>
    </select>
  </div>
<!-- column 3 MP -->
  <div class="col-md-3">
    <span><h3>Member of Parliament</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="mp">
      <option value="default" selected>Select MP</option>
             <% 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

Connection conn3 = DriverManager.getConnection( "jdbc:mysql://localhost:3306/uchaguzi","root",""); 
String query3 = "select Fname, Lname FROM candidates where post ='MP'"; 

Statement s2 = conn3.createStatement(); 
ResultSet rs3 = s2.executeQuery(query3); 
while(rs3.next()) 
{ 
%> 
<option value="<%=rs3.getString("Lname")%>"><%=rs3.getString("Fname")+" "+ rs3.getString("Lname")%></option> 
<% 
}
%>
    </select>
  </div>
<!-- column 4 councillor -->
  <div class="col-md-3">
    <span><h3>County Rep</h3></span>
    <img src="" class="img-rounded">
    <br>
    <select class="form-control" name="councillor">
      <option value="default" selected>Select Councillor</option>
                   <% 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

Connection conn4 = DriverManager.getConnection( "jdbc:mysql://localhost:3306/uchaguzi","root",""); 
String query4 = "select Fname, Lname FROM candidates where post ='MP'"; 

Statement s3 = conn4.createStatement(); 
ResultSet rs4 = s3.executeQuery(query4); 
while(rs4.next()) 
{ 
%> 
<option value="<%=rs4.getString("Lname")%>"><%=rs4.getString("Fname")+" "+ rs4.getString("Lname")%></option> 
<% 
}
%>
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
  <!-- processing voting data to firebase-->
  <script>
    // Send message
    var votingForm = document.getElementById('voting-form');
    var contactSuccess = document.getElementById('contact-success');
    var contactError = document.getElementById('contact-error');
    var sendBtn = document.getElementById('cast-vote');
    var onMessageComplete = function(error) {
      sendBtn.disabled = false;
      if (error) {
        contactError.innerHTML = 'Sorry. Could not send message.';
      } else {
        contactSuccess.innerHTML = "Message has been sent.";
        // hide the form
        votingForm.style.display = 'none';
      }
    };
    function sendMessage(formObj) {
        // Store votes to firebase
        var myFirebaseRef = new Firebase("https://healthdata.firebaseio.com/messages");
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
</script>

    </div>                
    </body>
</html>

