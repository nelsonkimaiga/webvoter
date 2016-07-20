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
            }
        }
    } else if (test.charAt(0) == 'R') errors += '- '+nm+' is required.\n'; }
    } if (errors) alert('The following error(s) occurred:\n'+errors);
    document.MM_returnValue = (errors == '');
    }
    </script>
  </head>
    <body>
        <nav class="nav ">
            <div class="nav-center">
                <a class="toggle-nav" href="#">&#9776;</a>
                <div class="nav-mobile">
                    <ul class="left">
                        <li><a href="#">Home</a></li>
                        <li><a href="">Election Management</a></li>
                        <li><a href=""></a></li>
                    </ul>
                    <ul class="right">
                        <li>
                            <a href="#">Candidate Bios</a>
                        </li>
                        <li>
                            <a href="logout.jsp">Logout</a>
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
                        <input type="file" name="photo">
                    </fieldset>
                    <button type="submit" class="button success" onclick="MM_validateForm('fullname','','R', 'party','','R', 'post','','R', 'photo','','R');return document.MM_returnValue">REGISTER CANDIDATE</button>
                </form>
            </div>
        </div>
        
        <script src="js/vendor/foundation.js"></script>
        <script src="js/vendor/what-input.js"></script>
        <script src="js/jquery.countdown.min.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>
