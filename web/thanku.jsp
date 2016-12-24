<%@page import="java.util.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MovieTime</title>
    
        
        
      </head>
    <script type="text/javascript">
        
        var timer =3;
        website="http://localhost:8080/eadcatmain/signin.jsp";
function delay()
{
    window.location=website;
    
}
function loadFile()
{
    
   alert("hai");
   
   // String st=request.getparameter("daate");
    //String sd=request.getparameter("tiime");
    aler("done"+st);
}
     setTimeout('delay()',1000*timer);
     </script>
     <body bgcolor="#292429" onload="loadFile()">
    <center><br><br><br><br>
        <h1> <p>thank uuuuu ................!
        </h1>
<% String sd=request.getParameter("daate");
String st=request.getParameter("tiime");
String tot=request.getParameter("tot");
String mvname=request.getParameter("i");
String num=request.getParameter("no");
 %>
        <% out.println(sd);%>
          <% out.println(st);%>    <% out.println(num);%>
        <h2> thankyou for registreing..!</h2>
        <br><br><br><br>

        <h2>this page will automatically redirected</h2></center>
    </body>
</html>
