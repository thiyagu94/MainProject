<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Theatre Details</title>
</head>
<style>
div.div1 {
	text-align: right;
	width: 300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px;
}
</style>
<body>
	<%
		String id = (String) session.getAttribute("theatreid");
		if (id == null) {
			response.sendRedirect("adminlogin.jsp");
		}
	%>
	<h1>Theatre Details</h1>
	<div class="div1">
		<html:form action="/theatredetails" focus="screenNumber">
			<table style="with: 50%">
				<tr>
					<td>THEATRE ID</td>

					<td><input type="text" name="theatreId"
						value="<%=session.getAttribute("theatreid")%>" /></td>
				</tr>
				<tr>
					<td>SCREEN NUMBER</td>
					<td><html:text property="screenNumber" styleId="screenNumber"></html:text>
					</td>
				</tr>
				<tr>
					<td>BOX SEATS</td>
					<td><html:text property="boxSeats" styleId="boxSeats"></html:text>
					</td>
				</tr>

				<tr>
					<td>GOLD SEATS</td>
					<td><html:text property="goldSeats" styleId="goldSeats"></html:text>
					</td>
				</tr>

				<tr>
					<td>SILVER SEATS</td>
					<td><html:text property="silverSeats" styleId="silverSeats"></html:text>
					</td>
				</tr>


			</table>
			<html:submit value="Submit" />
			<html:reset value="Clear" />
		</html:form>
	</div>
	<br />
	<br />
	<a href="<%=request.getContextPath()%>/Logout.action">Logout not
		working</a>
	<br>
	<br>
	<br>
	<html:link href="${pageContext.request.contextPath}/adminlogout.jsp"> Logout </html:link>
	<br>
	<br>
	<br>
</body>
</html>