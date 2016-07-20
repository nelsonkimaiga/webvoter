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
    <title>Elections and Electoral Boundaries </title>
    <link rel="stylesheet" href="css/foundation.css">
    <link rel="stylesheet" href="css/app.css">
    <!-- fonts -->
    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
    <script src="js/vendor/jquery.js"></script>
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
                                <div class="small-12 medium-12 large-6 columns">
                                    <h6>Create a new election entry</h6>
                                    <form action="" method="post" name="electionForm">
                                        <fieldset>
                                            <label>Election ID</label>
                                            <input type="text" value='<%="EL"+(int) (Math.random()*800)%>' name="electionid">
                                        </fieldset>
                                        <fieldset>
                                            <label>Type of Election</label>
                                            <select name="electiontype">
                                                <option value="default" disabled selected>Choose an election type</option>
                                                <option value="General Election">General Election</option>
                                                <option value="By-Election">By-Election</option>
                                                <option value="Referendum">Referendum</option>
                                            </select>
                                        </fieldset>
                                        <button class="button secondary" type="submit" onclick="MM_validateForm('electionid','','R', 'electiontype','','R');return document.MM_returnValue">Create new Election</button>
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
