package com.forumpost.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class ForumPostVO implements Serializable{
	
	private Integer postId;
	private Integer memId;
	private Integer forumId;
	private String postTitle;
	private String postContent;
	private byte[] postPic;
	private Timestamp createdAt;
	private Timestamp lastEditedAt;
	private Integer postStatus;
	
	public ForumPostVO() {
		super();
	}
	
	public ForumPostVO(Integer postId, Integer memId, Integer forumId, String postTitle, String postContent,
			byte[] postPic, Timestamp createdAt, Timestamp lastEditedAt, Integer postStatus) {
		super();
		this.postId = postId;
		this.memId = memId;
		this.forumId = forumId;
		this.postTitle = postTitle;
		this.postContent = postContent;
		this.postPic = postPic;
		this.createdAt = createdAt;
		this.lastEditedAt = lastEditedAt;
		this.postStatus = postStatus;
	}

	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public Integer getMemId() {
		return memId;
	}
	public void setMemId(Integer memId) {
		this.memId = memId;
	}
	public Integer getForumId() {
		return forumId;
	}
	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public byte[] getPostPic() {
		return postPic;
	}
	public void setPostPic(byte[] postPic) {
		this.postPic = postPic;
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
	public Integer getPostStatus() {
		return postStatus;
	}
	public void setPostStatus(Integer postStatus) {
		this.postStatus = postStatus;
	}
	
}
