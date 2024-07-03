<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
    <style>
    body {
            background: rgb(34, 193, 195);
            background: linear-gradient(0deg, rgba(34, 193, 195, 1) 0%, rgba(253, 187, 45, 1) 100%);
        }
    
        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
            border: 2px solid red; /* Red-colored table border */
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<%@ include file="navbaradm.jsp" %>
    <center><h1>Employee List</h1></center>
    <table>
        <tr>
            <th>Employee ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Department</th>
            <th>Gender</th>
            <th>Contact Number</th>
            <th>Status</th>
            <th>Address</th>
            <th>City</th>
            <th>Joining Date</th>
        </tr>
        <c:forEach items="${listemployee}" var="employee">
            <tr>
                <td><c:out value="${employee.employeeId}" /></td>
                <td><c:out value="${employee.firstName}" /></td>
                <td><c:out value="${employee.lastName}" /></td>
                <td><c:out value="${employee.email}" /></td>
                <td><c:out value="${employee.department}" /></td>
                <td><c:out value="${employee.gender}" /></td>
                <td><c:out value="${employee.contactNumber}" /></td>
                <td><c:out value="${employee.status}" /></td>
                <td><c:out value="${employee.address}" /></td>
                <td><c:out value="${employee.city}" /></td>
                <td><c:out value="${employee.joiningDate}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
