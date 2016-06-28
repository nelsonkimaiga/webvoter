package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html class=\"no-js\" lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Administration</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/foundation.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/app.css\">\n");
      out.write("    <!-- fonts -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("    <script src=\"js/vendor/jquery.js\"></script>\n");
      out.write("  </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"nav \">\n");
      out.write("            <div class=\"nav-center\">\n");
      out.write("                <a class=\"toggle-nav\" href=\"#\">&#9776;</a>\n");
      out.write("                <div class=\"nav-mobile\">\n");
      out.write("                    <ul class=\"left\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-home\"></i> Home</a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-book\"></i>Election Management</a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-fire\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"right\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-user\"></i>Candidate Bios</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"logout.jsp\"><i class=\"fa fa-envelope\">Logout</i></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container bodycontent\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"large-6 large-centered columns\">\n");
      out.write("                    <a href=\"\">Candidate Registration</a>\n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"\">Electoral Boundaries</a>\n");
      out.write("                    <hr>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
