<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of For Sale Cars</title>
<style>
    h1 { color: red; }
    .fieldname {color: blue; }
  </style>
</head>
<body>
<center><h1>Welcome to Key West Car Dealership</h1></center>
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td><b><font color="blue">Car Make</font></b></td>
				<td>${item.carmake}</td>
			</tr>
			<tr>
				<td><b><font color="blue">Car Model</font></b></td>
				<td>${item.carmodel}</td>
			</tr>
			<tr>
				<td><b><font color="blue">Car Year</font></b></td>
				<td>${item.caryear}</td>
			</tr>
			<tr>
				<td><b><font color="blue">Salvage Title</font></b></td>
				<td>${item.salvagetitle}</td>
			</tr>
			
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	<center>
		<a href = "frontpage.mvc"><input type = "submit" value="Add New Car to List"></a>
	</center>
</body>
</html>