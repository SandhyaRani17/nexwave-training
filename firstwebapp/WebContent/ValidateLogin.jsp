<%@page session= "true" import="com.del.first.entity.Users,com.del.first.dao.UsersDAO"%>
<%
	String username=request.getParameter("uid");
	String password=request.getParameter("pwd");
	session.setAttribute("username",username);
	Users u =new Users(username,password);
	if(new UsersDAO().validateUser(u))
	{
%>
	   <jsp:forward page="services.html"/>
<%
	}
	else
	{
%>
		<%="Invalid Username/password"%>
		<jsp.include page="login.html"/>
<%
	}
%>