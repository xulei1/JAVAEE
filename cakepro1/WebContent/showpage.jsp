<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table>
		<tr>
			<c:forEach items="${list1 }" var="product" begin="${2*page.pageNO-2 }" end="${page.pageNO*2-1 }">
		        ${product.id}--<a href="/cakepro1/user/detail"?name=${prdouct.name }>${product.name }</a>--<a href="/cakepro1/user/index2">购买</a>--<a>品尝</a><br>
	         </c:forEach>
				<td colspan="6" align="center" bgcolor="#5BA8DE">共${page.totalRecords }条记录 共${page.getTotalPages() }页
			当前第${page.pageNO }页<br>
				<a href="/cakepro1/user/showpage?pageNO=${page.getTopPageNo()}"><input type="button" name="fristPage" value="首页"/></a>
				<c:choose>
					<c:when test="${page.pageNO!=1 }">
						<a href="/cakepro1/user/showpage?pageNO=${page.getpreviousPageno()}"><input type="button" name="previousPage"
						 value="上一页"></a>
					</c:when>
					<c:otherwise>
						<input type="button" disabled="disabled" name="previousPage" value="上一页"/>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${page.pageNO!=100 }">
						<a href="/cakepro1/user/showpage?pageNO=${page.getNextPageNo()}"><input type="button" name="nextPage"
						 value="下一页"></a>
					</c:when>
					<c:otherwise>
						<input type="button" disabled="disabled" name="nextPage" value="下一页"/>
					</c:otherwise>
				</c:choose>
				<a href="/cakepro1/user/showpage?pageNO=${page.getBottomPageNo() }"><input type="button" name="lastPage" value="尾页" /></a>
				</td>
		</tr>
	</table>
</body>
</html>