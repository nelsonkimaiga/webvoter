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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   <title>E-Voter|Vote</title>\n");
      out.write("  <!-- Bootstrap -->\n");
      out.write("  <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- font-awsome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("  <!-- fonts -->\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("    <!-- JavaScript  -->\n");
      out.write("  <script src=\"js/jquery-1.11.3.min.js\"></script>\n");
      out.write("  <script src=\"js/modernizr.js\"></script>\n");
      out.write("  \n");
      out.write("  <!--Session initializer-->\n");
      out.write("<body>\n");
      out.write("<!-- container div -->\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("<p>Verify Your Voter ID details in order to proceed</p>\n");
      out.write("    <!-- Verification form -->\n");
      out.write("<div class=\"row\">\n");
      out.write(" <div class=\".col-md-6\">\n");
      out.write("  <form class=\"form-inline\" action=\"VerifyVoter\" method=\"POST\">\n");
      out.write("   <div class=\"form-group\">\n");
      out.write("    <label for=\"idNumber\">ID NO:</label>\n");
      out.write("     <input type=\"text\" name=\"id_number\" class=\"form-control\" id=\"idNo\" placeholder=\"ID Number\">\n");
      out.write("    </div>\n");
      out.write("   <!--<button type=\"submit\" class=\"btn-default\">Verify</button>-->\n");
      out.write("   <input type=\"submit\" value=\"Verify\" />\n");
      out.write("  </form>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("<!-- image place-holders  -->\n");
      out.write("<div class=\"row\">\n");
      out.write("  <!-- applying the four-column grid system -->\n");
      out.write("  <!-- grid 1 -->\n");
      out.write("  <div class=\"col-xs-6 col-sm-3\">\n");
      out.write("      <h3>President</h3>\n");
      out.write("      <img src=\"\" id=\"president\" class=\"img-rounded\">\n");
      out.write("      \n");
      out.write("<!--  Calling my Drop-down populating function    -->\n");
      out.write("\n");
      out.write("      <!-- drop-down menu populates with presidential candidates from the database-->\n");
      out.write("  <form action=\"SavePresident\" method=\"POST\">   \n");
      out.write("      <select class=\"form-control\" name=\"president\">\n");
      out.write("        <option value=\"Uhuru_kenyatta\">Uhuru Kenyatta</option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("     </select>\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary\">Vote</button>\n");
      out.write("  </form>   \n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("  <!-- grid 2 -->\n");
      out.write("   <div class=\"col-xs-6 col-sm-3\">\n");
      out.write("      <h3>Governor</h3>\n");
      out.write("      <img src=\"\" id=\"governor\" class=\"img-rounded\">\n");
      out.write("      <!-- drop-down menu populates with gubernatorial candidates-->\n");
      out.write("      <select class=\"form-control\">\n");
      out.write("        <option>Evans Kidero</option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("     </select>\n");
      out.write("  </div>\n");
      out.write("  <!-- grid 3 -->\n");
      out.write("   <div class=\"col-xs-6 col-sm-3\">\n");
      out.write("      <h3>Member of Parliament</h3>\n");
      out.write("      <img src=\"\" id=\"mp\" class=\"img-rounded\">\n");
      out.write("      <!-- drop-down menu populates with parliamentary candidates-->\n");
      out.write("      <select class=\"form-control\">\n");
      out.write("        <option>Nelson Kimaiga</option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("     </select>\n");
      out.write("  </div>\n");
      out.write("  <!-- grid 4 -->\n");
      out.write("   <div class=\"col-xs-6 col-sm-3\">\n");
      out.write("      <h3>Councillor</h3>\n");
      out.write("      <img src=\"\" id=\"mca\" class=\"img-rounded\">\n");
      out.write("      <!-- drop-down menu populates with county-rep candidates-->\n");
      out.write("      <select class=\"form-control\">\n");
      out.write("        <option>Mbuvi Sonko</option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("        <option></option>\n");
      out.write("     </select>\n");
      out.write("  </div>\n");
      out.write("<!-- end of grids -->\n");
      out.write("</div>\n");
      out.write("<!-- end of row -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<!-- Vote serial id textbox -->\n");
      out.write("<div class=\"row\">\n");
      out.write(" <div class=\".col-md-6\">\n");
      out.write("  <form class=\"form-inline\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"VoteSerial\">Vote Serial Number:</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"voteserial\">\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--<button type=\"button\" class=\"btn btn-primary\">Vote</button>-->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!--</div>-->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
