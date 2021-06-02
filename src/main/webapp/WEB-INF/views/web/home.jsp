<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Home Page</title>

</head>

<body>


<h1>Danh sach cac hoat dong</h1>
	<table>
	

		<c:forEach var="action" items="${listAction}">
			
			<tr style="border: 1px black solid">
				<td>${action.msv}</td>
				<td>${action.dangky}</td>
				<td>${action.timedangky}</td>
				<td>${action.timehuydangky}</td>
				 <td>${action.hoatdong.id_hoatdong}</td> 
				
				<td><button >dang ki</button></td>
			
			</tr>
		
		</c:forEach>
	
	</table>
</body>

</html>