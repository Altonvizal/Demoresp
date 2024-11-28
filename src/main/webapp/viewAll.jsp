<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="view">
		<table>
			<thead>
				<tr>
					<th>id</th>
					<th>brand</th>
					<th>price</th>
					<th>discount</th>

				</tr>


			</thead>
			<%
			ResultSet rs = (ResultSet) request.getAttribute("product");
			%>
			<%
			int id = 1;
			%>
			<%
			while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getInt(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getDouble(3)%></td>
				<td><%=rs.getDouble(4)%></td>
				<%id++;%>
			</tr>
			<%
			}
			%>
			

		</table>



	</form>

</body>
</html>