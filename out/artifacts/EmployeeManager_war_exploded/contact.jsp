<%--
  Created by IntelliJ IDEA.
  User: Inesa Godorozea
  Date: 23.01.2023
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="common/forms/css.html"%>
    <%@ include file="common/forms/header.html"%>
    <title>Contact info</title>
</head>
<body class="bg-dark text-light p-5 p-lg-0 pt-lg-5 text-center text-sm-start">
<div class="container">
    <div class="d-sm-flex align-items-center justify-content-between">

        <div>
            <section class="p-5">
                <div class="container">
                    <div class="row g-4">

                            <h1 class="text-center mb-4 text-warning">Contact Info</h1>
                            <ul class= "list-group">
                                <li class="list-group-item">
                                    <span class="fw-bold">Main Location:</span> Moldova, mun. Chisinau str. Alexandru cel Bun 50
                                </li>
                                <li class="list-group-item">
                                    <span class="fw-bold">Moldova:</span> +373 555 555
                                </li>
                                <li class="list-group-item">
                                    <span class="fw-bold">USA:</span> +1 212 589 3333
                                </li>
                                </li>
                                <li class="list-group-item">
                                    <span class="fw-bold">Germany:</span> +49 70 555 555 6-9
                                </li>
                                <li class="list-group-item">
                                    <span class="fw-bold">Email:</span>
                                    EmployeeManager@gmail.com </li>
                            </ul>
                        </div>
                        <div class="col-md">
                            <div id="map"></div>
                        </div>

                </div>
            </section>

        </div>
        <%@ include file="common/forms/contact_image.html"%>
    </div>

</div>
<%@ include file="common/forms/footer.html"%>
<%@ include file="common/forms/js.html"%>

</body>
</html>
