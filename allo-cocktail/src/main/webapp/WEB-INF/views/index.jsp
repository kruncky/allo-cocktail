<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Application CocktailBar</title>
</head>
<body>
	<h1>Page de l'accueil de l'application CocktailBar</h1>
	<ul>
		<c:forEach items="${menuList}" var="menu">
			<li>
				<c:url value="${menu.url}" var="menuUrl" />
				<a href="${menuUrl}">${menu.title}</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>