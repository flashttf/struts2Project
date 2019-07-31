<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
 <div align="center">
		<s:form action="login">
			<table>
<tr>
	<td>
		<h1 style="color: green">Login Page</h1>
	</td>
</tr>
  
  <tr>
    <td>
    <s:textfield name="emailId" label="Email"  required="required"></s:textfield>
    </td>
  </tr>
  <tr>
    <td>
    <s:textfield name="password" label="Password"  required="required"></s:textfield>
    </td>
  </tr>
  <tr>
  	<td ><input type="submit" value="Submit Form"></td>
  	<td ><input type="reset" value="Reset Form"></td>
  </tr>
</table>

		</s:form>	
		
		
  	<div>
  	<table>
  	<tr>
  	<td>
  	<a href="forgotpassword.jsp"><input type="submit" value="Forgot Password"></a>
  	</td>
  	<td>
  	<a href="register.jsp"><input type="submit" value="Register"></a>
  	</td>
  	</tr>
  	</table>
  </div>
	</div>
</body>
</html>