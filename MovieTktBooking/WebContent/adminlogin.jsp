<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<html:form action="/adminLogin" focus="emailId">
	<div>
		<html:errors/>	
	</div>
	
		<logic:present name="errorList">
			<logic:iterate id="error" name="errorList">
				<p style="color: red">
					<bean:write name="error" />
				</p>
			</logic:iterate>
		</logic:present>
	Email Id : <html:text property="emailId" style="emailId"></html:text>
		<br> 
	Password : <html:password property="password" style="password"></html:password>
		<br>
		<br>
		<html:submit value="login" />
		<html:reset value="Clear" />

	</html:form>
<br><br><br>
 <html:link href="${pageContext.request.contextPath}/theatreregistration.jsp">  theatre registration </html:link>
<br><br>
<html:link href="${pageContext.request.contextPath}/theatredetails.jsp"> Add Theatre Details</html:link>
<br><br>
<html:link href="${pageContext.request.contextPath}/movie.jsp"> Add movie Details</html:link>
<br><br>
</body>
</html>