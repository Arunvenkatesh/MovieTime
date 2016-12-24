
import java.sql.*;
import java.util.logging.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class entry extends HttpServlet {

   String[] U_name=new String[20];
   String pass_1[]=new String[20];
     public static int i=1;
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
            String uname=request.getParameter("uname");
            String pass=request.getParameter("pass");
            
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          out.println(pass);
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           out.println("check1");
            Connection DBconn = DriverManager.getConnection("jdbc:derby://localhost:1527/cit", "ap", "ap");
            out.println("check2");
                Statement st = DBconn.createStatement();
                out.println("check3");
                    ResultSet rs=st.executeQuery("SELECT * FROM AP.AP where uname ='" + uname +"'"); 
                                  
            if(rs.next())
            {
               // out.println("check4");
                   String u_email = rs.getString(3);
                   String u_password = rs.getString(4);
                   out.println(u_password);
                   if(!u_password.equals(pass))
                   {
                        String wrong_password="Sorry...Wrong password";
                        request.setAttribute("wrong_password_msg",wrong_password);
                        RequestDispatcher rd=request.getRequestDispatcher("signin.jsp");
                        rd.forward(request, response); 
                   }
                   else
                   {
                       response.sendRedirect("index.html");
                   }
            }
            else
            {
                String wrong_user="Sorry...Wrong emailid";
                request.setAttribute("wrong_user_msg",wrong_user);
                RequestDispatcher rd=request.getRequestDispatcher("true-home.jsp");
                rd.forward(request, response);
                //response.sendRedirect(".jsp");
            }
        
    
                    /*if(rs.next())
                    {
                        if(pass.equals(rs.getString(4))) 
                        { 
                 
                            out.println("Hi sureeeeeee" + rs.getString(4) + "<a href='http://localhost:8080/stores/cart.html'>click</a>");
                        }
                        else 
                            out.println("Invalid password");
                    }
                    else
                    {
                        out.println("Invalid uname");
                    }
                        
                }
                    */
    //        out.println("</CENTER></body>");
      //      out.println("</html>");
            
        }

    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
                processRequest(request, response);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
             processRequest(request, response);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(entry.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

/*
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
 
/**
 * Servlet implementation class MySQLConnect
 */
 
/*public class entry extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("uname");
        String pass = request.getParameter("pass");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cit", "root", "");
            Statement pst = conn.Statement("Select user,pass from ap where user=? and pass=?");
            pst.setString(1, user);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                out.println("Correct login credentials");
            } 
            else {
                out.println("Incorrect login credentials");
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}*/