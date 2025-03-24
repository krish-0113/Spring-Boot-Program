<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Login Here</h1>

<form action="/loginForm" method="post">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required> <br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required> <br>

    <input type="submit" value="Login">
</form>

<p>${errorMsg}</p> <!-- Displays error messages dynamically -->

<p>If you don’t have an account, <a href="/register">click here</a> to register.</p>

<!-- Logout Button (Visible only if the user is logged in) -->
<%
    if (session.getAttribute("user") != null) {
%>
<form action="/logout" method="post">
    <input type="submit" value="Logout">
</form>
<%
    }
%>
</body>
</html>
