<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<style>
    a{
        text-decoration:none;
        color:black;
        font-size:18px;
    }
    h3{
        width:180px;
        height:38px;
        margin:100px auto;
        text-align:center;
        line-height:38px;
        background:deepskyblue;
        border-radius:5px;

    }
    </style>
<h2>Hello World!</h2>
<h3>
    <a href="${pageContext.request.contextPath}/user/allUser">进入</a>
</h3>
</body>
</html>