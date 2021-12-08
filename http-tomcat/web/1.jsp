<%@ page import="com.yjl.domain.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yjl
  Date: 2021/12/3
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
  request.setAttribute("name","yjl");
%>

test:${name}


<%
    User user=new User("hh");
    user.setName("123456");
    HttpSession session1 = request.getSession();
    session1.setAttribute("User",user);

%>


<%
    List<User> list=new ArrayList<>();
    list.add(new User("YJL"));
    list.add(new User("13"));
    list.add(new User("YJ1"));
    list.add(new User("13565"));
    list.add(new User("Y545"));
    list.add(new User("13212"));
%>

<c:forEach var="User" items="list">
    ${list.name}
</c:forEach>

</body>
</html>
