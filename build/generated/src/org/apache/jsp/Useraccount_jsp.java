package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Useraccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("            .navbar {\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                border-radius: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set height of the grid so .sidenav can be 100% (adjust as needed) */\n");
      out.write("            .row.content {height: 450px}\n");
      out.write("\n");
      out.write("            /* Set gray background color and 100% height */\n");
      out.write("            .sidenav {\n");
      out.write("                padding-top: 20px;\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set black background color, white text and some padding */\n");
      out.write("            footer {\n");
      out.write("                background-color: #555;\n");
      out.write("                color: white;\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* On small screens, set height to 'auto' for sidenav and grid */\n");
      out.write("            @media screen and (max-width: 767px) {\n");
      out.write("                .sidenav {\n");
      out.write("                    height: auto;\n");
      out.write("                    padding: 15px;\n");
      out.write("                }\n");
      out.write("                .row.content {height:auto;} \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        ");

            if (session.getAttribute("Message") == "Successfully Logedin") {
        
      out.write("\n");
      out.write("        <script>alert(\"");
      out.print(session.getAttribute("Message"));
      out.write("\");</script>\n");
      out.write("        ");

                session.removeAttribute("Message");
            }
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"myFunction()\">\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a onclick=\"logout()\" href=\"index.jsp\"><span class=\"mouse-change glyphicon glyphicon-log-in\"></span> Logout </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <hr>\n");
      out.write("            <h2 class=\"intro-text text-center\">\n");
      out.write("                <strong>Apply for Leave</strong>\n");
      out.write("            </h2>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"container-fluid text-center\">\n");
      out.write("                <div class=\"row content\">\n");
      out.write("                    <div class=\"col-sm-2 sidenav\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-8 text-left\">\n");
      out.write("                        <div class=\"container-fluid\" style=\"margin-top:5%\">     \n");
      out.write("                            <form method=\"post\" action=\"\" class=\"form-inline\">\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"row\" >\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <label for=\"uname\"> User Name </label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"uname\" style=\"width: 200px;\" placeholder=\"Mr. John\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"row\" >\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <label for=\"email\"> Email-ID </label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"email\" style=\"width: 200px;\" placeholder=\"xyz@gmail.com\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"row\" >\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <label for=\"sdate\"> Start Date </label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <input type=\"date\" class=\"form-control\" style=\"width: 200px;margin-top: 3%\" name=\"sdate\" >\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"row\" >\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <label for=\"edate\"> End Date </label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <input type=\"date\" class=\"form-control\" style=\"width: 200px;margin-top: 3%\" name=\"edate\" >\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"row\" >\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <label for=\"edate\"> Reason </label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"col-lg-6\">\n");
      out.write("                                                <textarea name=\"resn\" row=\"4\" cols=\"20\" class=\"form-control\" style=\"width: 200px;margin-top: 3%\"></textarea>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\" style=\"width: 100px;margin-top: 2%\">Submit</button>\n");
      out.write("                                <button type=\"reset\" class=\"btn btn-primary\" style=\"width:  100px;margin-top: 2%\">Clear</button>\n");
      out.write("\n");
      out.write("                            </form>     \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-2 sidenav\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function logout() {\n");
      out.write("                alert(\"You have Successfully Logout!\");\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function myFunction() {\n");
      out.write("                var name = uform.usrname;\n");
      out.write("                alert(name);\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
