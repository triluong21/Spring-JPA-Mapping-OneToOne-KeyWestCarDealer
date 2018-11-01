<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Key West Car Dealer</title>
</head>
<style>
    h1 { color: red; }
    .fieldname {color: blue; }
  </style>
</head>
<body>
	<center><h1>Welcome to Key West Car Dealership</h1></center>
	<mvc:form modelAttribute="usedcar" action="result.mvc">
		<center>
		<table>
			<tr>
				<td><mvc:label path="carmake" class="fieldname"><b>Car Make</b></mvc:label></td>
				<td><mvc:select path="carmake" items="${carmakes}" /></td>
			</tr>
			<tr>
				<td><mvc:label path="carmodel" class="fieldname"><b>Car Model</b></mvc:label></td>
				<td><mvc:input path="carmodel" /></td>
			</tr>
			<tr>
				<td><mvc:label path="caryear" class="fieldname"><b>Car Year</b></mvc:label></td>
				<td><mvc:select path="caryear" items="${caryears}"/></td>
			</tr>
			<tr>
				<td><mvc:label path="salvagetitle" class="fieldname"><b>Salvage Title</b></mvc:label></td>
				<td><mvc:radiobuttons path="salvagetitle" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td> 
			</tr>
		</table>
		</center>
	</mvc:form>
	<center>
		<a href = "viewAll.mvc"><input type = "submit" value="View All Car"></a>
	</center>
</body>
</html>