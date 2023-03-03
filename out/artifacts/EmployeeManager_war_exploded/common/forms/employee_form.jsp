<%--
  Created by IntelliJ IDEA.
  User: Inesa Godorozea
  Date: 17.01.2023
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form method="post" >
<div class="d-grid gap-3 ">
    <input type="hidden" name="id" value="${requestScope.id}"/>
    <div class="input-group">
        <span class="input-group-text">First name</span>
        <input type="text" name="name" aria-label="First name" class="form-control" value="${requestScope.name}"/>
    </div>
    <div class="input-group">
        <span class="input-group-text">Last name</span>
        <input type="text" name="surname" aria-label="Last name" class="form-control" value="${requestScope.surname}"/>
    </div>
    <div class="input-group">
        <span class="input-group-text">Birth date</span>
        <input type="date" name="birthdate" aria-label="Birth date" class="form-control" value="${requestScope.birthdate}"/>
    </div>



    <div class="d-grid gap-2 d-md-block">

    <button class="btn btn-success" type="submit" >Save</button>
    <button class="btn btn-danger" type="reset">Clear</button>


        </div>
    </div>

</form>

