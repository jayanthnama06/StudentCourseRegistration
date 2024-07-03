<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
            background: rgb(238,174,202);
			background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
        }

        h2 {
            margin-top: 20px;
        }

        form {
            max-width: 450px;
            margin: 0 auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin: 10px 0;
            font-weight: bold;
        }

        input[type="email"],
        input[type="password"] {
            width: 95%;
            padding: 12px; /* Increased padding for better appearance */
            margin: 10px 0; /* Increased margin for better spacing */
            border: 2px solid #4CAF50; /* Change border style */
            border-radius: 5px; /* Increased border radius for rounded edges */
            font-size: 16px; /* Adjust font size */
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 12px 20px; /* Increased padding for better appearance */
            border: none;
            border-radius: 5px; /* Increased border radius for rounded edges */
            cursor: pointer;
            width: 100%;
            font-size: 16px; /* Adjust font size */
            background-image: linear-gradient( 135deg, #FCCF31 10%, #F55555 100%);
        }

        button:hover {
            background-color: #45a049;
        }
        /* Style for the input field */
		.captcha-input {
		  width: 100%;
		  padding: 10px;
		  border: 1px solid #ccc;
		  border-radius: 5px;
		  background-color: #fff;
		  color: #333;
		  margin-bottom: 10px;
		}
		
		/* Style for the CAPTCHA image */
		#captchaImage {
		  max-width: 100%;
		  height: auto;
		  border: 1px solid #ccc;
		  border-radius: 5px;
		  margin-bottom: 10px;
		}
		
		/* Style for the refresh icon */
		#refreshCaptcha {
		  color: #007bff;
		  cursor: pointer;
		  margin-left: 10px;
		}
		
		/* Add a hover effect to the refresh icon */
		#refreshCaptcha:hover {
		  color: #0056b3;
		}
    </style>
</head>
<body>
<%@ include file="navbar.jsp" %>
    <h2>Student Login</h2>

    <form action="checkstdlogin" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <label for="captcha">Enter CAPTCHA:</label>
    	<img src="captchaImage.jsp" alt="CAPTCHA" id="captchaImage" />
    	<i id="refreshCaptcha" class="fas fa-sync-alt captcha-icon"></i>
		<input type="text" id="captcha" name="captcha" placeholder="Enter Captcha" class="captcha-input" required />
    	<button class="submit">Log In</button>
    </form>
</body>
</html>
