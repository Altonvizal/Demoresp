<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="sum">
  a:<input type="text" name="a"><br>
  b:<input type="text" name="b"><br>
  <input type="submit">
  </form>
  <% if(request.getAttribute("sum")!=null){ %>
  <%int sum= (int)request.getAttribute("sum"); %>
  <h1>The sum is <%=sum %></h1>
  <% }%>

</body>
</html>