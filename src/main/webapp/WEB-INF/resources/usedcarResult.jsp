<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Key West Car Dealership</title>
<style>
    h1 { color: red; }
    .fieldname {color: blue; }
  </style>
</head>
<body>
	<center>
	<h1>Key West's Car for Sale</h1>
	<table>
		<tr>
			<td><b><font color="blue">Car Make</font></b></td>
			<td>${u.carmake}</td>
		</tr>
		<tr>
			<td><b><font color="blue">Car Model</font></b></td>	
			<td>${u.carmodel}</td>
		</tr>
		<tr>
			<td><b><font color="blue">Car Year</font></b></td>
			<td>${u.caryear}</td>
		</tr>
		<tr>
			<td><b><font color="blue">Salvage Title</font></b></td>
			<td>${u.salvagetitle}</td>
		</tr>
		
	</table>
		<a href = "frontpage.mvc"><input type = "submit" value="Add Car to List"></a>
		<a href = "viewAll.mvc"><input type = "submit" value="View For Sale Cars"></a>
	</center>
</body>
</html>