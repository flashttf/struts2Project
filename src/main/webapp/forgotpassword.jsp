<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ForgotPassword</title>
</head>
<body>
<div align="center">
	<s:form action="forgotpasswordaction">
	   <table>
	   		<tr>
	   			<td>
	   				<h3>Forgot password</h3>
	   			</td>
	   			
	   		</tr>
	   		
	   		<tr>
	   			<td>
	   				<h5>Please Enter your registered Email.</h5>
	   			</td>
	   			
	   		</tr>
	   		
	   		<tr>
	   			
	   			   <s:textfield name="emailId" label="Email" required="required"></s:textfield>
	   			
	   		</tr>
	   		<tr>
	   			<td align="center">
	   				<input type="submit" value="Send-Email">
	   			</td>
	   		</tr>
	   		
	   </table>				
	</s:form>
</div>
</body>
</html>