<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>SpringMVC Demo Home</title>
</head>

<body>
<h3>This is SpringMVC Demo Home</h3>
<c:forEach items="${users}" var="user">
    <c:out value="${user.name}"/><br/>
    <c:out value="${user.age}"/><br/>
</c:forEach>
</body>
</html>