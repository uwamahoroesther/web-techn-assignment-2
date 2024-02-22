<%--
  Created by IntelliJ IDEA.
  User: la paix
  Date: 15/10/2023
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg bg-body-tertiary" style="background-color: black;">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Admin Dashboard</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Student</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="AccademicUnit.jsp">Academic Unit</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Teacher.jsp">Teacher</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Course</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="CourceDef.jsp">Course Definition</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Semester</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Student Registration</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Search</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
            <a class="nav-link" href="#"><button class="btn btn-outline-denger">Log out</button> </a>
        </div>
    </div>
</nav>
