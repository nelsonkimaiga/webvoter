package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candidates_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Candidate Registration</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/foundation.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/app.css\">\n");
      out.write("    <!--font-awesome-->\n");
      out.write("    <link rel=\"stylesheet\" href='https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css'>\n");
      out.write("    <!-- fonts -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function MM_findObj(n, d) {\n");
      out.write("            var p,i,x;  if(!d) d=document; if((p=n.indexOf(\"?\"))>0&&parent.frames.length) {\n");
      out.write("                d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}\n");
      out.write("            if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];\n");
      out.write("            for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);\n");
      out.write("            if(!x && d.getElementById) x=d.getElementById(n); return x;\n");
      out.write("        }\n");
      out.write("        function MM_validateForm() {\n");
      out.write("            var i,p,q,nm,test,num,min,max,errors='',args=MM_validateForm.arguments;\n");
      out.write("            for (i=0; i<(args.length-2); i+=3) { test=args[i+2]; val=MM_findObj(args[i]);\n");
      out.write("                if (val) { nm=val.name; if ((val=val.value)!=\"\") {\n");
      out.write("                        if (test.indexOf('isEmail')!=-1) { p=val.indexOf('@');\n");
      out.write("                            if (p<1 || p==(val.length-1)) errors+='- '+nm+' .\\n';\n");
      out.write("        } else if (test!='R') { num = parseFloat(val);\n");
      out.write("            if (isNaN(val)) errors+='- '+nm+' must contain a number.\\n';\n");
      out.write("            if (test.indexOf('inRange') != -1) { p=test.indexOf(':');\n");
      out.write("                min=test.substring(8,p); max=test.substring(p+1);\n");
      out.write("                if (num<min || max<num) errors+='- '+nm+' must contain a number between '+min+' and '+max+'.\\n';\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    } else if (test.charAt(0) == 'R') errors += '- '+nm+' is required.\\n'; }\n");
      out.write("    } if (errors) alert('The following error(s) occurred:\\n'+errors);\n");
      out.write("    document.MM_returnValue = (errors == '');\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"nav \">\n");
      out.write("            <div class=\"nav-center\">\n");
      out.write("                <a class=\"toggle-nav\" href=\"#\">&#9776;</a>\n");
      out.write("                <div class=\"nav-mobile\">\n");
      out.write("                    <ul class=\"left\">\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <li><a href=\"\">Election Management</a></li>\n");
      out.write("                        <li><a href=\"\"></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"right\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Candidate Bios</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"logout.jsp\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container bodycontent\">\n");
      out.write("            <div class=\"large-8 columns large-centered\">\n");
      out.write("                <h6 id=\"registertext\">Candidate Details</h6>\n");
      out.write("                <form action=\"\" method=\"post\" name=\"candidateForm\">\n");
      out.write("                    <fieldset>\n");
      out.write("                        <label>Full Names</label>\n");
      out.write("                        <input type=\"text\" name=\"fullname\" placeholder=\"Full Names\">\n");
      out.write("                    </fieldset>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <label>Party/Coalition</label>\n");
      out.write("                        <select name=\"party\">\n");
      out.write("                            <option value=\"default\" disabled selected>Party</option>\n");
      out.write("                        </select>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <label>Candidature(POST)</label>\n");
      out.write("                        <select name=\"post\">\n");
      out.write("                            <option value=\"default\" disabled selected>POST</option>\n");
      out.write("                            <option value=\"CORD\">CORD</option>\n");
      out.write("                        </select>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <fieldset>\n");
      out.write("                        <label>Photo</label>\n");
      out.write("                        <input type=\"file\" name=\"photo\">\n");
      out.write("                    </fieldset>\n");
      out.write("                    <button type=\"submit\" class=\"button success\" onclick=\"MM_validateForm('fullname','','R', 'party','','R', 'post','','R', 'photo','','R');return document.MM_returnValue\">REGISTER CANDIDATE</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
