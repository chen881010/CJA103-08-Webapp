package com.forum.model;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "forum")
public class ForumVO implements Serializable{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FORUM_ID", updatable = false)
	private Integer forumId;
	
	@Column(name = "FORUM_NAME")
	private String forumName;
	
	@Column(name = "CREATED_AT", insertable = false, updatable = false)
	private Timestamp createdAt;
	
	@Column(name = "FORUM_PIC", columnDefinition = "longblob")
	private byte[] forumPic;
	
	@Column(name = "FORUM_STATUS", insertable = false)
	private Integer forumStatus;
	
	public ForumVO() {
		super();
	}
	
	public ForumVO(Integer forumId, String forumName, Timestamp createdAt, byte[] forumPic, Integer forumStatus) {
		super();
		this.forumId = forumId;
		this.forumName = forumName;
		this.createdAt = createdAt;
		this.forumPic = forumPic;
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
