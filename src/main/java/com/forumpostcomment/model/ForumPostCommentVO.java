package com.forumpostcomment.model;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "forumpostcomment")
public class ForumPostCommentVO implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMMENT_ID", updatable = false)
	private Integer commentId;
	
	@Column(name = "MEM_ID", updatable = false)
	private Integer memId;
	
	@Column(name = "POST_ID", updatable = false)
	private Integer postId;
	
	@Column(name = "COMMENT_CONTENT")
	private String commentContent;
	
	@Column(name = "COMMENT_PIC", columnDefinition = "longblob")
	private byte[] commentPic;
	
	@Column(name = "CREATED_AT", updatable = false, insertable = false)
	private Timestamp createdAt;
	
	@Column(name = "LAST_EDITED_AT", insertable = false)
	private Timestamp lastEditedAt;
	
	@Column(name = "COMMENT_STATUS", insertable = false)
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
