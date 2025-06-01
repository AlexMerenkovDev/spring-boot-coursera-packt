<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Login Page</title>
  </head>
  <body>
    Welcome to the Login page!
    <div>${loginFailed}</div>
    <form method="post">
      Username: <input type="text" name="username" />
      <br />
      Password: <input type="password" name="password" />
      <br />
      <input type="submit" />
    </form>
  </body>
</html>
