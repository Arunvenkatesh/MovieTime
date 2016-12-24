package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;

public final class cart2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script>\n");
      out.write("            function changeclass(id,a){\n");
      out.write("              var c=id;\n");
      out.write("                if(a===\"3\")\n");
      out.write("                { \n");
      out.write("                    if(document.getElementById(id).getAttribute(\"class\")===\"div1\")\n");
      out.write("                    {    \n");
      out.write("                        document.getElementById(id).setAttribute(\"class\",\"div3\");\n");
      out.write("                        document.getElementById(\"seats\").value=document.getElementById(\"seats\").value+\" \"+id;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                        if(document.getElementById(id).getAttribute(\"class\")===\"div3\")\n");
      out.write("                            document.getElementById(id).setAttribute(\"class\",\"div1\");\n");
      out.write("                        else\n");
      out.write("                            window.alert(\"Already booked!!!\");\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    document.getElementById(id).setAttribute(\"class\",\"div2\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("                    .div1 {\n");
      out.write("            width: 20px;\n");
      out.write("            height: 20px;\n");
      out.write("            border: 1px solid blue;\n");
      out.write("            background: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .div2 {\n");
      out.write("            width: 20px;\n");
      out.write("            height: 20px;\n");
      out.write("            border: 1px solid blue;\n");
      out.write("            background: #d9d9d9;    \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .div3 {\n");
      out.write("            width: 20px;\n");
      out.write("            height: 20px;\n");
      out.write("            border: 1px solid blue;\n");
      out.write("            background: #2aa22a;    \n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        <title>Ticket Booking Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <center>\n");
      out.write("        <table border=\"0\" height=\"70\" width=\"20%\" cellspacing=\"1\">\n");
      out.write("            ");

                int count=1;
                String seatno=null;
                for(int i=1;i<=10;i++)
                {
                    out.print("<tr>");
                    for(int j=1;j<=5;j++)
                    {
                        if(j!=3)
                        {
                            seatno=Integer.toString(count);
                           // seatno="s"+seatno;          
                            out.println("<td><a href=\"#\"><div class=\"div1\" onclick='changeclass(\"s"+seatno+"\",\"3\")' id=\"s"+seatno+"\"></div></a><br></td>");
                            count++;
                        }
                        else
                            out.println("<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>");
                    }
                    out.print("</tr>");
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <form action=\"seats_db\">\n");
      out.write("        <input type=\"hidden\" id=\"seats\" name=\"seat\" value=\"\">\n");
      out.write("        <input type=\"submit\" value=\"Confirm booking\">\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("            ");

            Connection conn = null;
            ResultSet rs=null;
                
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
                out.println("Connection established");
                }catch(Exception e){
                out.println(e);
            }
            Statement stmt = conn.createStatement(); 
        String sql;
            sql = "SELECT * FROM `bus1`";
            rs = stmt.executeQuery(sql);

            while(rs.next())
            {
                out.println("<script type=\"text/javascript\">"
                    + "changeclass(\""+rs.getString("seatno")+"\",\"2\");"
                    + "</script>");
            }
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
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
