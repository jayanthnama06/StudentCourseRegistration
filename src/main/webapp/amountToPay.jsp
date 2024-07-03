<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Course Payment</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url("background.jpg"); /* Replace with your background image URL */
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            margin: 0;
            padding: 0;
         
            background: rgb(34, 193, 195);
            background: linear-gradient(0deg, rgba(34, 193, 195, 1) 0%, rgba(253, 187, 45, 1) 100%);
    
            
        }

        .container {
            width: 100%;
            max-width: 400px;
            margin: 0 auto;
            background: rgba(255, 255, 255, 0.9);
            padding: 20px;
            margin-top: 100px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            color: #333;
        }

        .form-group {
            margin: 15px 0;
        }

        label {
            display: block;
            color: #555;
        }

        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            font-size: 16px;
            margin-top: 5px;
        }

        input[type="text"]:focus, input[type="number"]:focus {
            outline: none;
            border-color: #007bff;
        }

        button {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            font-size: 18px;
            cursor: pointer;
            width: 100%;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<%@ include file="navbar3.jsp" %>
    <div class="container">
        <h1>Course Payment</h1>
        <form action="amountToPay" method="get">
            <div class="form-group">
                <label for="courseName">Course Name</label>
                <input type="text" id="courseName" name="courseName" required>
            </div>
            <div class="form-group">
                <label for="courseCode">Course Code</label>
                <input type="text" id="courseCode" name="courseCode" required>
            </div>
            <div class="form-group">
                <label for="amount">Amount to Pay</label>
                <input type="number" id="amount" name="amount" required>
            </div>
            <button type="submit">Proceed to Pay</button>
            
        </form>
        <script>
        // Add a JavaScript function to handle form submission and redirection
        document.getElementById("paymentForm").addEventListener("submit", function(e) {
            e.preventDefault(); // Prevent the default form submission behavior

            // Redirect to Payment.jsp
            window.location.href = "Payment.jsp";
        });
    </script>
    </div>
</body>
</html>