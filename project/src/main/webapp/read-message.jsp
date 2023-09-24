<%
	String value = (String)session.getAttribute("login");
	if(value == null){
		response.sendRedirect("login.jsp");
		return;
	}
%>


<!DOCTYPE html>

<%@page import="com.pojo.MessagePojo"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.MessageDao"%>
<html lang="en">
<head>
<link rel="apple-touch-icon" sizes="180x180" href="./favicon/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="./favicon/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="16x16" href="./favicon/favicon-16x16.png">
	<link rel="manifest" href="./favicon/android-chrome-512x512.png">
	<link rel="mask-icon" href="./favicon/safari-pinned-tab.svg" color="#5bbad5">
	<meta name="msapplication-TileColor" content="#da532c">
	<meta name="theme-color" content="#ffffff">


<meta charset="utf-8">
<title>Contacts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
body {
	margin-top: 20px;
	background: #eee;
}

.profile .panel-profile {
	border: none;
	margin-bottom: 0;
	box-shadow: none;
}

.profile .panel-heading {
	color: #585f69;
	background: #fff;
	padding: 7px 15px;
	border-bottom: solid 3px #f7f7f7;
}

.overflow-h {
	overflow: hidden;
}

.panel-heading {
	color: #fff;
	padding: 5px 15px;
}

.profile .panel-title {
	font-size: 16px;
}

.profile .profile-blog {
	padding: 20px;
	background: #fff;
}

.profile .blog-border {
	border: 1px solid #f0f0f0;
}

.profile .profile-blog img {
	float: left;
	width: 50px;
	height: 50px;
	margin-right: 20px;
}

.rounded-x {
	border-radius: 50% !important;
}

.profile .name-location {
	overflow: hidden;
}

.profile .name-location strong {
	color: #555;
	display: block;
	font-size: 16px;
}



.profile .name-location span a {
	color: #555;
}

.margin-bottom-20 {
	margin-bottom: 20px;
}

.share-list {
	margin-bottom: 0;
}

.list-inline {
	padding-left: 0;
	margin-left: -5px;
	list-style: none;
}

.list-inline li {
	display: inline-block;
	padding-right: 5px;
	padding-left: 5px;
	font-size: 11px;
}

.share-list li i {
	color: #72c02c;
	margin-right: 5px;
}

#contact-decoration{
	font-weight: bold; 
	color: black
}

button{
	color: wheat;
	background-color: green;
	border: none;
	padding: 10px;
	font-family:'Roboto',sans-serif;
	margin: 5px;
	box-shadow: 2px 2px ;
	border-radius: 5px;
}
button {
  transition-duration: 0.4s;
}

button:hover {
  background-color: red; /* Green */
  color: white;
  box-shadow: 2px 2px;
}

#admin-home{
	text-decoration: none;;
	font-size: 25px;
	color: blue;
	font-family: fantasy;	
}

#admin-home:hover {
	color:lime;
}
</style>
	<link
		href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
		rel="stylesheet">
</head>
<body>
	<div class="container profile">
		<div class="col-md-12">
			<div class="panel panel-profile">
				<div class="panel-heading overflow-h">
					<h2 class="panel-title heading-sm pull-left">
						<i></i><h2 style="font-weight: bold; color: black;">Contacts</h2>
						<center style="font-size: 5px;"><%@include file="message.jsp" %></center>
						<center><a href="admin.jsp" id="admin-home">ADMIN HOME</a></center>
					</h2>
					
				</div>
				<div class="panel-body">
					<div class="row">
					
					
					<!-- LOOP -->
					
					<%
					ArrayList<Object> al =  new MessageDao().read();
					int i=1;
					for(Object obj : al)
					{
						MessagePojo m = (MessagePojo) obj;
					%>
					
						<div class="col-sm-12">
							<div class="profile-blog blog-border">
								
								<div class="name-location">
									<b>SN: </b> <%=i %>
									<strong><%=m.getName()%></strong>
									<span><i
						            ></i><br><a href="#"><%=m.getDatetime()%>,</a> <a href="#"><%=m.getEmail()%></a></span>
								</div>
								<div class="clearfix margin-bottom-20"></div>
								<p><%=m.getMessage()%></p>
								<hr>
								<script type="text/javascript">
								   function ensure() {
									   if( confirm("ARE YOU SURE!!!"))
									   {
										   return true;
									   }
									   else
									   {
										   return false; 
									   }
								    }
								</script>
								<form action="Message" method="post" onsubmit="return ensure()">
								<input type="hidden" name="check" value="delete">
								   <input type="hidden" name="sno" value="<%=m.getSno()%>">
								  <button>DELETE</button>
								</form>
							</div><i class="fa-sharp fa-regular fa-calendar-days"></i>
						</div>
						<%
						i++;
					      }
						%>
						
				    <!-- LOOP -->
					
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script
		src="https://netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		
	</script>
</body>
</html>