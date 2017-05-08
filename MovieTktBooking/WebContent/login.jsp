<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<script>
        function CheckAndSubmit () {
        	
            var userName = document.getElementById("userName").value;
            var password = document.getElementById("password").value;
            if (userName.length < 6 || userName.length > 14 || isSpclChar()) {
                alert ("  User Name should not have special characters and minimum of 6 Characters & Max of 14 Characters length.");
                return false;
            }
            if (!checkPassword() || password.length > 14) {
                alert ("Password should be combination of Alphabets, Numbers with minimum of 6 Characters & Max of 14 Characters length.");
                return false;
            }
 
            return true;
        }
        function isSpclChar(){
        	//alert("special char valid")
        	   var iChars = "!@#$%^&*()+=-[]\\\';,./{}|\":<>?";
        	   var userName = document.getElementById("userName").value;
        	   if( userName.indexOf(iChars) != -1) {
        	     return true;
        	   }
        	   return false;
        	}
        function checkPassword()
        {
        	var password = document.getElementById("password").value;
          var re = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;
          return re.test(password);
        }
    </script>
</head>
<body>
    <html:form action="/login" >
    <logic:present name="errorList"> 
    	<logic:iterate id="error" name="errorList"> 
    		<p style="color:red"><bean:write name="error"/></p> 
   		</logic:iterate> 
	</logic:present>
    Username : <html:text property="userName" styleId="userName"/>
        <br>
    Password : <html:password property="password" styleId="password"/>
        <br>
        <html:submit value="login" />
        <html:reset value="Clear" />
        
    </html:form>
 <html:link href="${pageContext.request.contextPath}/registration.jsp"> registration </html:link>
 <br><br><br>
 <html:link href="${pageContext.request.contextPath}/add.jsp">  add </html:link>
 <br><br><br>
 <html:link href="${pageContext.request.contextPath}/theatreregistration.jsp">  theatre registration </html:link>
<br><br>
<html:link href="${pageContext.request.contextPath}/theatredetails.jsp"> Add Theatre Details</html:link>
<br><br>
<html:link href="${pageContext.request.contextPath}/adminlogin.jsp"> Admin Login</html:link>

</body>
</html>