<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.util.*"%>
<%@ page import="com.forum.model.*"%>

<%
ForumService forumSvc = new ForumService();
List<ForumVO> forumList = forumSvc.getAllActive();
pageContext.setAttribute("forumList", forumList);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>前台所有討論區 - listAllActiveForum.jsp</title>

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

	<%-- 錯誤表列 --%>
	<c:if test="${not empty errorMsgs}">
		<font style="color: red">提示:</font>
		<ul>
			<c:forEach var="message" items="${errorMsgs}">
				<li style="color: red">${message}</li>
			</c:forEach>
		</ul>
	</c:if>

	<form method="post"
		action="<%=request.getContextPath()%>/forum/forum.do"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>關鍵字搜尋:</td>
				<td>
					<input type="TEXT" name="forumName" placeholder="請輸入討論區關鍵字" size="30" />
					<input type="submit" value="查詢">
					<input type="hidden" name="action" value="getForumNameForDisplay">
				</td>
			</tr>
		</table>
	</form>
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

</body>
</html>