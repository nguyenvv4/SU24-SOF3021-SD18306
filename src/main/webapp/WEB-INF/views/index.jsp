<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello world</h1>
<form action="/login" method="post">
    <label>user name</label>
    <input type="text" name="username">
    <label> password</label>
    <input type="text" name="password">
    <button type="submit">Login</button>
    <p>${error}</p>
</form>
</body>
</html>