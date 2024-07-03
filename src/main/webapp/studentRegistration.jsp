<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Form</title>
    
    <style>
        body {
            background: linear-gradient(45deg, #85FFBD 0%, #FFFB7D 100%);
        }

        h2 {
            text-align: center;
        }

        form {
            max-width: 400px; /* Reduced the form width for a smaller size */
            margin: 0 auto;
            background-color: #ffffff;
            padding: 10px; /* Reduced padding */
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }

        select#gender,
        textarea#address,
        select#status {
            width: 90%;
            padding: 6px; /* Reduced padding */
            margin: 5px 0; /* Reduced margin */
            border: 2px solid #4CAF50;
            border-radius: 5px;
            font-size: 14px; /* Reduced font size */
            height: 40px;
        }

        input[type="text"],
        input[type="email"],
        input[type="gender"],
        input[type="status"],
        select,
        textarea,
        input[type="password"],
        input[type="address"],
        input[type="date"] {
            width: 90%;
            padding: 6px;
            margin: 5px 0;
            border: 2px solid #4CAF50;
            border-radius: 5px;
            font-size: 14px;
        }

        select {
            height: 35px; /* Reduced select box height */
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 8px 14px; /* Adjusted padding */
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            width: 100%;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<%@ include file="navbar2.jsp" %>
    <h2>Student Form</h2>

    <form action="universityRegistration" method="post">
        <label for="studentId">Student ID:</label>
        <input type="text" id="studentId" name="studentId" required>

        <label for="firstName">Student First Name:</label>
        <input type="text" id="firstName" name="firstName" required>

        <label for="lastName">Student Last Name:</label>
        <input type="text" id="lastName" name="lastName" required>

        <label for="email">Student Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="department">Student Department:</label>
        <input type="text" id="department" name="department" required>

        <label for="gender">Gender:</label>
        <select id="gender" name="gender" required>
            <option value="MALE">Male</option>
            <option value="FEMALE">Female</option>
            <option value="OTHER">Other</option>
        </select>

        <label for="contactNumber">Contact Number:</label>
        <input type="text" id="contactNumber" name="contactNumber" required>

        <label for="password">Set Password:</label>
        <input type="password" id="password" name="password" required>

        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required>

        <label for="joiningDate">Joining Date:</label>
        <input type="date" id="joiningDate" name="joiningDate" required>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
