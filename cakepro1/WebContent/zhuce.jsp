<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>用户注册</h2>
	<form action="user/zhuce" method="post">
		账号<input type="text" name="userid" value="${u.userid }"/><br>
		密码<input type="password" name="password" value="${u.password }"/><br>
		姓名<input type="text" name="name" value="${u.name }"/><br>
		性别<input type="text" name="sex" value="${u.sex}" /><br>
		年龄<input type="text" name="age" value="${u.age }"/><br>
		身份证号<input type="text" name="IDcard" value="${u.IDcard }"/><br>
		手机号码<input type="text" name="number" value="${u.number }"/><br>
		充值金额<input type="text" name="money" value="${u.money }"/><br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>