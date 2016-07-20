package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Start Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/foundation.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/app.css\">\n");
      out.write("    <!--font-awsome-->\n");
      out.write("    <link rel=\"stylesheet\" href='https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css'>\n");
      out.write("    <!-- fonts -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("    <script src=\"js/vendor/jquery.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function validateForm(){\n");
      out.write("            var x = document.forms[\"loginForm\"][\"voterid\"].value;\n");
      out.write("            \n");
      out.write("        if (x == null || x == \"\") {\n");
      out.write("            alert(\"Name must be filled out\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("                \n");
      out.write("    </script>            \n");
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
      out.write("            <br>\n");
      out.write("            <div class=\"row bodycontent\">\n");
      out.write("                <div class=\"small-12 large-4 medium-4 columns\" id=\"loginform\">\n");
      out.write("                    <h6>Are you registered as a voter?</h6>\n");
      out.write("                    <form action=\"\" method=\"post\" onsubmit=\"return validateForm()\" name=\"loginForm\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <label>Enter your voter ID number</label>\n");
      out.write("                            <input type=\"text\" name=\"voterid\" placeholder=\"VOTER ID\">\n");
      out.write("                        </fieldset>\n");
      out.write("                        <button type=\"submit\" class=\"button success\">Continue</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"medium-4 columns\">\n");
      out.write("                    <div id=\"movingicon\">\n");
      out.write("                                \n");
      out.write("                    </div>                        \n");
      out.write("                </div>                    \n");
      out.write("            </div>           \n");
      out.write("        </div>\n");
      out.write("        <!-- countdown timer -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $('#countdown').countdown('2017/08/01', function(event) {\n");
      out.write("                $(this).html(event.strftime('Count down to the General Election: %w weeks %d days %H:%M:%S'));\n");
      out.write("            });\n");
      out.write("                </script>\n");
      out.write("        <script src=\"js/vendor/foundation.js\"></script>\n");
      out.write("        <script src=\"js/vendor/what-input.js\"></script>\n");
      out.write("        <script src=\"js/jquery.countdown.min.js\"></script>\n");
      out.write("        <script src=\"js/app.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
