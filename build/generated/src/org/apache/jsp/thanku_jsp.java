package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;

public final class thanku_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>starter-crew</title>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </head>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        \n");
      out.write("        var timer =3;\n");
      out.write("        website=\"http://localhost:8080/eadcatmain/signin.jsp\";\n");
      out.write("function delay()\n");
      out.write("{\n");
      out.write("    window.location=website;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("function loadFile()\n");
      out.write("{\n");
      out.write("    \n");
      out.write("   alert(\"hai\");\n");
      out.write("   \n");
      out.write("   // String st=request.getparameter(\"daate\");\n");
      out.write("    //String sd=request.getparameter(\"tiime\");\n");
      out.write("    aler(\"done\"+st);\n");
      out.write("}\n");
      out.write("     setTimeout('delay()',1000*timer);\n");
      out.write("     </script>\n");
      out.write("     <body bgcolor=\"#292429\" onload=\"loadFile()\">\n");
      out.write("    <center><br><br><br><br>\n");
      out.write("        <h1> <p>thank uuuuu ................!\n");
      out.write("        </h1>\n");
 String sd=request.getParameter("daate");
String st=request.getParameter("tiime");
String tot=request.getParameter("tot");
String mvname=request.getParameter("ac");
String num=request.getParameter("no");


      out.write("\n");
      out.write("        ");
 out.println(sd);
      out.write("\n");
      out.write("          ");
 out.println(st);
      out.write(' ');
      out.write(' ');
 out.println(tot);
      out.write(' ');
      out.write(' ');
 out.println(mvname);
      out.write(' ');
      out.write(' ');
 out.println(tot);
      out.write("\n");
      out.write("        <h2> thankyou for registreing..!</h2>\n");
      out.write("        <br><br><br><br>\n");
      out.write("\n");
      out.write("        <h2>this page will automatically redirected</h2></center>\n");
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
