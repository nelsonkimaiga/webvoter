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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   <title>E-Voter|Vote</title>\n");
      out.write("   <!-- firebase API -->\n");
      out.write("   <script src=\"https://cdn.firebase.com/js/client/2.3.2/firebase.js\"></script>\n");
      out.write("  <!-- Bootstrap -->\n");
      out.write("  <link href=\"css/foundation.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/app.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- fonts -->\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("  \t<!-- JavaScript  -->\n");
      out.write("  <script src=\"js/vendor/jquery.js\"></script>  \n");
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
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <nav class=\"nav \">\n");
      out.write("                <div class=\"nav-center\">\n");
      out.write("                    <a class=\"toggle-nav\" href=\"#\">&#9776;</a>\n");
      out.write("                    <div class=\"nav-mobile\">\n");
      out.write("                        <ul class=\"left\">\n");
      out.write("                            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            <li><a href=\"register.jsp\">Voter Registration</a></li>\n");
      out.write("                            <li><a href=\"vote.jsp\">Cast Your Vote</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"right\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Candidate Bios</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\"></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("<!--        <div class=\"se-pre-con\"></div>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("         Verification form\n");
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
      out.write(" voting form \n");
      out.write("<div class=\"container\">\n");
      out.write("<form id=\"voting-form\" name=\"VotingForm\" autocomplete=\"off\" class=\"form-group\" onsubmit=\"return castVote(this)\">\n");
      out.write("<p id=\"contact-success\" class=\"text-success lead\"></p>\n");
      out.write("<p id=\"contact-error\" class=\"text-danger lead\"></p>\n");
      out.write("<div class=\"row\">\n");
      out.write("   column 1 president \n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>President</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"president\">\n");
      out.write("      <option value=\"default\" selected disabled>Select President</option>\n");
      out.write(" \n");
      out.write("<option value=\"\"></option> \n");
      out.write("\n");
      out.write("\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("   column 2 governor \n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>Governor</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"governor\">\n");
      out.write("      <option value=\"default\" selected disabled>Select Governor</option>\n");
      out.write("<option value=\"\"></option> \n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write(" column 3 MP \n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>Member of Parliament</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"mp\">\n");
      out.write("      <option value=\"default\" selected disabled>Select MP</option>\n");
      out.write(" \n");
      out.write("<option value=\"\"></option> \n");
      out.write("\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write(" column 4 councillor \n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>County Rep</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"councillor\">\n");
      out.write("      <option value=\"default\" selected disabled>Select Councillor</option> \n");
      out.write("<option value=\"\"></option> \n");
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
      out.write("   processing voting data to firebase\n");
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
      out.write("</script>-->\n");
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
