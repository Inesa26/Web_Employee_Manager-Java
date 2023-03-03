<%--
  Created by IntelliJ IDEA.
  User: Inesa Godorozea
  Date: 16.01.2023
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="common/forms/css.html"%>
    <%@ include file="common/forms/header.html"%>
    <title>Edit Employee</title>
</head>
<body class="bg-dark text-light p-5 p-lg-0 pt-lg-5 text-center text-sm-start">
<div class="container">
    <div class="d-sm-flex align-items-center justify-content-between">
        <div>
        <div class="d-sm-flex align-items-center justify-content-between column-gap-3">
            <a class="btn btn-info" href="list" role="button">Cancel</a>
            <h1 class="text-warning">Edit employee</h1>
        </div>
            <%@ include file="common/forms/employee_form.jsp"%>

        </div>
        <%@ include file="common/forms/edit_image.html"%>
    </div>
</div>
<%@ include file="common/forms/footer.html"%>
<%@ include file="common/forms/js.html"%>
</body>
</html>
