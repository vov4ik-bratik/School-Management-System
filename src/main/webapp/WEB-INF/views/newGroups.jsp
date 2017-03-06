<%--
  Created by IntelliJ IDEA.
  User: vs
  Date: 14.11.2016
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Groups

<%-- ${groups} --%>

<form action="createGroups" method="post">
    <input name="groupsNumber" placeholder="groups number">
    <br>
    <input name="subGroups" placeholder="groups subgroup">
    <br>
    <button>save groups</button>
</form>

</body>
</html>
