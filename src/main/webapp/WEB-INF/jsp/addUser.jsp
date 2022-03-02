<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>add</title>
    <%--BootStrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/user/addUser" method="post">
      <div class="form-group">
        <label>id</label>
        <input type="text" class="form-control" name="id" placeholder="id">
      </div>
      <div class="form-group">
          <label>name</label>
          <input type="text" class="form-control" name="name" placeholder="name">
        </div>
      <div class="form-group">
          <label>Password</label>
          <input type="text" class="form-control" name="pwd" placeholder="Password">
        </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
</body>
</html>