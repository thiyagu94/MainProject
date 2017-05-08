<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Theatre Admin details</title>
</head>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>Theatre Registration Form</h1>
	<div class="ex">
		<html:form focus="TheatreAdmin" action="/theatreregistration">
			<table style="with: 50%">
				<!-- 			<tr> -->
				<!-- 				<td>THEATREID</td> -->
				<%-- 				<td><html:text property="theatreId" styleId="theatreId" /></td> --%>
				<!-- 			</tr> -->

				<tr>
					<td>THEATRENAME</td>
					<td><html:text property="theatreName" styleId="theatreName" /></td>
				</tr>
				<tr>
					<td>LOCATION</td>
					<td><html:text property="location" styleId="location" /></td>
				</tr>
				<tr>
					<td>OWNERNAME</td>
					<td><html:text property="ownerName" styleId="ownerName" /></td>
				</tr>
				<tr>
					<td>MOBILENUMBER</td>
					<td><html:text property="mobileNumber" styleId="mobileNumber" /></td>
				</tr>
				<tr>
					<td>EMAILID</td>
					<td><html:text property="emailId" styleId="emailId" /></td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td><html:password property="password" styleId="password" /></td>
				</tr>

			</table>
			<html:submit value="Submit" />
			<html:reset value="Clear" />
		</html:form>
	</div>
</body>
</html>