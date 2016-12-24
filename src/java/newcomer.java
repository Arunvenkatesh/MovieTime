import java.io.*;
import java.sql.*;
import java.util.logging.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class newcomer extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet newuser</title>");            
            out.println("</head>");
            Connection con = null;
            
            String uname=request.getParameter("uname");
            String pass=request.getParameter("pass");
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection DBconn = DriverManager.getConnection("jdbc:derby://localhost:1527/cit", "ap", "ap");
            
           String sql = "INSERT INTO ap VALUES ('" + name + "','" + email + "','" + uname + "','" + pass + "')";
           Statement stmt = DBconn.createStatement();
          Boolean rs = stmt.execute(sql);
           out.println("<body> <script type=\"text/javascript\">\n" +
"        \n" +
"        var timer =3;\n" +
"        website=\"http://localhost:8080/eadcatmain/signin.jsp\";\n" +
"function delay()\n" +
"{\n" +
"    window.location=website;\n" +
"    \n" +
"}\n" +
"     setTimeout('delay()',1000*timer);\n" +
"     </script>\n" +
"   ");
            out.println("<body bdcolor=#808080><center><br><br><br><br>\n" +
"        <h1> <p>SUCCESSFULLY REGISTRED ................!\n" +
"        </h1>\n" +
"        \n" +
"        <br><br><br><br>\n" +
"\n" +
"        <h2>this page will automatically redirected</h2></center>\n" +
"   ");

            out.println("</CENTER></body>");
            out.println("</html>");
          
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(newcomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(newcomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(newcomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(newcomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
