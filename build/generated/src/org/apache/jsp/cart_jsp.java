package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.io.PrintWriter;
import java.util.*;
import java.util.*;
import java.util.Date;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html >\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>movie-buffer</title>\n");
      out.write("     <link rel=\"stylesheet\" href=\"main.css\"/>\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        .product-image {\n");
      out.write("  float: left;\n");
      out.write("  width: 20%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-details {\n");
      out.write("  float: left;\n");
      out.write("  width: 37%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-price {\n");
      out.write("  float: left;\n");
      out.write("  width: 12%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-quantity {\n");
      out.write("  float: left;\n");
      out.write("  width: 10%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-removal {\n");
      out.write("  float: left;\n");
      out.write("  width: 9%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-line-price {\n");
      out.write("  float: left;\n");
      out.write("  width: 12%;\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* This is used as the traditional .clearfix class */\n");
      out.write(".group:before, .shopping-cart:before, .column-labels:before, .product:before, .totals-item:before,\n");
      out.write(".group:after,\n");
      out.write(".shopping-cart:after,\n");
      out.write(".column-labels:after,\n");
      out.write(".product:after,\n");
      out.write(".totals-item:after {\n");
      out.write("  content: '';\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".group:after, .shopping-cart:after, .column-labels:after, .product:after, .totals-item:after {\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".group, .shopping-cart, .column-labels, .product, .totals-item {\n");
      out.write("  zoom: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Apply clearfix in a few places */\n");
      out.write("/* Apply dollar signs */\n");
      out.write(".product .product-price:before, .product .product-line-price:before, .totals-value:before {\n");
      out.write("  content: 'Rs.';\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Body/Header stuff */\n");
      out.write("body {\n");
      out.write("  padding: 0px 30px 30px 20px;\n");
      out.write("  font-family: \"HelveticaNeue-Light\", \"Helvetica Neue Light\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("  font-weight: 100;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  font-weight: 100;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  color: #aaa;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".shopping-cart {\n");
      out.write("  margin-top: -45px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Column headers */\n");
      out.write(".column-labels label {\n");
      out.write("  padding-bottom: 15px;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("  border-bottom: 1px solid #eee;\n");
      out.write("}\n");
      out.write(".column-labels .product-image, .column-labels .product-details, .column-labels .product-removal {\n");
      out.write("  text-indent: -9999px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Product entries */\n");
      out.write(".product {\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding-bottom: 10px;\n");
      out.write("  border-bottom: 1px solid #eee;\n");
      out.write("}\n");
      out.write(".product .product-image {\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".product .product-image img {\n");
      out.write("  width: 100px;\n");
      out.write("}\n");
      out.write(".product .product-details .product-title {\n");
      out.write("  margin-right: 20px;\n");
      out.write("  font-family: \"HelveticaNeue-Medium\", \"Helvetica Neue Medium\";\n");
      out.write("}\n");
      out.write(".product .product-details .product-description {\n");
      out.write("  margin: 5px 20px 5px 0;\n");
      out.write("  line-height: 1.4em;\n");
      out.write("}\n");
      out.write(".product .product-quantity input {\n");
      out.write("  width: 40px;\n");
      out.write("}\n");
      out.write(".product .remove-product {\n");
      out.write("  border: 0;\n");
      out.write("  padding: 4px 8px;\n");
      out.write("  background-color: #c66;\n");
      out.write("  color: #fff;\n");
      out.write("  font-family: \"HelveticaNeue-Medium\", \"Helvetica Neue Medium\";\n");
      out.write("  font-size: 12px;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write(".product .remove-product:hover {\n");
      out.write("  background-color: #a44;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Totals section */\n");
      out.write(".totals .totals-item {\n");
      out.write("  float: right;\n");
      out.write("  clear: both;\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("}\n");
      out.write(".totals .totals-item label {\n");
      out.write("  float: left;\n");
      out.write("  clear: both;\n");
      out.write("  width: 79%;\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write(".totals .totals-item .totals-value {\n");
      out.write("  float: right;\n");
      out.write("  width: 21%;\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write(".totals .totals-item-total {\n");
      out.write("  font-family: \"HelveticaNeue-Medium\", \"Helvetica Neue Medium\";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".checkout {\n");
      out.write("  float: right;\n");
      out.write("  border: 0;\n");
      out.write("  margin-top: 20px;\n");
      out.write("  padding: 6px 25px;\n");
      out.write("  background-color: #6b6;\n");
      out.write("  color: #fff;\n");
      out.write("  font-size: 25px;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".checkout:hover {\n");
      out.write("  background-color: #494;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Make adjustments for tablet */\n");
      out.write("@media screen and (max-width: 650px) {\n");
      out.write("  .shopping-cart {\n");
      out.write("    margin: 0;\n");
      out.write("    padding-top: 20px;\n");
      out.write("    border-top: 1px solid #eee;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .column-labels {\n");
      out.write("    display: none;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .product-image {\n");
      out.write("    float: right;\n");
      out.write("    width: auto;\n");
      out.write("  }\n");
      out.write("  .product-image img {\n");
      out.write("    margin: 0 0 10px 10px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .product-details {\n");
      out.write("    float: none;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    width: auto;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .product-price {\n");
      out.write("    clear: both;\n");
      out.write("    width: 70px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .product-quantity {\n");
      out.write("    width: 100px;\n");
      out.write("  }\n");
      out.write("  .product-quantity input {\n");
      out.write("    margin-left: 20px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .product-quantity:before {\n");
      out.write("    content: 'x';\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .product-removal {\n");
      out.write("    width: auto;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .product-line-price {\n");
      out.write("    float: right;\n");
      out.write("    width: 70px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/* Make more adjustments for phone */\n");
      out.write("@media screen and (max-width: 350px) {\n");
      out.write("  .product-removal {\n");
      out.write("    float: right;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .product-line-price {\n");
      out.write("    float: right;\n");
      out.write("    clear: left;\n");
      out.write("    width: auto;\n");
      out.write("    margin-top: 10px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .product .product-line-price:before {\n");
      out.write("    content: 'Item Total: $';\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .totals .totals-item label {\n");
      out.write("    width: 60%;\n");
      out.write("  }\n");
      out.write("  .totals .totals-item .totals-value {\n");
      out.write("    width: 40%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*! normalize.css v4.0.0 | MIT License | github.com/necolas/normalize.css */\n");
      out.write("html{font-family:sans-serif;-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%}body{margin:0}article,aside,details,figcaption,figure,footer,header,main,menu,nav,section,summary{display:block}audio,canvas,progress,video{display:inline-block}audio:not([controls]){display:none;height:0}progress{vertical-align:baseline}template,[hidden]{display:none}a{background-color:transparent}a:active,a:hover{outline-width:0}abbr[title]{border-bottom:none;text-decoration:underline;text-decoration:underline dotted}b,strong{font-weight:inherit}b,strong{font-weight:bolder}dfn{font-style:italic}h1{font-size:2em;margin:0.67em 0}mark{background-color:#ff0;color:#000}small{font-size:80%}sub,sup{font-size:75%;line-height:0;position:relative;vertical-align:baseline}sub{bottom:-0.25em}sup{top:-0.5em}img{border-style:none}svg:not(:root){overflow:hidden}code,kbd,pre,samp{font-family:monospace, monospace;font-size:1em}figure{margin:1em 40px}hr{box-sizing:content-box;height:0;overflow:visible}button,input,select,textarea{font:inherit;margin:0}optgroup{font-weight:bold}button,input,select{overflow:visible}button,select{text-transform:none}button,[type=\"button\"],[type=\"reset\"],[type=\"submit\"]{cursor:pointer}[disabled]{cursor:default}button,html [type=\"button\"],[type=\"reset\"],[type=\"submit\"]{-webkit-appearance:button}button::-moz-focus-inner,input::-moz-focus-inner{border:0;padding:0}button:-moz-focusring,input:-moz-focusring{outline:1px dotted ButtonText}fieldset{border:1px solid #c0c0c0;margin:0 2px;padding:0.35em 0.625em 0.75em}legend{box-sizing:border-box;color:inherit;display:table;max-width:100%;padding:0;white-space:normal}textarea{overflow:auto}[type=\"checkbox\"],[type=\"radio\"]{box-sizing:border-box;padding:0}[type=\"number\"]::-webkit-inner-spin-button,[type=\"number\"]::-webkit-outer-spin-button{height:auto}[type=\"search\"]{-webkit-appearance:textfield}[type=\"search\"]::-webkit-search-cancel-button,[type=\"search\"]::-webkit-search-decoration{-webkit-appearance:none}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("      <form  method=\"post\" action=\"thanku.jsp\">\n");
      out.write("    <h1>Wanna watch? just tap the mouse</h1>\n");
      out.write("\n");
      out.write("<div class=\"shopping-cart\">\n");
      out.write("\n");
      out.write("  <div class=\"column-labels\">\n");
      out.write("    <label class=\"product-image\">Image</label>\n");
      out.write("    <label class=\"product-details\">Product</label>\n");
      out.write("    <label class=\"product-price\">Ticket Price</label>\n");
      out.write("    <label class=\"product-quantity\">No of Persons</label>\n");
      out.write("    <label class=\"product-removal\">Remove</label>\n");
      out.write("    <label class=\"product-line-price\">Total</label>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("   \n");
      out.write(" \n");
      out.write("\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("today");
      _jspx_th_c_set_0.setValue(new Date());
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_1.setPageContext(_jspx_page_context);
      _jspx_th_c_set_1.setParent(null);
      _jspx_th_c_set_1.setVar("tomorrow");
      _jspx_th_c_set_1.setValue(new Date(new Date().getTime() + 60*60*24*1000));
      int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
      if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_2.setPageContext(_jspx_page_context);
      _jspx_th_c_set_2.setParent(null);
      _jspx_th_c_set_2.setVar("dtomorrow");
      _jspx_th_c_set_2.setValue(new Date(new Date().getTime() + 60*60*48*1000));
      int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
      if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      out.write("\n");
      out.write("    ");
 
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
   
      out.write("\n");
      out.write("   <div id=\"i\" value=\"");
      out.print( request.getParameter("ac"));
      out.write("\">\n");
      out.write("<font color=\" #80dfff\"><select name=\"daate\">\n");
      out.write("  <option value=\"A\">");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("  <option value=\"B\">");
      if (_jspx_meth_fmt_formatDate_1(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("  <option value=\"C\">");
      if (_jspx_meth_fmt_formatDate_2(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write(" </select></font>   \n");
      out.write("\n");
      out.write("   <font color=\"#80dfff\"><select name=\"tiime\">\n");
      out.write("       <option value=\"AA\">10.00AM</option>\n");
      out.write("       <option value=\"BB\">02.00PM</option>\n");
      out.write("       <option value=\"CC\">06.00PM</option>\n");
      out.write("       <option value=\"D\">10.00PM</option>\n");
      out.write("   </select></font>\n");
      out.write("\n");
      out.write("  <div class=\"totals\">\n");
      out.write("    <div class=\"totals-item\">\n");
      out.write("      <label>Subtotal</label>\n");
      out.write("      <div class=\"totals-value\" id=\"cart-subtotal\">250</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"totals-item\">\n");
      out.write("      <label>Tax (5%)</label>\n");
      out.write("      <div class=\"totals-value\" id=\"cart-tax\">12.50</div>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"totals-item totals-item-total\">\n");
      out.write("      <label>Grand Total</label>\n");
      out.write("      <div class=\"totals-value\" id=\"cart-total\" name=\"tot\">262.50</div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("   <input type=\"submit\" class=\"checkout\" value=\"Checkout\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("     <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("      <script src=\"jv.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
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
      out.write("      </form>\n");
      out.write("  </body>\n");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setType("date");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${today}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("dd-MM-yyyy");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent(null);
    _jspx_th_fmt_formatDate_1.setType("date");
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tomorrow}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_1.setPattern("dd-MM-yyyy");
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent(null);
    _jspx_th_fmt_formatDate_2.setType("date");
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dtomorrow}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_2.setPattern("dd-MM-yyyy");
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
    return false;
  }
}
