<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h1>Register Here</h1>

<form action="/regForm" method="post">
    Name: <input type="text" name="name" required> <br>
    Email: <input type="email" name="email" required> <br>
    Password: <input type="password" name="password" required> <br>
    Phone: <input type="text" name="phoneno" required> <br>
    <input type="submit" value="Register">
</form>

${success} ${errorMsg}
</body>
</html>
