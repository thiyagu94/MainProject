<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
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
	<h1>User Sign up Form</h1>
	<div class="ex">
		<html:form focus="userRegistration" action="/registration">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><html:text property="firstName" styleId="firstName"/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><html:text property="lastName" styleId="LastName"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><html:password property="password" styleId="Password"/></td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td><html:text property="contact" styleId="Contact"/></td>
				</tr>
				<tr>
					<td>HintQuestion</td>
					<td><html:text property="hintQuestion" styleId="HintQuestion"/></td>
				</tr>
				<tr>
					<td>HintAnswer</td>
					<td><html:text property="hintAnswer" styleId="HintAnswer"/></td>
				</tr>
				<tr>
					<td>MailId</td>
					<td><html:text property="mailId" styleId="MailId"/></td>
				</tr>
<!-- 				<tr> -->
<!-- 					<td>UserId</td> -->
<%-- 					<td><html:text property="userId" styleId="UserId"/></td> --%>
<!-- 				</tr> -->
			</table>
			<html:submit value="Submit" />
        	<html:reset value="Clear" />
		</html:form>
	</div>
</body>
</html>