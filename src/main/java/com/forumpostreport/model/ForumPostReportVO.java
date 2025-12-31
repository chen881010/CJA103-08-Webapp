package com.forumpostreport.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class ForumPostReportVO implements Serializable{
	
	private Integer reportId;
	private Integer memId;
	private Integer postId;
	private Integer reportType;
	private String reportReason;
	private Integer reportStatus;
	private Timestamp reportTime;
	private Timestamp handleTime;
	
	public ForumPostReportVO() {
		super();
	}

	public ForumPostReportVO(Integer reportId, Integer memId, Integer postId, Integer reportType, String reportReason,
			Integer reportStatus, Timestamp reportTime, Timestamp handleTime) {
		super();
		this.reportId = reportId;
		this.memId = memId;
		this.postId = postId;
		this.reportType = reportType;
		this.reportReason = reportReason;
		this.reportStatus = reportStatus;
		this.reportTime = reportTime;
		this.handleTime = handleTime;
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
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
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
