<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>回忆时光蛋糕屋</h1>
		<form action="user/shouye" method="post">
			账号<input type="text" name="userid" value="${userid }" ><br>
			密码<input type="password" name="password" value="${password }"><br>
			<input type="submit" value="登录">
		</form>
		<form action="zhuce.jsp">
			<input type="submit" value="注册">
		</form>
</body>
</html>