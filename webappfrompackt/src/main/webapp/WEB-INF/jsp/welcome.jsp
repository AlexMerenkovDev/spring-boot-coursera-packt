<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <link rel="stylesheet" href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" />
    <title>Welcome Page</title>
  </head>

  <body>
    <div class="container">
      <h1>Welcome ${username}</h1>
      <a href="/todos-list">manage</a> your Todos
    </div>
    <script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
    <script src="webjars\jquery\3.6.0\jquery.min.js"></script>
  </body>

  </html>