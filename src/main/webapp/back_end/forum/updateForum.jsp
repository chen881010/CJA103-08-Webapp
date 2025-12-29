<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.forum.model.*"%>

<%
ForumVO forumVO = (ForumVO) request.getAttribute("forumVO");
%>


<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>討論區資料更新 - updateForum.jsp</title>
</head>


<body>
	<table>
		<h1>
			<a href="<%=request.getContextPath()%>/back_end/forum/listAllForum.jsp">回首頁</a>
		</h1>
	</table>
	<h2>討論區更新:</h2>

	<%-- 錯誤表列 --%>
	<c:if test="${not empty errorMsgs}">
		<font style="color: red">提示:</font>
		<ul>
			<c:forEach var="message" items="${errorMsgs}">
				<li style="color: red">${message}</li>
			</c:forEach>
		</ul>
	</c:if>

	<form id="forumForm" method="post"
		action="<%=request.getContextPath()%>/forum/forum.do"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>討論區編號:</td>
				<td>${forumVO.forumId}</td>
			</tr>
			<tr>
				<td>討論區照片:</td>
				<td>
					<input type="file" id="forumPic" name="forumPic" value="${forumVO.forumPic}" />
				</td>
			</tr>
			<tr>
				<td>討論區名稱:</td>
				<td>
					<input type="TEXT" name="forumName" value="${forumVO.forumName}" size="45" />
				</td>
			</tr>
			<%-- 
			<tr>
				<td>建立時間:</td>
				<td>${forumVO.createdAt}</td>
			</tr>
			<tr>
				<td>討論區狀態:</td>
				<td>${forumVO.forumStatus}</td>
			</tr>
		--%>
		</table>

		<br>
		<input type="hidden" name="action" value="updateForum">
		<input type="hidden" name="forumId" value="${forumVO.forumId}">
		<input type="submit" value="送出更新">
	</FORM>

<script type="text/javascript">
	document.getElementById("forumForm").addEventListener("submit", function(e) {
    var input = document.getElementById("forumPic");
    var maxSize = 1 * 1024 * 1024;

	    if (input.files && input.files[0]) {
	        if (input.files[0].size > maxSize) {
	            alert("圖片過大，請選擇小於 1MB 的檔案");
	            
	            e.preventDefault();     
	        }
	    }
	});
</script>
</body>
</html>