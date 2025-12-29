<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ page import="java.util.*"%>
<%@ page import="com.forum.model.*"%>    

<%
ForumService forumSvc = new ForumService();
List<ForumVO> forumList = forumSvc.getAll();
pageContext.setAttribute("forumList", forumList);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>後台所有討論區 - listAllForum.jsp</title>

<style type="text/css">
	.table {
    	table-layout: fixed;
 	}

	.table th, .table td {
	    white-space: nowrap;
	    text-overflow: ellipsis;
	    vertical-align: middle;
	}
</style>
</head>
<body>

<%-- 錯誤表列 --%>
<c:if test="${not empty errorMsgs}">
	<font style="color:red">提示:</font>
	<ul>
		<c:forEach var="message" items="${errorMsgs}">
			<li style="color:red">${message}</li>
		</c:forEach>
	</ul>
</c:if>



<table class="table" style="text-align:center; width: 70%;">
	<tr>
		<th>討論區編號</th>
		<th>討論區照片</th>
		<th>討論區名稱</th>
		<th>建立時間</th>
		<th>狀態</th>
		<th>更新</th>
		<th>啟用</th>
		<th>停用</th>
	</tr>
	
	<c:forEach var="forumVO" items="${forumList}">
		<tr>
			<td>${forumVO.forumId}</td>
			<td><img src="<%=request.getContextPath()%>/forum/picture.do?forumId=${forumVO.forumId}"
				style="max-width:320px; max-height:100px; object-fit:cover;">
			</td>
			<td>${forumVO.forumName}</td>
			<td>
				<fmt:formatDate value="${forumVO.createdAt}" pattern="yyyy-MM-dd HH:mm:ss"/>
			</td>
			<td>${forumVO.forumStatus}</td>
			<td>
				<form method="post" action="<%=request.getContextPath()%>/forum/forum.do" style="margin-bottom: 0px;">
					<input type="submit" value="更新">
					<input type="hidden" name="forumId" value="${forumVO.forumId}">
					<input type="hidden" name="action" value="getOneForUpdate">
				</form>
			</td>
			<td>
				<form method="post" action="<%=request.getContextPath()%>/forum/forum.do" style="margin-bottom: 0px;">
					<input type="submit" value="啟用">
					<input type="hidden" name="forumId" value="${forumVO.forumId}">
					<input type="hidden" name="forumStatus" value="${forumVO.forumStatus}">
					<input type="hidden" name="action" value="getForumIdForActive">
				</form>
			</td>
			<td>
				<FORM method="post" action="<%=request.getContextPath()%>/forum/forum.do" style="margin-bottom: 0px;">
			    	<input type="submit" value="停用">
			    	<input type="hidden" name="forumId" value="${forumVO.forumId}">
			    	<input type="hidden" name="forumStatus" value="${forumVO.forumStatus}">
			    	<input type="hidden" name="action" value="getForumIdForDisable">
			    </FORM>
			</td>
		</tr>
	</c:forEach>
</table>

<h1>討論區</h1>
<ul>
<li><a href="<%=request.getContextPath()%>/back_end/forum/addForum.jsp">新增</a></li>
</ul>

</body>
</html>