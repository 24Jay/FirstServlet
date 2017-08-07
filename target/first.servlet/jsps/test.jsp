<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%! int count=1; %>
The page count now is :
	<%=++count%>
	<br>
	<h4>scriptlet: </h4><% out.println("Hello Scriptlet!");%>
	<h4>表达式: </h4><%= "Hello 表达式" %>
</body>
</html>