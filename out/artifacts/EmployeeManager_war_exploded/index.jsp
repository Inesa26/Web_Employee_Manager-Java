<%--
  Created by IntelliJ IDEA.
  User: Inesa Godorozea
  Date: 13.01.2023
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <%@ include file="common/forms/css.html"%>
      <%@ include file="common/forms/header.html"%>

    <title>Employee Manager</title>
  </head>
  <body class="bg-dark text-light p-5 p-lg-0 pt-lg-5 text-center text-sm-start">

  <div class="container">
      <div class="d-sm-flex align-items-center justify-content-between">
          <div>
              <h1>Welcome to <span class="text-warning"> Employee Manager </span></h1>
              <p class="lead my-4">
                  This application was created to effectively manage the data about your company's employees.
              </p>
              <div class="d-grid gap-2 col-5 ">
                  <a class="btn btn-info" href="add" role="button">Add Employee</a>
                  <a class="btn btn-info" href="list" role="button">View Employees</a>
              </div>

          </div>
          <%@ include file="common/forms/main_image.html"%>
      </div>
  </div>

  <%@ include file="common/forms/footer.html"%>
  <%@ include file="common/forms/js.html"%>
  </body>

</html>
