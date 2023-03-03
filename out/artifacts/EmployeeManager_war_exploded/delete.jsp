<%--
  Created by IntelliJ IDEA.
  User: Inesa Godorozea
  Date: 16.01.2023
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@ include file="common/forms/css.html"%>
    <%@ include file="common/forms/header.html"%>
    <title>Please confirm!</title>
</head>
<body class="bg-dark text-light p-5 p-lg-0 pt-lg-5 text-center text-sm-start">
<div class="container">
<div class="d-sm-flex align-items-center justify-content-between">
    <div >
<h1 class="text-warning">Are you sure you want to delete the employee?</h1>
<h2><c:out value="${requestScope.fullName}"/></h2>
<form method="post">
    <button class="btn btn-info" type="submit">Confirm</button>
    <a class="btn btn-danger" href="list" role="button">Cancel</a>
</form>

    </div>

<%@ include file="common/forms/delete_image.html"%>
</div>
</div>
<%@ include file="common/forms/footer.html"%>
<%@ include file="common/forms/js.html"%>
</body>
</html>
