package com.forumpost.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import com.forum.model.ForumVO;
import com.forumpostcomment.model.ForumPostCommentVO;
import com.forumpostpic.model.ForumPostPicVO;
import com.forumpostreport.model.ForumPostReportVO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "forumpost")
public class ForumPostVO implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "POST_ID", updatable = false)
	private Integer postId;
	
	@Column(name = "MEM_ID", updatable = false)
	private Integer memId;
	
	@ManyToOne
	@JoinColumn(name = "FORUM_ID", referencedColumnName = "FORUM_ID")
	private ForumVO forumVO;
	
//	@Column(name = "FORUM_ID", updatable = false)
//	private Integer forumId;
	
	@Column(name = "POST_TITLE")
	private String postTitle;
	
	@Column(name = "POST_CONTENT")
	private String postContent;
	
	@Column(name = "POST_PIC", columnDefinition = "longblob")
	private byte[] postPic;
	
	@Column(name = "CREATED_AT", insertable = false, updatable = false)
	private Timestamp createdAt;
	
	@Column(name = "LAST_EDITED_AT", insertable = false)
	private Timestamp lastEditedAt;
	
	@Column(name = "POST_STATUS", insertable = false)
	private Integer postStatus;
	
	@OneToMany(mappedBy = "forumPostVO")
	@OrderBy("picId asc")
	private Set<ForumPostPicVO> forumPostPicVO;
	
	@OneToMany(mappedBy = "forumPostVO")
	@OrderBy("commentId asc")
	private Set<ForumPostCommentVO> forumPostCommentVO;
	
	@OneToMany(mappedBy = "forumPostVO", cascade = CascadeType.REFRESH)
	@OrderBy("reportId asc")
	private Set<ForumPostReportVO> forumPostReportVO;
	
//	@ManyToMany
//	@JoinTable(
//			   name = "forumpostcollection",
//			   joinColumns = { @JoinColumn( name = "POST_ID", referencedColumnName = "POST_ID" ) },
//			   inverseJoinColumns = { @JoinColumn( name = "MEM_ID", referencedColumnName = "MEM_ID") }
//			  )
//	private Set<> members;
	
	public ForumPostVO() {
		super();
	}
	
	public Set<ForumPostReportVO> getForumPostReportVO() {
		return forumPostReportVO;
	}

	public void setForumPostReportVO(Set<ForumPostReportVO> forumPostReportVO) {
		this.forumPostReportVO = forumPostReportVO;
	}

	public Set<ForumPostCommentVO> getForumPostCommentVO() {
		return forumPostCommentVO;
	}

	public void setForumPostCommentVO(Set<ForumPostCommentVO> forumPostCommentVO) {
		this.forumPostCommentVO = forumPostCommentVO;
	}
	
	public Set<ForumPostPicVO> getForumPostPicVO() {
		return forumPostPicVO;
	}

	public void setForumPostPicVO(Set<ForumPostPicVO> forumPostPicVO) {
		this.forumPostPicVO = forumPostPicVO;
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
	
//	public Integer getForumId() {
//		return forumId;
//	}
	
//	public void setForumId(Integer forumId) {
//		this.forumId = forumId;
//	}
	
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
	
	public ForumVO getForumVO() {
		return forumVO;
	}

	public void setForumVO(ForumVO forumVO) {
		this.forumVO = forumVO;
	}
	
}
