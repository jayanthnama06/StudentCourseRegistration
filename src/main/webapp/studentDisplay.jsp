<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
    <style>
        body {
            background: rgb(34, 193, 195);
            background: linear-gradient(0deg, rgba(34, 193, 195, 1) 0%, rgba(253, 187, 45, 1) 100%);
            font-family: Arial, sans-serif;
        }

        .container {
            text-align: center;
        }

        .search-form {
            margin: 20px;
        }

        .search-form label {
            font-weight: bold;
        }

        .search-input {
            padding: 5px;
            width: 200px;
        }

        .search-button {
            padding: 5px 10px;
            background-color: #333;
            color: #fff;
            border: none;
            cursor: pointer;
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
    <div class="container">
        <%@ include file="navbaradm.jsp" %>
        <h1>Student List</h1>

        <!-- Search form -->
        <div class="search-form">
            <form action="<c:url value="studentResult" />" method="get">
                <label for="studentId">Search by ID:</label>
                <input type="text" id="studentId" name="studentId" class="search-input" />
                <button type="submit" class="search-button">Search</button>
            </form>
        </div>

        <!-- Student table -->
        <table>
            <tr>
                <th>Student ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Department</th>
                <th>Gender</th>
                <th>Contact Number</th>
                <th>Joining Date</th>
            </tr>
            <c:forEach items="${liststudent}" var="student">
                <tr>
                    <td><c:out value="${student.studentId}" /></td>
                    <td><c:out value="${student.firstName}" /></td>
                    <td><c:out value="${student.lastName}" /></td>
                    <td><c:out value="${student.email}" /></td>
                    <td><c:out value="${student.department}" /></td>
                    <td><c:out value="${student.gender}" /></td>
                    <td><c:out value="${student.contactNumber}" /></td>
                    <td><c:out value="${student.joiningDate}" /></td> 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
