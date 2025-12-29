<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.util.*"%>
<%@ page import="com.forum.model.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>前台關鍵字搜尋 - listAllActiveForumByKeyword.jsp</title>

<style type="text/css">
.table {
	table-layout: fixed;
}

.table th, .table td {
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
	vertical-align: middle;
}
</style>
</head>

<body>
	
	<table class="table" style="text-align: center; width: 70%;">
		<tr>
			<th>討論區照片</th>
			<th>討論區名稱</th>
			<th>建立時間</th>
		</tr>
		<c:forEach var="forumVO" items="${forumList}">
			<tr>
				<td><img
					src="<%=request.getContextPath()%>/forum/picture.do?forumId=${forumVO.forumId}"
					style="max-width: 320px; max-height: 100px; object-fit: cover;">
				</td>
				<td>${forumVO.forumName}</td>
				<td>
					<fmt:formatDate value="${forumVO.createdAt}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
			</tr>
		</c:forEach>
	</table>

	<h1>
		<a href="<%=request.getContextPath()%>/front_end/forum/listAllActiveForum.jsp">回首頁</a>
	</h1>
	
</body>
</html>