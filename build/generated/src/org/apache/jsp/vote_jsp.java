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
      out.write("  <!-- fonts -->\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("  \t<!-- JavaScript  -->\n");
      out.write("  <script src=\"js/jquery-1.11.3.min.js\"></script>\n");
      out.write("  <script src=\"js/modernizr.js\"></script>\n");
      out.write("  <script type=\"text/javascript\"><!--\n");
      out.write("      function init(){\n");
      out.write("        alert('");
      out.print("Error");
      out.write("');\n");
      out.write("        window.location.replace('javascript:\"\"');\n");
      out.write("      }\n");
      out.write("    //--></script>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("        <!-- Verification form and voting section -->\n");
      out.write("        <form action=\"vote\" method=\"POST\" name=\"VotingForm\" autocomplete=\"off\" class=\"form-inline\">\n");
      out.write("        <h3>Voter Verification</h3>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        \t<div class=\"form-group\">\n");
      out.write("               <label for=\"idcard\">ID Card Number</label>\n");
      out.write("               <input type=\"text\" class=\"form-control\" id=\"IDNum\" name=\"id_number\" placeholder=\"ID Card Number\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               <label for=\"voterid\">Voter ID</label>\n");
      out.write("               <input type=\"text\" class=\"form-control\" id=\"VoterID\" name=\"voter_id\" placeholder=\"Voter ID\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn-primary\" onsubmit=\"init();\">Verify</button>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("<h3>Proceed to Start Voting</h3>\n");
      out.write("           <label for=\"pres\">President</label>\n");
      out.write("\t\t<select class=\"form-control\" name=\"president\">\n");
      out.write("        \t\t<option value=\"uhuru\">Uhuru Kenyatta</option>\n");
      out.write("        \t\t<option value=\"Raila\">Raila Amolo Odinga</option>\n");
      out.write("        \t\t<option value=\"Ruto\">William Ruto</option>\n");
      out.write("     \t\t</select>\n");
      out.write("\n");
      out.write("     \t<label for=\"gov\">Governor</label>\n");
      out.write("     \t\t<select class=\"form-control\" name=\"governor\">\n");
      out.write("        \t\t<option value=\"kidero\">Evans Kidero</option>\n");
      out.write("        \t\t<option value=\"\"></option>\n");
      out.write("        \t\t<option value=\"\"></option>\n");
      out.write("     \t\t</select>\n");
      out.write("\n");
      out.write("     \t<label for=\"mp\">MP</label>\n");
      out.write("     \t\t<select class=\"form-control\" name=\"mp\">\n");
      out.write("        \t\t<option value=\"mbuvi\">Gideon Mbuvi</option>\n");
      out.write("        \t\t<option value=\"\"></option>\n");
      out.write("        \t\t<option value=\"\"></option>\n");
      out.write("     \t\t</select>\n");
      out.write("\n");
      out.write("     \t<label for=\"councillor\">Councillor</label>\t\n");
      out.write("     \t\t<select class=\"form-control\" name=\"councillor\">\n");
      out.write("        \t\t<option value=\"kabogo\">William Kabogo</option>\n");
      out.write("        \t\t<option value=\"\"></option>\n");
      out.write("        \t\t<option value=\"\"></option>\n");
      out.write("     \t\t</select>\n");
      out.write("\n");
      out.write("     \t<div class=\"form-horizontal\">\n");
      out.write("     \t<br>     \t\t\n");
      out.write("     \t\t<div class=\"form-goup\">\n");
      out.write("     \t\t<label for=\"pres\">Vote Serial Number</label>\n");
      out.write("     \t\t<input type=\"text\" class=\"form-control\" id=\"voteserial\" name=\"vote_serial\" value='");
      out.print("VT"+(int)(Math.random()*10000));
      out.write("'>\t\n");
      out.write("     \t\t</div>\n");
      out.write("     \t<br>\n");
      out.write("        <button type=\"submit\" class=\"btn-primary\">Cast Vote</button>\n");
      out.write("     \t</div>\n");
      out.write("        </form>\n");
      out.write("     </div>\n");
      out.write("    </div>               \n");
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
