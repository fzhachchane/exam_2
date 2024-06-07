<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Modify Employee's Project List</title>
</head>
<body>
<h1>Modify Employee's Project List</h1>
<form:form action="#" modelAttribute="employee" method="post">
    <table>
        <tr>
            <td>Employee ID:</td>
            <td><form:input path="id" readonly="true" /></td>
        </tr>
        <tr>
            <td>Employee Name:</td>
            <td><form:input path="name" readonly="true" /></td>
        </tr>
        <tr>
            <td>Projects:</td>
            <td><form:select path="projects" items="${allProjects}" multiple="true" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Update Projects" />
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>