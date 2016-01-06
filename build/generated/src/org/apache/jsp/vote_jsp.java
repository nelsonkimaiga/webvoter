package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class vote_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   <title>E-Voter|Vote</title>\n");
      out.write("   <!-- firebase API -->\n");
      out.write("   <script src=\"https://cdn.firebase.com/js/client/2.3.2/firebase.js\"></script>\n");
      out.write("  <!-- Bootstrap -->\n");
      out.write("  <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- font-awsome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome.min.css\">\n");
      out.write("  <!-- fonts -->\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("  \t<!-- JavaScript  -->\n");
      out.write("  <script src=\"js/jquery-1.11.3.min.js\"></script>\n");
      out.write("  <script src=\"js/modernizr.js\"></script>\n");
      out.write("  \n");
      out.write("  <!-- Form validation -->\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("function MM_findObj(n, d) {\n");
      out.write("  var p,i,x;  if(!d) d=document; if((p=n.indexOf(\"?\"))>0&&parent.frames.length) {\n");
      out.write("    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}\n");
      out.write("  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];\n");
      out.write("  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);\n");
      out.write("  if(!x && d.getElementById) x=d.getElementById(n); return x;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function MM_validateForm() {\n");
      out.write("  var i,p,q,nm,test,num,min,max,errors='',args=MM_validateForm.arguments;\n");
      out.write("  for (i=0; i<(args.length-2); i+=3) { test=args[i+2]; val=MM_findObj(args[i]);\n");
      out.write("    if (val) { nm=val.name; if ((val=val.value)!=\"\") {\n");
      out.write("      if (test.indexOf('isEmail')!=-1) { p=val.indexOf('@');\n");
      out.write("        if (p<1 || p==(val.length-1)) errors+='- '+nm+' .\\n';\n");
      out.write("      } else if (test!='R') { num = parseFloat(val);\n");
      out.write("        if (isNaN(val)) errors+='- '+nm+' must contain a number.\\n';\n");
      out.write("        if (test.indexOf('inRange') != -1) { p=test.indexOf(':');\n");
      out.write("          min=test.substring(8,p); max=test.substring(p+1);\n");
      out.write("          if (num<min || max<num) errors+='- '+nm+' must contain a number between '+min+' and '+max+'.\\n';\n");
      out.write("    } } } else if (test.charAt(0) == 'R') errors += '- '+nm+' is required.\\n'; }\n");
      out.write("  } if (errors) alert('The following error(s) occurred:\\n'+errors);\n");
      out.write("  document.MM_returnValue = (errors == '');\n");
      out.write("}\n");
      out.write("  </script>\n");
      out.write("<!--loading icons-->\n");
      out.write("<script>\n");
      out.write("    $(window).load(function() {\n");
      out.write("\t\t// Animate loader off screen\n");
      out.write("\t\t$(\".se-pre-con\").fadeOut(\"slow\");;\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!--xmlHTTP Request script-->\n");
      out.write("<script type=\"text/javascript\"> \n");
      out.write("function showEmp(name){ \n");
      out.write("if(document.getElementById(\"\").value!=\"-1\"){ \n");
      out.write("xmlHttp=GetXmlHttpObject() \n");
      out.write("if (xmlHttp==null){ \n");
      out.write("alert (\"Browser does not support HTTP Request\") \n");
      out.write("return \n");
      out.write("} \n");
      out.write("var url=\"getvalue.jsp\" \n");
      out.write("url=url+\"?name=\"+name \n");
      out.write("xmlHttp.onreadystatechange=stateChanged \n");
      out.write("xmlHttp.open(\"GET\",url,true) \n");
      out.write("xmlHttp.send(null) \n");
      out.write("} \n");
      out.write("else{ \n");
      out.write("alert(\"Please Select Employee Id\"); \n");
      out.write("} \n");
      out.write("} \n");
      out.write("function stateChanged(){ \n");
      out.write("if (xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\") { \n");
      out.write("var showdata = xmlHttp.responseText; \n");
      out.write("var strar = showdata.split(\":\"); \n");
      out.write("document.getElementById(\"no\").value= strar[1]; \n");
      out.write("document.getElementById(\"manager\").value= strar[2]; \n");
      out.write("} \n");
      out.write("} \n");
      out.write("\n");
      out.write("function GetXmlHttpObject(){ \n");
      out.write("var xmlHttp=null; \n");
      out.write("try{ \n");
      out.write("xmlHttp=new XMLHttpRequest(); \n");
      out.write("} \n");
      out.write("catch (e) { \n");
      out.write("try { \n");
      out.write("xmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\"); \n");
      out.write("} \n");
      out.write("catch (e) { \n");
      out.write("xmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\"); \n");
      out.write("} \n");
      out.write("} \n");
      out.write("return xmlHttp; \n");
      out.write("} \n");
      out.write("</script> \n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"se-pre-con\"></div>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("        <!-- Verification form-->\n");
      out.write("      <form action=\"VerifyVoter\" method=\"POST\" name=\"VerifyForm\" autocomplete=\"off\" class=\"form-inline\">\n");
      out.write("        <h3>Voter Verification</h3>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        \t<div class=\"form-group\">\n");
      out.write("               <label for=\"idcard\">ID Card Number</label>\n");
      out.write("               <input type=\"text\" class=\"form-control validate[required,custom[onlyNumber],length[0,8]]\" id=\"IDNum\" name=\"id_number\" placeholder=\"ID Card Number\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               <label for=\"voterid\">Voter ID</label>\n");
      out.write("               <input type=\"text\" class=\"form-control validate[required,custom[onlyNumber],length[0,8]]\" id=\"VoterID\" name=\"voter_id\" placeholder=\"Voter ID\" value='");
      out.print(request.getParameter("voter_id"));
      out.write("'>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default\" id=\"verify\" role=\"button\" onclick=\"MM_validateForm('id_number','','R','voter_id','','R');return document.MM_returnValue\">Verify</button>\n");
      out.write("        </form>\n");
      out.write("      <br>\n");
      out.write("</div>      \n");
      out.write("<!-- voting form -->\n");
      out.write("<div class=\"container\">\n");
      out.write("<form id=\"voting-form\" name=\"VotingForm\" autocomplete=\"off\" class=\"form-group\" onsubmit=\"return castVote(this)\">\n");
      out.write("<p id=\"contact-success\" class=\"text-success lead\"></p>\n");
      out.write("<p id=\"contact-error\" class=\"text-danger lead\"></p>\n");
      out.write("<div class=\"row\">\n");
      out.write("  <!-- column 1 president -->\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>President</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"president\">\n");
      out.write("      <option value=\"default\" selected disabled>Select President</option>\n");
      out.write("      ");
 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/uchaguzi","root",""); 
String query = "select Fname, Lname FROM candidates where post ='president'"; 

Statement st = conn.createStatement(); 
ResultSet rs = st.executeQuery(query); 
while(rs.next()) 
{ 

      out.write(" \n");
      out.write("<option value=\"");
      out.print(rs.getString("Fname")+" "+ rs.getString("Lname"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("Fname")+" "+ rs.getString("Lname"));
      out.write("</option> \n");
 
}

      out.write("\n");
      out.write("\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("  <!-- column 2 governor -->\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>Governor</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"governor\">\n");
      out.write("      <option value=\"default\" selected disabled>Select Governor</option>\n");
      out.write("            ");
 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

Connection conn2 = DriverManager.getConnection( "jdbc:mysql://localhost:3306/uchaguzi","root",""); 
String query2 = "select Fname, Lname FROM candidates where post ='governor'"; 

Statement s = conn2.createStatement(); 
ResultSet rs2 = s.executeQuery(query2); 
while(rs2.next()) 
{ 

      out.write(" \n");
      out.write("<option value=\"");
      out.print(rs2.getString("Fname")+" "+ rs2.getString("Lname"));
      out.write('"');
      out.write('>');
      out.print(rs2.getString("Fname")+" "+ rs2.getString("Lname"));
      out.write("</option> \n");
 
}

      out.write("\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("<!-- column 3 MP -->\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>Member of Parliament</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"mp\">\n");
      out.write("      <option value=\"default\" selected disabled>Select MP</option>\n");
      out.write("             ");
 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

Connection conn3 = DriverManager.getConnection( "jdbc:mysql://localhost:3306/uchaguzi","root",""); 
String query3 = "select Fname, Lname FROM candidates where post ='MP'"; 

Statement s2 = conn3.createStatement(); 
ResultSet rs3 = s2.executeQuery(query3); 
while(rs3.next()) 
{ 

      out.write(" \n");
      out.write("<option value=\"");
      out.print(rs3.getString("Fname")+" "+ rs3.getString("Lname"));
      out.write('"');
      out.write('>');
      out.print(rs3.getString("Fname")+" "+ rs3.getString("Lname"));
      out.write("</option> \n");
 
}

      out.write("\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("<!-- column 4 councillor -->\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>County Rep</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"councillor\">\n");
      out.write("      <option value=\"default\" selected disabled>Select Councillor</option>\n");
      out.write("                   ");
 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

Connection conn4 = DriverManager.getConnection( "jdbc:mysql://localhost:3306/uchaguzi","root",""); 
String query4 = "select Fname, Lname FROM candidates where post ='MP'"; 

Statement s3 = conn4.createStatement(); 
ResultSet rs4 = s3.executeQuery(query4); 
while(rs4.next()) 
{ 

      out.write(" \n");
      out.write("<option value=\"");
      out.print(rs4.getString("Fname")+" "+ rs4.getString("Lname"));
      out.write('"');
      out.write('>');
      out.print(rs4.getString("Fname")+" "+ rs4.getString("Lname"));
      out.write("</option> \n");
 
}

      out.write("\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("  <div class=\"form-inline\" id=\"serial\">\n");
      out.write("        <label for=\"pres\">Vote Serial Number</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"voteserial\" name=\"vote_serial\"  value='");
      out.print("VT"+(int)(Math.random()*10000));
      out.write("' readonly>\n");
      out.write("  </div>\n");
      out.write("  <br>\n");
      out.write("  <button type=\"submit\" class=\"btn btn-default\" id=\"cast-vote\">Cast Vote</button>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("     </div>\n");
      out.write("  <!-- processing voting data to firebase-->\n");
      out.write("  <script>\n");
      out.write("    // Send message\n");
      out.write("    var votingForm = document.getElementById('voting-form');\n");
      out.write("    var contactSuccess = document.getElementById('contact-success');\n");
      out.write("    var contactError = document.getElementById('contact-error');\n");
      out.write("    var sendBtn = document.getElementById('cast-vote');\n");
      out.write("    var onMessageComplete = function(error) {\n");
      out.write("      sendBtn.disabled = false;\n");
      out.write("      if (error) {\n");
      out.write("        contactError.innerHTML = 'Sorry. Could not cast vote.';\n");
      out.write("      } else {\n");
      out.write("        contactSuccess.innerHTML = \"Your vote has been cast.\";\n");
      out.write("        // hide the form\n");
      out.write("//        votingForm.style.display = 'none';\n");
      out.write("      }\n");
      out.write("    };\n");
      out.write("    function castVote(formObj) {\n");
      out.write("        // Store votes to firebase\n");
      out.write("        var myFirebaseRef = new Firebase(\"https://electiondata.firebaseio.com/votes\");\n");
      out.write("        myFirebaseRef.push({\n");
      out.write("          president: formObj.president.value,\n");
      out.write("          governor: formObj.governor.value,\n");
      out.write("          mp: formObj.mp.value,\n");
      out.write("          councillor: formObj.councillor.value,\n");
      out.write("          voteserial: formObj.voteserial.value\n");
      out.write("        }, onMessageComplete);\n");
      out.write("        sendBtn.disabled = true;\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </div>                \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
