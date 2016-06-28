package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class electoral_002dboundaries_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <div class=\"small-12 medium-8 large-4 columns\">\n");
      out.write("                    <h6>County</h6>\n");
      out.write("                    <form action=\"\" method=\"\" name=\"\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <label>County ID</label>\n");
      out.write("                            <input type=\"text\" value='");
      out.print("COUN"+(int) (Math.random()*200));
      out.write("'>\n");
      out.write("                        </fieldset>\n");
      out.write("                        <fieldset>\n");
      out.write("                            <label>Name</label>\n");
      out.write("                            <select name=\"countyname\">\n");
      out.write("                                <option value=\"default\" disabled=\"true\" selected=\"true\">County Name</option>\n");
      out.write("                            </select>\n");
      out.write("                        </fieldset>\n");
      out.write("                        <button type=\"submit\" class=\"button secondary\">Save</button>\n");
      out.write("                    </form>\n");
      out.write("                        <hr>\n");
      out.write("                        <h6>Constituency</h6>\n");
      out.write("                        <form action=\"\" method=\"\" name=\"\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <label>County ID</label>\n");
      out.write("                                <input type=\"text\" value='");
      out.print("CONS"+(int) (Math.random()*200));
      out.write("'>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <fieldset>\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <select name=\"constituencyname\">\n");
      out.write("                                    <option value=\"default\" disabled=\"true\" selected=\"true\">Constituency Name</option>\n");
      out.write("                                </select>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <button type=\"submit\" class=\"button secondary\">Save</button>\n");
      out.write("                    </form>\n");
      out.write("                            <hr>\n");
      out.write("                            <h6>Ward</h6>\n");
      out.write("                            <form action=\"\" method=\"\" name=\"\">\n");
      out.write("                                <fieldset>\n");
      out.write("                                    <label>Ward ID</label>\n");
      out.write("                                    <input type=\"text\" value='");
      out.print("WARD"+(int) (Math.random()*200));
      out.write("'>\n");
      out.write("                                </fieldset>\n");
      out.write("                                <fieldset>\n");
      out.write("                                    <label>Name</label>\n");
      out.write("                                    <select name=\"wardname\">\n");
      out.write("                                        <option value=\"default\" disabled=\"true\" selected=\"true\">Ward Name</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </fieldset>\n");
      out.write("                                <button type=\"submit\" class=\"button secondary\">Save</button>\n");
      out.write("                            </form>\n");
      out.write("                </div>\n");
      out.write("                                <!--election panel starts here-->\n");
      out.write("                                <div class=\"small-12 medium-12 large-8 columns\">\n");
      out.write("                                    <h6>Create a new election entry</h6>\n");
      out.write("                                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
