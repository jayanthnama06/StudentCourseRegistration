<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        ul.navbar {
            list-style-type: none;
            margin: 0;
            padding: 20px 0; /* Increased vertical padding */
            background-color: #2c3e50; /* Background color */
            text-align: center;
        }

        ul.navbar li {
            display: inline;
            margin-right: 30px; /* Increased spacing between menu items */
        }

        ul.navbar li a {
            text-decoration: none;
            color: #ecf0f1; /* Text color */
            font-size: 24px; /* Increased font size */
            font-weight: bold; /* Font weight */
        }

        ul.navbar li a:hover {
            color: #3498db; /* Text color on hover */
        }
    </style>
</head>
<body>
    <ul class="navbar">
    	<li><a href="adminHome.jsp">Home</a></li>
    	<li><a href="employeeRegistration.jsp">Faculty Registration</a></li>
    	<li><a href="courseRegistration.jsp">Adding Course</a>
    	<li><a href="facultyDisplay">View Faculty</a></li>
    	<li><a href="studentDisplay">View Students</a></li>
    	<li><a href="admlogout">Logout</a>
        
        
        
    </ul>
</body>
</html>
