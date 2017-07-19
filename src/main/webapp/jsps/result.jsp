<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*,java.lang.String"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Beers</title>
</head>
<body>

	<h1>Beer Recommendations</h1>
	<!-- servlet控制器中根据请求和业务模型生成了下面的list，然后放到request属性中，jsp在这里使用request.get得到 -->
	<p>

		<%
			List<String> styles = (List)request.getAttribute("styles");
			Iterator it = styles.iterator();
			while (it.hasNext())
				out.print("<br> try: " + it.next());
		%>
	</p>


</body>
</html>