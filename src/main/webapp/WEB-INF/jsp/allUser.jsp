<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>hehe</title>
    <%--BootStrap美化界面--%>
    <%--<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">--%>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>列表-显示所有数据</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
                <%--toAddUser--%>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/toAddUser">新增</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/allUser">显示全部</a>
            </div>
            <div class="col-md-8 column">
                <%--查询--%>
                <form class="form-inline" action="${pageContext.request.contextPath}/user/query" method="post" style="float: right">
                    <span style="color:red;font-weight:bold">${error}</span>
                    <input type="text" name="queryName" class="form-control" placeholder="请输入要查询的名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>

    </div>
    <div class="row clearfix">
        <div class="col-md-12 colmun">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>编号</th>
                        <th>名称</th>
                        <th>密码</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <%--从数据库中查出来--%>
                <tbody>
                    <c:forEach var="user" items="${list}" >
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.pwd}</td>
                            <td>
                            <a href="${pageContext.request.contextPath}/user/toModifyUser?id=${user.id}">修改</a>
                            &nbsp; | &nbsp;
                            <a href="${pageContext.request.contextPath}/user/deleteUser?id=${user.id}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>