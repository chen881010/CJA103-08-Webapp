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
<title>討論區新增 - addForum.jsp</title>
</head>
<body>
	<table>
		<h1>
			<a href="<%=request.getContextPath()%>/back_end/forum/listAllForum.jsp">回首頁</a>
		</h1>
	</table>
	<h2>新增討論區:</h2>

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
				<td>討論區名稱:</td>
				<td><input type="TEXT" name="forumName"
					value="${forumVO.forumName}" size="45" /></td>
			</tr>
			<tr>
				<td>討論區照片:</td>
				<td>
					<input type="file" id="forumPic" name="forumPic" value="${forumVO.forumPic}" />
				</td>
			</tr>
		</table>

		<br> 
		<input type="hidden" name="action" value="insertForum">
		<input type="hidden" name="forumId" value="${forumVO.forumId}">
		<input type="submit" value="確認">
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