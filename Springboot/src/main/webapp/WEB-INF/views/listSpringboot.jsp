<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="java.util.*, java.io.* "
    isELIgnored="false" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />

<%
request.setCharacterEncoding("UTF-8");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>

</head>
<body>

<table border="1" align="center" width="100%">
	<tr align="center" bgcolor="lightgreen">
	<td><b>아이디</b></td>
	<td><b>비밀번호</b></td>
	<td><b>이름</b></td>
	<td><b>이메일</b></td>
	<td><b>가입일</b></td>
	</tr>
	
<c:choose>
<c:when test="${membersList == null }">
<tr align="center">
	<td colspan="7" width="7%">
	<b>등록된 회원이 없습니다.</b>
	</td>
</tr>
</c:when>
<c:when test="${!empty membersList }">
<c:forEach var="member" items="${membersList }"  >
	<tr align ="center">
		<td>${member.id }</td>
		<td>${member.pwd }</td>
		<td>${member.name }</td>
		<td>${member.email }</td>
		<td>${member.joinDate }</td>
		
		
	</tr>
</c:forEach>
</c:when>
</c:choose>
</table>

</body>
</html>