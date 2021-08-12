<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Table User</h2>
  <a href="/create" type="button" class="btn btn-outline-primary">Create</a>
  <table class="table">
    <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Date of birth</th>
      <th>address</th>
      <th>PhoneNumber</th>
      <th>email</th>
      <th>classroom</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${requestScope.List}" var="User" varStatus="loop">
      <tr>
        <td>${User.id}</td>
        <td>${User.name}</td>
        <td>${User.dateofbirth}</td>
        <td>${User.address}</td>
        <td>${User.phonenumber}</td>
        <td>${User.email}</td>
        <td>${User.classroom}</td>

        <td> <a href="/remove?index=${loop.index}" type="button" class="btn btn-outline-primary">remove</a></td>
        <td> <a href="/edit?index=${loop.index}" type="button" class="btn btn-outline-primary">edit</a></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>