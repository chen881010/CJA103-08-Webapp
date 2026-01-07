package com.forum.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import com.forumpost.model.ForumPostVO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
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
	
	@OneToMany(mappedBy = "forumVO", cascade = CascadeType.REFRESH)
	@OrderBy("postId desc")
	private Set<ForumPostVO> forumPostVO;
	
	public ForumVO() {
		super();
	}

	public Set<ForumPostVO> getForumPostVO() {
		return forumPostVO;
	}

	public void setForumPostVO(Set<ForumPostVO> forumPostVO) {
		this.forumPostVO = forumPostVO;
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
