package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>movie-buffer</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"main.css\"/>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("background-color: #808080;\n");
      out.write("color: #5a5656;\n");
      out.write("font-family: 'Open Sans', Arial, Helvetica, sans-serif;\n");
      out.write("font-size: 16px;\n");
      out.write("line-height: 1.5em;\n");
      out.write("}\n");
      out.write("a { text-decoration: none; }\n");
      out.write("h1 { font-size: 1em; }\n");
      out.write("h1, p {\n");
      out.write("margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("strong {\n");
      out.write("font-weight: bold;\n");
      out.write("}\n");
      out.write(".uppercase { text-transform: uppercase; }\n");
      out.write("\n");
      out.write("/* ---------- LOGIN ---------- */\n");
      out.write("#login {\n");
      out.write("margin: 50px auto;\n");
      out.write("width: 300px;\n");
      out.write("}\n");
      out.write("form fieldset input[type=\"text\"], input[type=\"password\"] {\n");
      out.write("background-color: #e5e5e5;\n");
      out.write("border: none;\n");
      out.write("border-radius: 3px;\n");
      out.write("-moz-border-radius: 3px;\n");
      out.write("-webkit-border-radius: 3px;\n");
      out.write("color: #5a5656;\n");
      out.write("font-family: 'Open Sans', Arial, Helvetica, sans-serif;\n");
      out.write("font-size: 14px;\n");
      out.write("height: 50px;\n");
      out.write("outline: none;\n");
      out.write("padding: 0px 10px;\n");
      out.write("width: 280px;\n");
      out.write("-webkit-appearance:none;\n");
      out.write("}\n");
      out.write("form fieldset input[type=\"submit\"] {\n");
      out.write("background-color: #008dde;\n");
      out.write("border: none;\n");
      out.write("border-radius: 3px;\n");
      out.write("-moz-border-radius: 3px;\n");
      out.write("-webkit-border-radius: 3px;\n");
      out.write("color: #f4f4f4;\n");
      out.write("cursor: pointer;\n");
      out.write("font-family: 'Open Sans', Arial, Helvetica, sans-serif;\n");
      out.write("height: 50px;\n");
      out.write("text-transform: uppercase;\n");
      out.write("width: 300px;\n");
      out.write("-webkit-appearance:none;\n");
      out.write("}\n");
      out.write("form fieldset a {\n");
      out.write("color: #5a5656;\n");
      out.write("font-size: 10px;\n");
      out.write("}\n");
      out.write("form fieldset a:hover { text-decoration: underline; }\n");
      out.write(".btn-round {\n");
      out.write("background-color: #5a5656;\n");
      out.write("border-radius: 50%;\n");
      out.write("-moz-border-radius: 50%;\n");
      out.write("-webkit-border-radius: 50%;\n");
      out.write("color: #f4f4f4;\n");
      out.write("display: block;\n");
      out.write("font-size: 12px;\n");
      out.write("height: 50px;\n");
      out.write("line-height: 50px;\n");
      out.write("margin: 30px 125px;\n");
      out.write("text-align: center;\n");
      out.write("text-transform: uppercase;\n");
      out.write("width: 50px;\n");
      out.write("}\n");
      out.write(".facebook-before {\n");
      out.write("background-color: #0064ab;\n");
      out.write("border-radius: 3px 0px 0px 3px;\n");
      out.write("-moz-border-radius: 3px 0px 0px 3px;\n");
      out.write("-webkit-border-radius: 3px 0px 0px 3px;\n");
      out.write("color: #f4f4f4;\n");
      out.write("display: block;\n");
      out.write("float: left;\n");
      out.write("height: 50px;\n");
      out.write("line-height: 50px;\n");
      out.write("text-align: center;\n");
      out.write("width: 50px;\n");
      out.write("}\n");
      out.write(".sign {\n");
      out.write("background-color: #0079ce;\n");
      out.write("border: none;\n");
      out.write("border-radius: 0px 3px 3px 0px;\n");
      out.write("-moz-border-radius: 0px 3px 3px 0px;\n");
      out.write("-webkit-border-radius: 0px 3px 3px 0px;\n");
      out.write("color: #f4f4f4;\n");
      out.write("cursor: pointer;\n");
      out.write("height: 50px;\n");
      out.write("text-transform: uppercase;\n");
      out.write("width: 250px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"login\">\n");
      out.write("    <h1><strong>Welcome.</strong> Please login.</h1> \n");
      out.write("<form action=\"tree\" method=\"post\">\n");
      out.write("<fieldset>\n");
      out.write("    <p><input type=\"text\" required name=\"uname\" placeholder=\"Username\"  \"></p>\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${wrong_user_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    <p><input type=\"password\" required name=\"pass\" placeholder=\"Passkey\" \"></p>\n");
      out.write("     ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${wrong_password_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    <p><input type=\"submit\" value=\"Login\"></p>\n");
      out.write("</fieldset>\n");
      out.write("</form>\n");
      out.write("<p><span class=\"btn-round\">or</span></p>\n");
      out.write("&nbsp;\n");
      out.write("<p>\n");
      out.write("    <a href=\"signup.jsp\">  \n");
      out.write("        <button class=\"sign\">Sign in</button>\n");
      out.write("    </a>\n");
      out.write("</p>\n");
      out.write("</div> \n");
      out.write("    <!-- Footer -->\n");
      out.write("        <footer id=\"footer\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <h2>Connect-us:</h2>\n");
      out.write("                <ul class=\"icons\">\n");
      out.write("                    <li><a href=\"#\" class=\"icon fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"icon fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"icon fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n");
      out.write("                    <li><a href=\"#\" class=\"icon fa-envelope\"><span class=\"label\">Email</span></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <p class=\"copyright\">&copy;Team-CTA(cit)  Design:Arun Venkatesh,Bharath kumar </p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("</body>\n");
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
