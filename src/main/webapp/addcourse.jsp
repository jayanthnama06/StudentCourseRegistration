<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Course List</title>
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
<%@ include file="navbar3.jsp" %>
<center><h1>Course List</h1></center>
<table>
    <tr>
        <th>Course ID</th>
        <th>Course Code</th>
        <th>Course Name</th>
    </tr>
    <c:forEach items="${listcourse}" var="course">
        <tr>
            <td><c:out value="${course.courseId}" /></td>
            <td><c:out value="${course.courseCode}" /></td>
            <td><c:out value="${course.courseName}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
