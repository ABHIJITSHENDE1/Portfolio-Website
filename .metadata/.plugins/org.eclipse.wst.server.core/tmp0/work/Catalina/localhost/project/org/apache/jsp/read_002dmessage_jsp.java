/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-09-02 18:50:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pojo.MessagePojo;
import java.util.ArrayList;
import com.dao.MessageDao;

public final class read_002dmessage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/message.jsp", Long.valueOf(1693678687586L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.pojo.MessagePojo");
    _jspx_imports_classes.add("com.dao.MessageDao");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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


	String value = (String)session.getAttribute("login");
	if(value == null){
		response.sendRedirect("login.jsp");
		return;
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"./favicon/apple-touch-icon.png\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"./favicon/favicon-32x32.png\">\r\n");
      out.write("	<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"./favicon/favicon-16x16.png\">\r\n");
      out.write("	<link rel=\"manifest\" href=\"./favicon/android-chrome-512x512.png\">\r\n");
      out.write("	<link rel=\"mask-icon\" href=\"./favicon/safari-pinned-tab.svg\" color=\"#5bbad5\">\r\n");
      out.write("	<meta name=\"msapplication-TileColor\" content=\"#da532c\">\r\n");
      out.write("	<meta name=\"theme-color\" content=\"#ffffff\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Contacts</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("	background: #eee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile .panel-profile {\r\n");
      out.write("	border: none;\r\n");
      out.write("	margin-bottom: 0;\r\n");
      out.write("	box-shadow: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile .panel-heading {\r\n");
      out.write("	color: #585f69;\r\n");
      out.write("	background: #fff;\r\n");
      out.write("	padding: 7px 15px;\r\n");
      out.write("	border-bottom: solid 3px #f7f7f7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".overflow-h {\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".panel-heading {\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	padding: 5px 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile .panel-title {\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile .profile-blog {\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	background: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile .blog-border {\r\n");
      out.write("	border: 1px solid #f0f0f0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile .profile-blog img {\r\n");
      out.write("	float: left;\r\n");
      out.write("	width: 50px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rounded-x {\r\n");
      out.write("	border-radius: 50% !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile .name-location {\r\n");
      out.write("	overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".profile .name-location strong {\r\n");
      out.write("	color: #555;\r\n");
      out.write("	display: block;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".profile .name-location span a {\r\n");
      out.write("	color: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".margin-bottom-20 {\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".share-list {\r\n");
      out.write("	margin-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".list-inline {\r\n");
      out.write("	padding-left: 0;\r\n");
      out.write("	margin-left: -5px;\r\n");
      out.write("	list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".list-inline li {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	padding-right: 5px;\r\n");
      out.write("	padding-left: 5px;\r\n");
      out.write("	font-size: 11px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".share-list li i {\r\n");
      out.write("	color: #72c02c;\r\n");
      out.write("	margin-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contact-decoration{\r\n");
      out.write("	font-weight: bold; \r\n");
      out.write("	color: black\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button{\r\n");
      out.write("	color: wheat;\r\n");
      out.write("	background-color: green;\r\n");
      out.write("	border: none;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	font-family:'Roboto',sans-serif;\r\n");
      out.write("	margin: 5px;\r\n");
      out.write("	box-shadow: 2px 2px ;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("button {\r\n");
      out.write("  transition-duration: 0.4s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:hover {\r\n");
      out.write("  background-color: red; /* Green */\r\n");
      out.write("  color: white;\r\n");
      out.write("  box-shadow: 2px 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#admin-home{\r\n");
      out.write("	text-decoration: none;;\r\n");
      out.write("	font-size: 25px;\r\n");
      out.write("	color: blue;\r\n");
      out.write("	font-family: fantasy;	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#admin-home:hover {\r\n");
      out.write("	color:lime;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("	<link\r\n");
      out.write("		href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\"\r\n");
      out.write("		rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container profile\">\r\n");
      out.write("		<div class=\"col-md-12\">\r\n");
      out.write("			<div class=\"panel panel-profile\">\r\n");
      out.write("				<div class=\"panel-heading overflow-h\">\r\n");
      out.write("					<h2 class=\"panel-title heading-sm pull-left\">\r\n");
      out.write("						<i></i><h2 style=\"font-weight: bold; color: black;\">Contacts</h2>\r\n");
      out.write("						<center style=\"font-size: 5px;\">");
 
  	String msg = (String)session.getAttribute("msg");
  	if(msg != null)
  	{	
  		if(msg.equals("Data Send Sucessfully"))
  		{
  	
      out.write("\r\n");
      out.write("  			<h2 style=\"text-align:center; color:blue\">");
      out.print(msg);
      out.write("</h2>\r\n");
      out.write("  			 <meta http-equiv=\"refresh\" content=\"1\">\r\n");
      out.write("  	");

  		}
  		else{
  	
      out.write("\r\n");
      out.write("  			<h2 style=\"text-align:center; color:red\">");
      out.print(msg);
      out.write("</h2>\r\n");
      out.write("  			<meta http-equiv=\"refresh\" content=\"1\">\r\n");
      out.write("  		\r\n");
      out.write("  	 ");

  		}
  	}
  		session.removeAttribute("msg");
  	 
      out.write("</center>\r\n");
      out.write("						<center><a href=\"admin.jsp\" id=\"admin-home\">ADMIN HOME</a></center>\r\n");
      out.write("					</h2>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"panel-body\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					<!-- LOOP -->\r\n");
      out.write("					\r\n");
      out.write("					");

					ArrayList<Object> al =  new MessageDao().read();
					int i=1;
					for(Object obj : al)
					{
						MessagePojo m = (MessagePojo) obj;
					
      out.write("\r\n");
      out.write("					\r\n");
      out.write("						<div class=\"col-sm-12\">\r\n");
      out.write("							<div class=\"profile-blog blog-border\">\r\n");
      out.write("								\r\n");
      out.write("								<div class=\"name-location\">\r\n");
      out.write("									<b>SN: </b> ");
      out.print(i );
      out.write("\r\n");
      out.write("									<strong>");
      out.print(m.getName());
      out.write("</strong>\r\n");
      out.write("									<span><i\r\n");
      out.write("						            ></i><br><a href=\"#\">");
      out.print(m.getDatetime());
      out.write(",</a> <a href=\"#\">");
      out.print(m.getEmail());
      out.write("</a></span>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"clearfix margin-bottom-20\"></div>\r\n");
      out.write("								<p>");
      out.print(m.getMessage());
      out.write("</p>\r\n");
      out.write("								<hr>\r\n");
      out.write("								<script type=\"text/javascript\">\r\n");
      out.write("								   function ensure() {\r\n");
      out.write("									   if( confirm(\"ARE YOU SURE!!!\"))\r\n");
      out.write("									   {\r\n");
      out.write("										   return true;\r\n");
      out.write("									   }\r\n");
      out.write("									   else\r\n");
      out.write("									   {\r\n");
      out.write("										   return false; \r\n");
      out.write("									   }\r\n");
      out.write("								    }\r\n");
      out.write("								</script>\r\n");
      out.write("								<form action=\"Message\" method=\"post\" onsubmit=\"return ensure()\">\r\n");
      out.write("								<input type=\"hidden\" name=\"check\" value=\"delete\">\r\n");
      out.write("								   <input type=\"hidden\" name=\"sno\" value=\"");
      out.print(m.getSno());
      out.write("\">\r\n");
      out.write("								  <button>DELETE</button>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div><i class=\"fa-sharp fa-regular fa-calendar-days\"></i>\r\n");
      out.write("						</div>\r\n");
      out.write("						");

						i++;
					      }
						
      out.write("\r\n");
      out.write("						\r\n");
      out.write("				    <!-- LOOP -->\r\n");
      out.write("					\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
