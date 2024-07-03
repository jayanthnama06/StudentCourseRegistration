<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Form</title>
    <style>
    body {
            background: rgb(34, 193, 195);
            background: linear-gradient(0deg, rgba(34, 193, 195, 1) 0%, rgba(253, 187, 45, 1) 100%);
        }
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
        }

        h2 {
            text-align: center;
        }

        form {
            max-width: 600px; /* Increased the form width for better spacing */
            margin: 0 auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-top: 15px; /* Increased the margin for better spacing */
            font-weight: bold; /* Added font-weight for labels */
        }
		
		 select#gender,
    	 textarea#address,
    	 select#status {
        width: 90%;
        padding: 12px;
        margin: 10px 0;
        border: 2px solid #4CAF50;
        border-radius: 5px;
        font-size: 16px;
        height: 50px;
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
            padding: 12px; /* Increased padding for better appearance and spacing */
            margin: 10px 0; /* Increased margin for better spacing */
            border: 2px solid #4CAF50; /* Changed border style */
            border-radius: 5px; /* Increased border radius for rounded edges */
            font-size: 16px; /* Adjusted font size */
        }

        select {
            height: 40px; /* Adjusted select box height */
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px; /* Increased padding for better appearance */
            border: none;
            border-radius: 5px; /* Increased border radius for rounded edges */
            cursor: pointer;
            font-size: 16px; /* Adjusted font size */
            width: 100%;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<%@ include file="navbaradm.jsp" %>
    <h2>Employee Registration</h2>

    <form action="customerRegistration" method="post">
        <label for="employeeId">Employee ID:</label>
        <input type="text" id="employeeId" name="employeeId" required>

        <label for="firstName">Employee First Name:</label>
        <input type="text" id="firstName" name="firstName" required>

        <label for="lastName">Employee Last Name:</label>
        <input type="text" id="lastName" name="lastName" required>

        <label for="email">Employee Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="department">Employee Department:</label>
        <input type="text" id="department" name="department" required>

        <label for="gender">Gender:</label>
        <select id="gender" name="gender" required>
            <option value="MALE">Male</option>
            <option value="FEMALE">Female</option>
            <option value="OTHER">Other</option>
        </select>

        <label for="contactNumber">Contact Number:</label>
        <input type="text" id="contactNumber" name="contactNumber" required>

        <label for="status">Status:</label>
        <select id="status" name="status" required>
            <option value="ACTIVE">Active</option>
            <option value="INACTIVE">Inactive</option>
        </select>

        <label for="address">Address:</label>
        <textarea id="address" name="address" required></textarea>

        <label for="city">City:</label>
        <input type="text" id="city" name="city" required>

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
