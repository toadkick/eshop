<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.06.2018
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://java.sun.com/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

<spring:url value="/category" var="showCategory"/>


<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<jsp:include page="_menu.jsp"/>
<div class="standart">
<h1>all categories:</h1>

    <c:forEach var = "category" items = "${list}">
            <h5><a href="${showCategory}/${category.categoryID}">${category.name}</a>
            </h5>
                </c:forEach>
</div>
<jsp:include page="_footer.jsp"/>
</body>
</html>
