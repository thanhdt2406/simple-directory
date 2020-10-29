<%--
  Created by IntelliJ IDEA.
  User: PShynn
  Date: 10/29/2020
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  </head>
  <body>
  <div class="container">
    <h1>Vietnamese Dictionary</h1>
    <form method="get" action="/translate">
      <div class="row">
        <div class="col">
          <input type="text" class="form-control" name="inputWord" placeholder="Input here...">
        </div>
        <div class="col">
          <input class="form-control" type="text" name="resultWord" placeholder="Result" readonly>
        </div>
      </div>
      <input class="btn btn-primary" style="margin-top: 10px" type="submit" value="Search">
    </form>
  </div>
  </body>
</html>
