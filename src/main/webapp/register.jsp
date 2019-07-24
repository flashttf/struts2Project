<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registeration</title>
</head>
<body>
	<div align="center">
		<s:form action="register">
			<table>
<tr>
	<td>
		<h1 style="color: green">Register Page</h1>
	</td>
</tr>
  <tr>
    <td>
    <s:textfield name="userName" label="Name" required="required"></s:textfield>
    </td>
  </tr>
  <tr>
    <td>
    <s:textfield name="emailId" label="Email"  required="required"></s:textfield>
    </td>
  </tr>
  <tr>
    <td>
    <s:textfield name="phoneNumber" label="Phone-Number"  required="required"></s:textfield>
    </td>
  </tr>
  <tr>
    <td>
    <s:textfield name="password" label="Password"  required="required"></s:textfield>
    </td>
  </tr>
  <tr>
  	<td align="center"><input type="submit" value="Submit Form"></td>
  	<td align="center"><input type="reset" value="Reset Form"></td>
  </tr>
</table>

		</s:form>	
	</div>
	
	
</body>
</html>