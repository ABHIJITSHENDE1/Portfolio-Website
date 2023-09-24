<% 
  	String msg = (String)session.getAttribute("msg");
  	if(msg != null)
  	{	
  		if(msg.equals("Data Send Sucessfully"))
  		{
  	%>
  			<h2 style="text-align:center; color:blue"><%=msg%></h2>
  			 <meta http-equiv="refresh" content="1">
  	<%
  		}
  		else{
  	%>
  			<h2 style="text-align:center; color:red"><%=msg%></h2>
  			<meta http-equiv="refresh" content="1">
  		
  	 <%
  		}
  	}
  		session.removeAttribute("msg");
  	 %>