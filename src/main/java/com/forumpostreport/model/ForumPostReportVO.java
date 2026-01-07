package com.forumpostreport.model;

import java.io.Serializable;
import java.sql.Timestamp;

import com.forumpost.model.ForumPostVO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "forumpostreport")
public class ForumPostReportVO implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REPORT_ID", updatable = false)
	private Integer reportId;
	
	@Column(name = "MEM_ID", updatable = false)
	private Integer memId;
	
	@ManyToOne
	@JoinColumn(name = "POST_ID", referencedColumnName = "POST_ID")
	private ForumPostVO forumPostVO;
	
//	@Column(name = "POST_ID", updatable = false)
//	private Integer postId;
	
	@Column(name = "REPORT_TYPE")
	private Integer reportType;
	
	@Column(name = "REPORT_REASON")
	private String reportReason;
	
	@Column(name = "REPORT_STATUS", insertable = false)
	private Integer reportStatus;
	
	@Column(name = "REPORT_TIME", insertable = false)
	private Timestamp reportTime;
	
	@Column(name = "HANDLE_TIME", insertable = false)
	private Timestamp handleTime;
	
	public ForumPostReportVO() {
		super();
	}

	public ForumPostVO getForumPostVO() {
		return forumPostVO;
	}

	public void setForumPostVO(ForumPostVO forumPostVO) {
		this.forumPostVO = forumPostVO;
	}

	public Integer getReportId() {
		return reportId;
	}
	
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}
	
	public Integer getMemId() {
		return memId;
	}
	
	public void setMemId(Integer memId) {
		this.memId = memId;
	}
	
//	public Integer getPostId() {
//		return postId;
//	}
	
//	public void setPostId(Integer postId) {
//		this.postId = postId;
//	}
	
	public Integer getReportType() {
		return reportType;
	}
	
	public void setReportType(Integer reportType) {
		this.reportType = reportType;
	}
	
	public String getReportReason() {
		return reportReason;
	}
	
	public void setReportReason(String reportReason) {
		this.reportReason = reportReason;
	}
	
	public Integer getReportStatus() {
		return reportStatus;
	}
	
	public void setReportStatus(Integer reportStatus) {
		this.reportStatus = reportStatus;
	}
	
	public Timestamp getReportTime() {
		return reportTime;
	}
	
	public void setReportTime(Timestamp reportTime) {
		this.reportTime = reportTime;
	}
	
	public Timestamp getHandleTime() {
		return handleTime;
	}
	
	public void setHandleTime(Timestamp handleTime) {
		this.handleTime = handleTime;
	}
	
}
