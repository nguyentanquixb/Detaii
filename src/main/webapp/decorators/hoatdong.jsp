<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <a href="<c:url value="/customer-list" />" >List Customer</a><br />
  <h1>View hoatdong:</h1>  
  HoatDong tenhoatdong: ${hoatdong.tenhoatdong} <br/>
  HoatDong noidung: ${hoatdong.noidung} <br/>
  HoatDong ngaybatdau: ${hoatdong.ngaybatdau} <br/>
</body>
</html>