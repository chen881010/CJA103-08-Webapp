package com.forum.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class ForumVO implements Serializable{
	
	private Integer forumId;
	private String forumName;
	private Timestamp createdAt;
	private byte[] forumPic;
	private Integer forumStatus;
	
	public ForumVO() {
		super();
	}
	
	public ForumVO(Integer forumId, String forumName, Timestamp createdAt, Integer forumStatus) {
		super();
		this.forumId = forumId;
		this.forumName = forumName;
		this.createdAt = createdAt;
		this.forumStatus = forumStatus;
	}

	public Integer getForumId() {
		return forumId;
	}
	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}
	public String getForumName() {
		return forumName;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Integer getForumStatus() {
		return forumStatus;
	}
	public void setForumStatus(Integer forumStatus) {
		this.forumStatus = forumStatus;
	}

	public byte[] getForumPic() {
		return forumPic;
	}

	public void setForumPic(byte[] forumPic) {
		this.forumPic = forumPic;
	}
	
}
