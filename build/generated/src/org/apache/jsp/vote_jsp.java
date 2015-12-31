package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("  <!-- Ajax Event -->\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $( document ).ajaxError(function() {\n");
      out.write("  $( \".verifyform\" ).text( \"Triggered ajaxError handler.\" );\n");
      out.write("});\n");
      out.write("\n");
      out.write("$( \"button.verifydetails\" ).on( \"click\", function() {\n");
      out.write("  $( \"div.result\" ).load( \"ajax/missing.html\" );\n");
      out.write("});\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("     <div class=\"container verifyform\">\n");
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
      out.write("               <input type=\"text\" class=\"form-control validate[required,custom[onlyNumber],length[0,8]]\" id=\"VoterID\" name=\"voter_id\" placeholder=\"Voter ID\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default verifydetails\" id=\"verify\" role=\"button\">Verify</button>\n");
      out.write("        </form>\n");
      out.write("      <br>\n");
      out.write("</div>      \n");
      out.write("<!-- voting form -->\n");
      out.write("<div class=\"container\">\n");
      out.write("<form action=\"Vote\" method=\"POST\" name=\"VotingForm\" autocomplete=\"off\" class=\"form-group\">\n");
      out.write("<div class=\"row\">\n");
      out.write("  <!-- column 1 president -->\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>President</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"president\">\n");
      out.write("      <option value=\"default\" selected>Select President</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("  <!-- column 2 governor -->\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>Governor</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"governor\">\n");
      out.write("      <option value=\"default\" selected>Select Governor</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("<!-- column 3 MP -->\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>Member of Parliament</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"MP\">\n");
      out.write("      <option value=\"default\" selected>Select MP</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("<!-- column 4 councillor -->\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("    <span><h3>County Rep</h3></span>\n");
      out.write("    <img src=\"\" class=\"img-rounded\">\n");
      out.write("    <br>\n");
      out.write("    <select class=\"form-control\" name=\"councillor\">\n");
      out.write("      <option value=\"default\" selected>Select Councillor</option>\n");
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
      out.write("  <button type=\"submit\" class=\"btn btn-default\" id=\"castvote\">Cast Vote</button>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("     </div>\n");
      out.write("    </div>\n");
      out.write("<script src=\"js/ajax.js\"></script>                  \n");
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
