<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: Inesa Godorozea
  Date: 13.01.2023
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@ include file="common/forms/header.html"%>
    <%@ include file="common/forms/css.html"%>
    <title>View Employees</title>
</head>
<body class="bg-dark text-light p-5 p-lg-0 pt-lg-5 text-center text-sm-start">

<div class="container">
    <div class="d-sm-flex align-items-center justify-content-between">
        <div>
            <div class="d-sm-flex align-items-center justify-content-between column-gap-3">
                <a class="btn btn-info" href="index" role="button">Cancel</a>
           <h1 class="text-warning mb-3 " >Employees List</h1>

                <div>
                    <c:if test="${param.search!=null}">
                        Filtered by: <c:out value="${param.search}"/>
                        <a href="list">Clear</a>
                    </c:if>



                <form class="d-flex" role="search" action = "list" method="get">
                    <input class="form-control me-2" name = "search" type="search"   placeholder="Search" aria-label="Search" value="${param.search}" onfocus="select();">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
                </div>

            </div>
            <c:choose>
                <c:when test="${!requestScope.lista.isEmpty()}">
<table class="table table-bordered border-info">

    <thead class="text-light">
      <tr>
          <th>First name</th>
          <th>Last Name</th>
          <th>Birthdate</th>
          <th>Actions</th>

      </tr>

    </thead>

    <tbody  class="text-light">
    <c:forEach items="${lista}" var="e">
        <tr>
        <td><c:out value="${e.name}"/></td>
            <td><c:out value="${e.surname}"/></td>
            <td><c:out value="${e.birthdate}"/></td>
            <td>
                <a class="btn btn-info" href="view?id=${e.id}" role="button">View</a>
                <a class="btn btn-success" href="edit?id=${e.id}" role="button">Edit</a>
                <a class="btn btn-danger" href="delete?id=${e.id}" role="button">Delete</a>

            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
                    <nav aria-label="Page navigation example">
                        <ul class="pagination">
                            <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                            <c:forEach var ="i" begin ="1" end="${requestScope.totalPages}">
                                <c:choose>
                                    <c:when test="${requestScope.activePage==i}">
                                        <li class="page-item active">
                                    </c:when>
                                    <c:otherwise> <li class="page-item"></c:otherwise>
                                </c:choose>


                                <c:choose>
                                    <c:when test="${param.search!=null}">
                                        <a class="page-link" href="list?search=${param.search}&p=${i}">
                                    </c:when>
                                    <c:otherwise>
                                        <a class="page-link" href="list?p=${i}">
                                    </c:otherwise>
                                </c:choose>
                                <c:out value="${i}"/></a>
                                </li>
                            </c:forEach>

                            <li class="page-item"><a class="page-link" href="#">Next</a></li>
                        </ul>
                    </nav>
            </c:when>
            <c:otherwise>
                <div class="alert alert-danger" role ="alert">No data!</div></c:otherwise>
            </c:choose>


        </div>


        <%@ include file="common/forms/list_image.html"%>

    </div>

</div>
<%@ include file="common/forms/footer.html"%>
<%@ include file="common/forms/js.html"%>
</body>
</html>

