package com.forumpostcomment.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class ForumPostCommentVO implements Serializable{
	
	private Integer commentId;
	private Integer memId;
	private Integer postId;
	private String commentContent;
	private byte[] commentPic;
	private Timestamp createdAt;
	private Timestamp lastEditedAt;
	private Integer commentStatus;
	
	public ForumPostCommentVO() {
		super();
	}

	public ForumPostCommentVO(Integer commentId, Integer memId, Integer postId, String commentContent,
			byte[] commentPic, Timestamp createdAt, Timestamp lastEditedAt, Integer commentStatus) {
		super();
		this.commentId = commentId;
		this.memId = memId;
		this.postId = postId;
		this.commentContent = commentContent;
		this.commentPic = commentPic;
		this.createdAt = createdAt;
		this.lastEditedAt = lastEditedAt;
		this.commentStatus = commentStatus;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public byte[] getCommentPic() {
		return commentPic;
	}

	public void setCommentPic(byte[] commentPic) {
		this.commentPic = commentPic;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getLastEditedAt() {
		return lastEditedAt;
	}

	public void setLastEditedAt(Timestamp lastEditedAt) {
		this.lastEditedAt = lastEditedAt;
	}

	public Integer getCommentStatus() {
		return commentStatus;
	}

	public void setCommentStatus(Integer commentStatus) {
		this.commentStatus = commentStatus;
	}
	
}
