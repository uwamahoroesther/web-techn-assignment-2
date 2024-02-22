        <%--
  Created by IntelliJ IDEA.
  User: la paix
  Date: 15/10/2023
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="rw.ac.auca.model.EAccademicUnit" %>
<%@ page import="rw.ac.auca.service.AccademicUnitInterface" %>
<%@ page import="rw.ac.auca.service.AccademicUnitService" %>
<%@ page import="rw.ac.auca.model.AccademicUnit" %>
<%@ page import="java.util.List" %>
<%-- Set the EAccademicUnit enum values as an attribute --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Dashboard - Academic Units</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<%@include file="pages/NavBar.jsp" %>
<div class="container mt-4">
    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addAcademicUnitModal">Add New Academic Unit</button>
    <h2>Academic Unit List</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Code</th>
            <th>Name</th>
            <th>Unit</th>
            <th>Parent</th>
        </tr>
        </thead>
        <tbody>
        <!-- Loop through your existing academic units and display them here -->
        <%
            List<AccademicUnit> academicUnits = null;
            try {
                AccademicUnitInterface accUnitService = new AccademicUnitService();
                academicUnits = accUnitService.accademicUnitList();

                for (AccademicUnit academicUnit : academicUnits) {
        %>
        <tr>
            <td><%=academicUnit.getId()%></td>
            <td><%=academicUnit.getCode()%></td>
            <td><%=academicUnit.getName()%></td>
            <td><%=academicUnit.getUnit()%></td>
            <td><%=academicUnit.getParent() != null ? academicUnit.getParent().getName() : "N/A"%></td>
        </tr>
        <%
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        %>
        <!-- Repeat the above row for each academic unit -->
        </tbody>
    </table>

    <!-- New Academic Unit Form Modal -->
    <div class="modal fade" id="addAcademicUnitModal" tabindex="-1" role="dialog" aria-labelledby="addAcademicUnitModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="addAcademicUnitModalLabel">Add New Academic Unit</h5>
                    <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form method="post" action="/AccademicUnitServlet" class="needs-validation" novalidate>
                        <div class="mb-3">
                            <label for="code" class="form-label">Code</label>
                            <input type="text" class="form-control" id="code" name="code" required>
                        </div>
                        <div class="mb-3">
                            <label for="name" class="form-label">Name</label>
                            <input type="text" class="form-control" id="name" name="name" required>
                        </div>
                        <div class="mb-3">
                            <label for="unit" class="form-label">Unit</label>
                            <select class="form-select" id="unit" name="unit" required>
                                <option value="PROGRAMME">Programme</option>
                                <option value="FACULTY">Faculty</option>
                                <option value="DEPARTMENT">Department</option>
                                <!-- Add other EAccademicUnit enum values here -->
                            </select>
                        </div>
                        <div class="mb-3">
                            <label for="parent" class="form-label">Parent Unit</label>
                            <input type="text" class="form-control" id="parent" name="parent" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Add Academic Unit</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
