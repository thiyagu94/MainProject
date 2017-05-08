<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Movie Details</title>
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
	<h1>Movie Details</h1>
	<div class="div1">
		<html:form action="/moviedetails" focus="movieName">
			<table style="with: 50%">
				<tr>
					<td>Movie Name</td>
					<td><html:text property="movieName" styleId="MovieName"></html:text>
					</td>
				</tr>
				<tr>
					<td>Actor</td>
					<td><html:text property="actor" styleId="Actor"></html:text></td>
				</tr>
				<tr>
					<td>Actress</td>
					<td><html:text property="actress" styleId="Actress"></html:text>
					</td>
				</tr>
				<tr>
					<td>Director</td>
					<td><html:text property="director" styleId="Director"></html:text>
					</td>
				</tr>
				<tr>
					<td>Release Year</td>
					<td><html:text property="releaseYear" styleId="ReleaseYear"></html:text>
					</td>
				</tr>
				<tr>
					<td>Rated</td>
					<td><html:text property="rated" styleId="Rated"></html:text></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><html:textarea property="description" styleId="Description"></html:textarea></td>
				</tr>

			</table>
			<html:submit value="Submit" />
			<html:reset value="Clear" />
		</html:form>
	</div>
	<br>
	<br>
	<a href="login.jsp">LOGIN</a>
	<br>
	<br>
	<a href="theatredetails.jsp">Add Theatre Details</a>
</body>
</html>