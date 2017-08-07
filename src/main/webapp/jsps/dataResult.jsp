<%@ page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Query QQSpider</h1>
	<table>
		<%
			ResultSet res = (ResultSet) request.getAttribute("resultSet");
			String name = "";
			String state = "";
			int id = 0, count = 0;
			while (res.next())
			{
				name = res.getString("name");
				state = res.getString("state");
				id = res.getInt("id");
				count++;
		%>
		<tr>
			<td>NO: <%=count%> Name:<%=name%> state: <%=state%> id: <%=id%><br /></td>
		</tr>
		<%
			}
		%>
	</table>

	<h1>Use C taglib</h1>
	<table>
		<c:forEach var="singer" items="resultSet">
			${singer} 
		</c:forEach>

	</table>
</body>
</html>