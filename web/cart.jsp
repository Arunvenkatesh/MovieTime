<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<%@page import="java.util.*"%>
<%@page import="java.util.*"%>

<html >
  <head>
    <meta charset="UTF-8">
    <title>MovieTime</title>
     <link rel="stylesheet" href="main.css"/>
    
    <style type="text/css">
        
        
        
        .product-image {
  float: left;
  width: 20%;
}

.product-details {
  float: left;
  width: 37%;
}

.product-price {
  float: left;
  width: 12%;
}

.product-quantity {
  float: left;
  width: 10%;
}

.product-removal {
  float: left;
  width: 9%;
}

.product-line-price {
  float: left;
  width: 12%;
  text-align: right;
}

/* This is used as the traditional .clearfix class */
.group:before, .shopping-cart:before, .column-labels:before, .product:before, .totals-item:before,
.group:after,
.shopping-cart:after,
.column-labels:after,
.product:after,
.totals-item:after {
  content: '';
  display: table;
}

.group:after, .shopping-cart:after, .column-labels:after, .product:after, .totals-item:after {
  clear: both;
}

.group, .shopping-cart, .column-labels, .product, .totals-item {
  zoom: 1;
}

/* Apply clearfix in a few places */
/* Apply dollar signs */
.product .product-price:before, .product .product-line-price:before, .totals-value:before {
  content: 'Rs.';
}

/* Body/Header stuff */
body {
  padding: 0px 30px 30px 20px;
  font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-weight: 100;
}

h1 {
  font-weight: 100;
}

label {
  color: #aaa;
}

.shopping-cart {
  margin-top: -45px;
}

/* Column headers */
.column-labels label {
  padding-bottom: 15px;
  margin-bottom: 15px;
  border-bottom: 1px solid #eee;
}
.column-labels .product-image, .column-labels .product-details, .column-labels .product-removal {
  text-indent: -9999px;
}

/* Product entries */
.product {
  margin-bottom: 20px;
  padding-bottom: 10px;
  border-bottom: 1px solid #eee;
}
.product .product-image {
  text-align: center;
}
.product .product-image img {
  width: 100px;
}
.product .product-details .product-title {
  margin-right: 20px;
  font-family: "HelveticaNeue-Medium", "Helvetica Neue Medium";
}
.product .product-details .product-description {
  margin: 5px 20px 5px 0;
  line-height: 1.4em;
}
.product .product-quantity input {
  width: 40px;
}
.product .remove-product {
  border: 0;
  padding: 4px 8px;
  background-color: #c66;
  color: #fff;
  font-family: "HelveticaNeue-Medium", "Helvetica Neue Medium";
  font-size: 12px;
  border-radius: 3px;
}
.product .remove-product:hover {
  background-color: #a44;
}

/* Totals section */
.totals .totals-item {
  float: right;
  clear: both;
  width: 100%;
  margin-bottom: 10px;
}
.totals .totals-item label {
  float: left;
  clear: both;
  width: 79%;
  text-align: right;
}
.totals .totals-item .totals-value {
  float: right;
  width: 21%;
  text-align: right;
}
.totals .totals-item-total {
  font-family: "HelveticaNeue-Medium", "Helvetica Neue Medium";
}

.checkout {
  float: right;
  border: 0;
  margin-top: 20px;
  padding: 6px 25px;
  background-color: #6b6;
  color: #fff;
  font-size: 25px;
  border-radius: 3px;
}

.checkout:hover {
  background-color: #494;
}

/* Make adjustments for tablet */
@media screen and (max-width: 650px) {
  .shopping-cart {
    margin: 0;
    padding-top: 20px;
    border-top: 1px solid #eee;
  }

  .column-labels {
    display: none;
  }

  .product-image {
    float: right;
    width: auto;
  }
  .product-image img {
    margin: 0 0 10px 10px;
  }

  .product-details {
    float: none;
    margin-bottom: 10px;
    width: auto;
  }

  .product-price {
    clear: both;
    width: 70px;
  }

  .product-quantity {
    width: 100px;
  }
  .product-quantity input {
    margin-left: 20px;
  }

  .product-quantity:before {
    content: 'x';
  }

  .product-removal {
    width: auto;
  }

  .product-line-price {
    float: right;
    width: 70px;
  }
}
/* Make more adjustments for phone */
@media screen and (max-width: 350px) {
  .product-removal {
    float: right;
  }

  .product-line-price {
    float: right;
    clear: left;
    width: auto;
    margin-top: 10px;
  }

  .product .product-line-price:before {
    content: 'Item Total: $';
  }

  .totals .totals-item label {
    width: 60%;
  }
  .totals .totals-item .totals-value {
    width: 40%;
  }
}

/*! normalize.css v4.0.0 | MIT License | github.com/necolas/normalize.css */
html{font-family:sans-serif;-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%}body{margin:0}article,aside,details,figcaption,figure,footer,header,main,menu,nav,section,summary{display:block}audio,canvas,progress,video{display:inline-block}audio:not([controls]){display:none;height:0}progress{vertical-align:baseline}template,[hidden]{display:none}a{background-color:transparent}a:active,a:hover{outline-width:0}abbr[title]{border-bottom:none;text-decoration:underline;text-decoration:underline dotted}b,strong{font-weight:inherit}b,strong{font-weight:bolder}dfn{font-style:italic}h1{font-size:2em;margin:0.67em 0}mark{background-color:#ff0;color:#000}small{font-size:80%}sub,sup{font-size:75%;line-height:0;position:relative;vertical-align:baseline}sub{bottom:-0.25em}sup{top:-0.5em}img{border-style:none}svg:not(:root){overflow:hidden}code,kbd,pre,samp{font-family:monospace, monospace;font-size:1em}figure{margin:1em 40px}hr{box-sizing:content-box;height:0;overflow:visible}button,input,select,textarea{font:inherit;margin:0}optgroup{font-weight:bold}button,input,select{overflow:visible}button,select{text-transform:none}button,[type="button"],[type="reset"],[type="submit"]{cursor:pointer}[disabled]{cursor:default}button,html [type="button"],[type="reset"],[type="submit"]{-webkit-appearance:button}button::-moz-focus-inner,input::-moz-focus-inner{border:0;padding:0}button:-moz-focusring,input:-moz-focusring{outline:1px dotted ButtonText}fieldset{border:1px solid #c0c0c0;margin:0 2px;padding:0.35em 0.625em 0.75em}legend{box-sizing:border-box;color:inherit;display:table;max-width:100%;padding:0;white-space:normal}textarea{overflow:auto}[type="checkbox"],[type="radio"]{box-sizing:border-box;padding:0}[type="number"]::-webkit-inner-spin-button,[type="number"]::-webkit-outer-spin-button{height:auto}[type="search"]{-webkit-appearance:textfield}[type="search"]::-webkit-search-cancel-button,[type="search"]::-webkit-search-decoration{-webkit-appearance:none}

    </style>
    
    
    
  </head>
  
  <body>
      <form  method="post" action="thanku.jsp">
    <h1>Wanna watch? just tap the mouse</h1>

<div class="shopping-cart">

  <div class="column-labels">
    <label class="product-image">Image</label>
    <label class="product-details">Product</label>
    <label class="product-price">Ticket Price</label>
    <label class="product-quantity">No of Persons</label>
    <label class="product-removal">Remove</label>
    <label class="product-line-price">Total</label>
  </div>
    
   <%@ page import="java.util.Date" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="today" value="<%=new Date()%>"/>
<c:set var="tomorrow" value="<%=new Date(new Date().getTime() + 60*60*24*1000)%>"/>
<c:set var="dtomorrow" value="<%=new Date(new Date().getTime() + 60*60*48*1000)%>"/>
    <% 
   String i=request.getParameter("ac");
    if(i.equals("watch-don't breathe"))
       {
         
     out.println("<div class= \"product\"> \n" +
            "<div class=\"product-image\"> \n" +
     " <img src= \"images\\pic01.jpg\"> \n" +
   " </div> \n" +
  "  <div class=\"product-details\"> \n"+
      
             
      "<div class=\"product-title\">Daniel Silva</div> \n"+
      "<p class=\"product-description\"> A network of terror</p>  \n" +
              
    "</div> \n" +
    
    "<div class=\"product-price\">250</div> \n" +
    "<div class=\"product-quantity\"> \n"+
      "<input type=\"number\" value=\"1\" min=\"1\" name=\"no\" > \n" +
                 "</div>\n" +
    "<div class=\"product-removal\">\n" +
     " <button class=\"remove-product\">\n" +
      "  Remove\n" +
      "</button>\n" +
   " </div>\n" +
    "<div class=\"product-line-price\">250</div>\n" +
  "</div>");

            }
  else if(i.equals("watch-kabali"))
       {
     out.println("<div class= \"product\"> \n" +
            "<div class=\"product-image\"> \n" +
     " <img src= \"images\\pic02.jpg\"> \n" +
   " </div> \n" +
  "  <div class=\"product-details\"> \n"+
             
      "<div class=\"product-title\">Daniel Silva"
             + "</div> \n"+
      "<p class=\"product-description\"> A network of terror</p>  \n" +
              
    "</div> \n" +
    "<div class=\"product-price\">250</div> \n" +
    "<div class=\"product-quantity\"> \n"+
      "<input type=\"number\" value=\"1\" min=\"1\" name=\"no\" > \n" +
    "</div>\n" +
    "<div class=\"product-removal\">\n" +
     " <button class=\"remove-product\">\n" +
      "  Remove\n" +
      "</button>\n" +
   " </div>\n" +
    "<div class=\"product-line-price\">250</div>\n" +
  "</div>");

            }
 else  if(i.equals("watch-mohenho-daro"))
       {
         
     out.println("<div class= \"product\"> \n" +
            "<div class=\"product-image\"> \n" +
     " <img src= \"images\\pic03.jpg\"> \n" +
   " </div> \n" +
  "  <div class=\"product-details\"> \n"+
             
      "<div class=\"product-title\">Daniel Silva</div> \n"+
      "<p class=\"product-description\"> A network of terror</p>  \n" +
              
    "</div> \n" +
    "<div class=\"product-price\">250</div> \n" +
    "<div class=\"product-quantity\"> \n"+
      "<input type=\"number\" value=\"1\" min=\"1\" name=\"no\" > \n" +
    "</div>\n" +
    "<div class=\"product-removal\">\n" +
     " <button class=\"remove-product\">\n" +
      "  Remove\n" +
      "</button>\n" +
   " </div>\n" +
    "<div class=\"product-line-price\">250</div>\n" +
  "</div>");

            }
   if(i.equals("watch-Lights out"))
       {
         
     out.println("<div class= \"product\"> \n" +
            "<div class=\"product-image\"> \n" +
     " <img src= \"images\\pic04.jpg\"> \n" +
   " </div> \n" +
  "  <div class=\"product-details\"> \n"+
             
      "<div class=\"product-title\">Daniel Silva</div> \n"+
      "<p class=\"product-description\"> A network of terror</p>  \n" +
              
    "</div> \n" +
    "<div class=\"product-price\">250</div> \n" +
    "<div class=\"product-quantity\"> \n"+
      "<input type=\"number\" value=\"1\" min=\"1\" name=\"no\" > \n" +
    "</div>\n" +
    "<div class=\"product-removal\">\n" +
     " <button class=\"remove-product\">\n" +
      "  Remove\n" +
      "</button>\n" +
   " </div>\n" +
    "<div class=\"product-line-price\">250</div>\n" +
  "</div>");
            }
   else if(i.equals("watch Remo"))
       {
         
     out.println("<div class= \"product\"> \n" +
            "<div class=\"product-image\"> \n" +
     " <img src= \"images\\pic05.jpg\"> \n" +
   " </div> \n" +
  "  <div class=\"product-details\"> \n"+
             
      "<div class=\"product-title\">Daniel Silva</div> \n"+
      "<p class=\"product-description\"> A network of terror</p>  \n" +
              
    "</div> \n" +
    "<div class=\"product-price\">250</div> \n" +
    "<div class=\"product-quantity\"> \n"+
      "<input type=\"number\" value=\"1\" min=\"1\" name=\"no\" > \n" +
    "</div>\n" +
    "<div class=\"product-removal\">\n" +
     " <button class=\"remove-product\">\n" +
      "  Remove\n" +
      "</button>\n" +
   " </div>\n" +
    "<div class=\"product-line-price\">250</div>\n" +
  "</div>");

            }
   else if(i.equals("watch-MS dhoni"))
       {
         
     out.println("<div class= \"product\"> \n" +
            "<div class=\"product-image\"> \n" +
     " <img src= \"images\\pic06.jpg\"> \n" +
   " </div> \n" +
  "  <div class=\"product-details\"> \n"+
             
      "<div class=\"product-title\">Daniel Silva</div> \n"+
      "<p class=\"product-description\"> A network of terror</p>  \n" +
              
    "</div> \n" +
    "<div class=\"product-price\">250</div> \n" +
    "<div class=\"product-quantity\"> \n"+
      "<input type=\"number\" value=\"1\" min=\"1\" name=\"no\" > \n" +
    "</div>\n" +
    "<div class=\"product-removal\">\n" +
     " <button class=\"remove-product\">\n" +
      "  Remove\n" +
      "</button>\n" +
   " </div>\n" +
    "<div class=\"product-line-price\">250</div>\n" +
  "</div>");

            }
//out.println(i);
out.println("<div id=\"i\" style=\"display\" value='"+i+"'> \n" +
"</div>");
   %>
   <div id="i" value="<%= request.getParameter("ac")%>">
<font color=" #80dfff"><select name="daate">
  <option value="30-09-2016 "><fmt:formatDate type="date" value="${today}" pattern="dd-MM-yyyy"/></option>
  <option value="01-10-2016"><fmt:formatDate type="date" value="${tomorrow}" pattern="dd-MM-yyyy"/></option>
  <option value="02-10-2016"><fmt:formatDate type="date" value="${dtomorrow}" pattern="dd-MM-yyyy"/></option>
 </select></font>   

   <font color="#80dfff"><select name="tiime">
       <option value="10:00AM">10:00AM</option>
       <option value="02:00PM">02:00PM</option>
       <option value="06:00PM">06:00PM</option>
       <option value="10:00PM">10:00PM</option>
   </select></font>

  <div class="totals">
    <div class="totals-item">
      <label>Subtotal</label>
      <div class="totals-value" id="cart-subtotal">250</div>
    </div>
    <div class="totals-item">
      <label>Tax (5%)</label>
      <div class="totals-value" id="cart-tax">12.50</div>
    </div>
        <div class="totals-item totals-item-total">
      <label>Grand Total</label>
      <div class="totals-value" id="cart-total" name="tot">262.50</div>
    </div>
  </div>
   <input type="submit" class="checkout" value="Checkout">

</div>
     <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

      <script src="jv.js"></script>

<!-- Footer -->
        <footer id="footer">
            <div class="inner">
                <h2>Connect-us:</h2>
                <ul class="icons">
                    <li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
                    <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
                    <li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
                    <li><a href="#" class="icon fa-envelope"><span class="label">Email</span></a></li>
                </ul>
                <p class="copyright">&copy;Team-CTA(cit)  Design:Arun Venkatesh,Bharath kumar </p>
            </div>
        </footer>
      </form>
  </body>
</html>
